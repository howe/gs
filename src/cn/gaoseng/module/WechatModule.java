package cn.gaoseng.module;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.nutz.dao.Dao;
import org.nutz.dao.Sqls;
import org.nutz.dao.sql.Sql;
import org.nutz.dao.sql.SqlCallback;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.Mvcs;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.GET;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.POST;

import cn.gaoseng.tool.EncoderHelper;

/**
 * www.gaoseng.cn 微信自动服务模块
 * 
 * @author yangq(qi.yang.cn@gmail.com) 2013-2-17
 */

@IocBean
public class WechatModule {

	private static final Log log = Logs.get();
	private Dao dao;
	private static String TOKEN = "b6c848973fa03845930136a60f67a3c7";
	/*
	 * 文字消息
	 */
	private static final String RESPONSE_TXT = "<xml><ToUserName><![CDATA[%s]]></ToUserName><FromUserName><![CDATA[%s]]></FromUserName><CreateTime>%s</CreateTime><MsgType><![CDATA[%s]]></MsgType><Content><![CDATA[%s]]></Content><FuncFlag>0</FuncFlag></xml>";
	/*
	 * 图文消息
	 */
	private static final String RESPONSE_IMAGE_TXT = "<xml><ToUserName><![CDATA[%s]]></ToUserName><FromUserName><![CDATA[%s]]></FromUserName><CreateTime>%s</CreateTime><MsgType><![CDATA[news]]></MsgType><ArticleCount>1</ArticleCount><Articles><item><Title><![CDATA[%s]]></Title> <Description><![CDATA[%s]]></Description><PicUrl><![CDATA[%s]]></PicUrl><Url><![CDATA[%s]]></Url></item></Articles><FuncFlag>1</FuncFlag></xml>";
	// 校验请求是否来自微信服务器
	@At("/wechat/gaoseng")
	@GET
	@Ok("raw")
	public String checkSignature(String signature, String timestamp, String nonce, String echostr) {

		String[] array = {TOKEN, timestamp, nonce};
		Arrays.sort(array);
		String tmp = Arrays.toString(array);

		tmp = tmp.substring(1, tmp.length() - 1);
		tmp = tmp.replaceAll(",", "");
		tmp = tmp.replaceAll("\\s*", "");

		tmp = EncoderHelper.encode("SHA1", tmp);

		// System.out.println("signature1:" + signature);
		// System.out.println("signature2:" + tmp);

		if (tmp.equals(signature)) {
			// System.out.println("ok~~~" + echostr);
			return echostr;
		}

		return "";
	}

	@At("/wechat/gaoseng")
	@POST
	@Ok("raw")
	public void responseMsg() throws IOException, DocumentException {

		SAXReader reader = new SAXReader();
		InputStream in = Mvcs.getReq().getInputStream();
		Document doc = reader.read(in);
		Element root = doc.getRootElement();

		String toUserName = root.elementText("ToUserName");// 开发者微信号
		String fromUserName = root.elementText("FromUserName");// 发送方帐号（一个OpenID）
		String createTime = root.elementText("CreateTime");// 消息创建时间 （整型）
		String msgType = root.elementText("MsgType");// 消息类型
		String content = root.elementText("Content");// 文本消息内容
		String msgId = root.elementText("MsgId");// 消息id，64位整型

//		System.out.println("fromUserName: " +fromUserName);
//		System.out.println("toUserName: " +toUserName);
		PrintWriter out = Mvcs.getResp().getWriter();

		/**
		 * The Dead Code begin
		 */
		if (content.toLowerCase().equals("qq") || content.equals("求签")) {

//			StringBuilder tmp = new StringBuilder();
//
//			Tianqi qianqi = new Tianqi();
//			qianqi = Qihou.queryTianqi("101221704");
//			System.out.print(qianqi.getCity());
//			tmp.append("施主 今年财运滚滚来[色]");
//			tmp.append("九华山实时温度: " + qianqi.getTemp());
//			tmp.append("  相对湿度: " + qianqi.getSd());
//			tmp.append("  风力情况: " + qianqi.getWd());
//			tmp.append("(" + qianqi.getWs() + ")");
//			tmp.append("  检测时间: " + qianqi.getTime());

			Date date = new Date();
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			
			Sql sql1 = Sqls.create("SELECT t.* FROM gs_qiuqian_result t WHERE t.openId = @OPENID AND t.createTime = @CREATETIME");
			sql1.params().set("CREATETIME", format.format(date).substring(0, 10));
			sql1.params().set("OPENID", fromUserName);
			sql1.setCallback(new SqlCallback() {
				public Object invoke(Connection conn, ResultSet rs, Sql sql1) throws SQLException {
					Map<String, String> map = new HashMap<String, String>();
					while (rs.next())
						map.put("qwid", rs.getString("qwid"));
					return map;
				}
			});
			dao.execute(sql1);	
			Map<String, String> map = sql1.getObject(HashMap.class);
			if (map.size() == 0){
				String qwId = cn.gaoseng.tool.Lottery.getLottery("1");
				Sql sql2 = Sqls.create("SELECT t.* FROM gs_qiuqian_qianwen t WHERE t.id=@ID");
				sql2.params().set("ID", qwId);

				Sql sql3 = Sqls.create("insert into gs_qiuqian_result(openId,createTime,qwId) Values(@OPENID,@CREATETIME,@QWID)");
				sql3.params().set("QWID", qwId);
				sql3.params().set("OPENID", fromUserName);
				sql3.params().set("CREATETIME", format.format(date).substring(0, 10));
				sql2.setCallback(new SqlCallback() {
					public Object invoke(Connection conn, ResultSet rs, Sql sql2) throws SQLException {
						Map<String, String> map1 = new HashMap<String, String>();
						while (rs.next()){
							map1.put("id", rs.getString("id"));
							map1.put("title", rs.getString("title"));
							map1.put("url", rs.getString("url"));
							map1.put("jieqian", rs.getString("jieqian"));
							map1.put("picurl", rs.getString("picurl"));
							map1.put("typeid", rs.getString("typeid"));
						}
						return map1;
					}
				});
				dao.execute(sql2, sql3);	
				Map<String, String> map1 = sql2.getObject(HashMap.class);
				if (map1.size() == 0){
					out.printf(	RESPONSE_TXT,
							fromUserName,
							toUserName,
							System.currentTimeMillis(),
							"text",
							"欢迎您访问高僧网[呲牙]   在线求签 请输入 qq或者求签");
				}else{
					
					out.printf(	RESPONSE_IMAGE_TXT,
							fromUserName,
							toUserName,
							System.currentTimeMillis(),
							map1.get("title"), 
							map1.get("jieqian"), 
							map1.get("picurl"),
							map1.get("url")
							);
				}
			}else{
				Sql sql4 = Sqls.create("SELECT t.* FROM gs_qiuqian_qianwen t WHERE t.id=@ID");
				sql4.params().set("ID", map.get("id"));
				sql4.setCallback(new SqlCallback() {
					public Object invoke(Connection conn, ResultSet rs, Sql sql4) throws SQLException {
						Map<String, String> map2 = new HashMap<String, String>();
						while (rs.next()){
							map2.put("id", rs.getString("id"));
							map2.put("title", rs.getString("title"));
							map2.put("url", rs.getString("url"));
							map2.put("jieqian", rs.getString("jieqian"));
							map2.put("picurl", rs.getString("picurl"));
							map2.put("typeid", rs.getString("typeid"));
						}
						return map2;
					}
				});
				dao.execute(sql4);	
				Map<String, String> map2 = sql4.getObject(HashMap.class);				
				if (map2.size() == 0){
					out.printf(	RESPONSE_TXT,
							fromUserName,
							toUserName,
							System.currentTimeMillis(),
							"text",
							"欢迎您访问高僧网[呲牙]   在线求签 请输入 qq或者求签");
				}else{
					
					out.printf(	RESPONSE_IMAGE_TXT,
							fromUserName,
							toUserName,
							System.currentTimeMillis(),
							map2.get("title"),
							map2.get("jieqian"),
							map2.get("picurl"),
							map2.get("url")
							);
				}
			}
			
		} else {

			out.printf(	RESPONSE_TXT,
						fromUserName,
						toUserName,
						System.currentTimeMillis(),
						"text",
						"欢迎您访问高僧网[呲牙]   在线求签 请输入 qq或者求签");

		}
		/**
		 * The Dead Code end
		 */

		in.close();
		in = null;
		out.close();
		out = null;

	}
}