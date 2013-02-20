package cn.gaoseng.tool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.nutz.dao.Dao;
import org.nutz.dao.Sqls;
import org.nutz.dao.sql.Sql;
import org.nutz.dao.sql.SqlCallback;
import org.nutz.ioc.loader.annotation.IocBean;

import cn.gaoseng.bean.qiuqian.Qianwen;
//@IocBean(fields = {"dao"})
public class Lottery {
//	private static Dao dao;

	public static String getLottery(String typeId) {

//		String rtn = "";
//		List<Qianwen> qws = new ArrayList<Qianwen>();
//		Sql sql = Sqls.create("SELECT t.* FROM gs_qiuqian_qianwen T WHERE t.TYPEID=@TYPEID");
//		//通过typeid取gs_qiuqian_qianwen的id 
//		sql.params().set("TYPEID",typeId);
//		sql.setCallback(new SqlCallback() {
//			public Object invoke(Connection conn, ResultSet rs, Sql sql) throws SQLException {
//				List<Qianwen> list = new ArrayList<Qianwen>();
//				while (rs.next()){
//					list.add(new Qianwen(Integer.parseInt(rs.getString("id"))));		
//					System.out.println(Integer.parseInt(rs.getString("id")));
//				}
//				return list;
//			}
//			
//		});
//		dao.execute(sql);
//		qws = sql.getList(Qianwen.class);
//		List<Double> orignalRates = new ArrayList<Double>(qws.size());
//
//		for (Qianwen qw : qws) {
//			double probability = (double)(1.0/qws.size());
//			if (probability < 0) {
//				probability = 0;
//			}
//			orignalRates.add(probability);
//		}
//
//		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
//		double num = 1;
//		for (int i = 0; i < num; i++) {
//			int orignalIndex = LotteryUtil.lottery(orignalRates);
//
//			Integer value = count.get(orignalIndex);
//			count.put(orignalIndex, value == null ? 1 : value + 1);
//		}
//
//		for (Entry<Integer, Integer> entry : count.entrySet()) {
//			rtn = qws.get(entry.getKey()).toString();
//		}
//		return rtn;
		
		String rtn = "";
		List<Qianwen> qws = new ArrayList<Qianwen>();
		if (typeId.equals("1")) {
			qws.add(new Qianwen(1));
			qws.add(new Qianwen(2));
			qws.add(new Qianwen(3));
			qws.add(new Qianwen(4));
			qws.add(new Qianwen(5));
			qws.add(new Qianwen(6));
			qws.add(new Qianwen(7));
			qws.add(new Qianwen(8));
			qws.add(new Qianwen(9));
			qws.add(new Qianwen(10));
			qws.add(new Qianwen(11));
			qws.add(new Qianwen(12));
			qws.add(new Qianwen(13));
			qws.add(new Qianwen(14));
			qws.add(new Qianwen(15));
			qws.add(new Qianwen(16));
			qws.add(new Qianwen(17));
			qws.add(new Qianwen(18));
			qws.add(new Qianwen(19));
			qws.add(new Qianwen(20));
			qws.add(new Qianwen(21));
			qws.add(new Qianwen(22));
			qws.add(new Qianwen(23));
			qws.add(new Qianwen(24));
			qws.add(new Qianwen(25));
			qws.add(new Qianwen(26));
			qws.add(new Qianwen(27));
			qws.add(new Qianwen(28));
			qws.add(new Qianwen(29));
			qws.add(new Qianwen(30));
			qws.add(new Qianwen(31));
			qws.add(new Qianwen(32));
			qws.add(new Qianwen(33));
			qws.add(new Qianwen(34));
			qws.add(new Qianwen(35));
			qws.add(new Qianwen(36));
			qws.add(new Qianwen(37));
			qws.add(new Qianwen(38));
			qws.add(new Qianwen(39));
			qws.add(new Qianwen(40));
//			qws.add(new Qianwen(41));
//			qws.add(new Qianwen(42));
//			qws.add(new Qianwen(43));
//			qws.add(new Qianwen(44));
//			qws.add(new Qianwen(45));
//			qws.add(new Qianwen(46));
//			qws.add(new Qianwen(47));
//			qws.add(new Qianwen(48));
//			qws.add(new Qianwen(49));
//			qws.add(new Qianwen(50));
//			qws.add(new Qianwen(51));
//			qws.add(new Qianwen(52));
//			qws.add(new Qianwen(53));
//			qws.add(new Qianwen(54));
//			qws.add(new Qianwen(55));
//			qws.add(new Qianwen(56));
//			qws.add(new Qianwen(57));
//			qws.add(new Qianwen(58));
//			qws.add(new Qianwen(59));
//			qws.add(new Qianwen(60));
//			qws.add(new Qianwen(61));
//			qws.add(new Qianwen(62));
//			qws.add(new Qianwen(63));
//			qws.add(new Qianwen(64));
//			qws.add(new Qianwen(65));
//			qws.add(new Qianwen(66));
//			qws.add(new Qianwen(67));
//			qws.add(new Qianwen(68));
//			qws.add(new Qianwen(69));
//			qws.add(new Qianwen(70));
//			qws.add(new Qianwen(71));
//			qws.add(new Qianwen(72));
//			qws.add(new Qianwen(73));
//			qws.add(new Qianwen(74));
//			qws.add(new Qianwen(75));
//			qws.add(new Qianwen(76));
//			qws.add(new Qianwen(77));
//			qws.add(new Qianwen(78));
//			qws.add(new Qianwen(79));
//			qws.add(new Qianwen(80));
//			qws.add(new Qianwen(81));
//			qws.add(new Qianwen(82));
//			qws.add(new Qianwen(83));
//			qws.add(new Qianwen(84));
//			qws.add(new Qianwen(85));
//			qws.add(new Qianwen(86));
//			qws.add(new Qianwen(87));
//			qws.add(new Qianwen(88));
//			qws.add(new Qianwen(89));
//			qws.add(new Qianwen(90));
//			qws.add(new Qianwen(91));
//			qws.add(new Qianwen(92));
//			qws.add(new Qianwen(93));
//			qws.add(new Qianwen(94));
//			qws.add(new Qianwen(95));
//			qws.add(new Qianwen(96));
//			qws.add(new Qianwen(97));
//			qws.add(new Qianwen(98));
//			qws.add(new Qianwen(99));
//			qws.add(new Qianwen(100));
		} else {
			qws.add(new Qianwen(0));
		}
		List<Double> orignalRates = new ArrayList<Double>(qws.size());

		for (Qianwen qw : qws) {
			double probability = (double)(1.0/qws.size());
			if (probability < 0) {
				probability = 0;
			}
			orignalRates.add(probability);
		}

		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		double num = 1;
		for (int i = 0; i < num; i++) {
			int orignalIndex = LotteryUtil.lottery(orignalRates);

			Integer value = count.get(orignalIndex);
			count.put(orignalIndex, value == null ? 1 : value + 1);
		}

		for (Entry<Integer, Integer> entry : count.entrySet()) {
			rtn = qws.get(entry.getKey()).toString();
		}
		return rtn;
	}
	
	public static void main(String[] args) {
		
		System.out.print(getLottery("1"));
	}
}
