package cn.gaoseng.tool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import cn.gaoseng.bean.qiuqian.Qianwen;

public class Lottery {

	public static String getLottery(String typeId) {

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
		} else {
			qws.add(new Qianwen(0));
		}
		List<Double> orignalRates = new ArrayList<Double>(qws.size());
		for (Qianwen qw : qws) {
			double probability = 1.0 / qws.size();
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
}
