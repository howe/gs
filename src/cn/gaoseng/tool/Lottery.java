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
@IocBean(fields = {"dao"})
public class Lottery {
	private static Dao dao;

	public static String getLottery(String typeId) {

		String rtn = "";

		Sql sql = Sqls.create("SELECT t.* FROM gs_qiuqian_qianwen t WHERE t.TYPEID=@TYPEID");
		//通过typeid取gs_qiuqian_qianwen的id 
		sql.params().set("TYPEID",typeId);
		sql.setCallback(new SqlCallback() {
			@Override
			public Object invoke(Connection conn, ResultSet rs, Sql sql) throws SQLException {
				List<Qianwen> list = new ArrayList<Qianwen>();
				while (rs.next()){
					list.add(new Qianwen(Integer.parseInt(rs.getString("id"))));		
				}
				return list;
			}
			
		});
		
		dao.execute(sql);
		List<Double> orignalRates = new ArrayList<Double>(sql.getList(Qianwen.class).size());

		for (Qianwen qw : sql.getList(Qianwen.class)) {
			double probability = 1.0/sql.getList(Qianwen.class).size();
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
			rtn = sql.getList(Qianwen.class).get(entry.getKey()).toString();
		}
		return rtn;
	}

}
