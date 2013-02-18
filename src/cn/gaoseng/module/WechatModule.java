package cn.gaoseng.module;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.Mvcs;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.GET;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.POST;

import cn.gaoseng.bean.Tianqi;
import cn.gaoseng.tool.EncoderHelper;
import cn.gaoseng.tool.Qihou;

/**
 * www.gaoseng.cn 微信自动服务模块
 * 
 * @author yangq(qi.yang.cn@gmail.com) 2013-2-17
 */

@IocBean
public class WechatModule {

	private static final Log log = Logs.get();
	private static String TOKEN = "b6c848973fa03845930136a60f67a3c7";
	private static final String RESPONSE_TXT = "<xml><ToUserName><![CDATA[%s]]></ToUserName><FromUserName><![CDATA[%s]]></FromUserName><CreateTime>%s</CreateTime><MsgType><![CDATA[%s]]></MsgType><Content><![CDATA[%s]]></Content><FuncFlag>0</FuncFlag></xml>";

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

			StringBuilder tmp = new StringBuilder();
//
//			Tianqi qianqi = new Tianqi();
//			qianqi = Qihou.queryTianqi("101221704");
//			System.out.print(qianqi.getCity());
			tmp.append("施主 今年财运滚滚来[色]");
//			tmp.append("九华山实时温度: " + qianqi.getTemp());
//			tmp.append("  相对湿度: " + qianqi.getSd());
//			tmp.append("  风力情况: " + qianqi.getWd());
//			tmp.append("(" + qianqi.getWs() + ")");
//			tmp.append("  检测时间: " + qianqi.getTime());

			out.printf(	RESPONSE_TXT,
						fromUserName,
						toUserName,
						System.currentTimeMillis(),
						"text",
						tmp);

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