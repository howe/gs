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
			qws.add(new Qianwen(41));
			qws.add(new Qianwen(42));
			qws.add(new Qianwen(43));
			qws.add(new Qianwen(44));
			qws.add(new Qianwen(45));
			qws.add(new Qianwen(46));
			qws.add(new Qianwen(47));
			qws.add(new Qianwen(48));
			qws.add(new Qianwen(49));
			qws.add(new Qianwen(50));
			qws.add(new Qianwen(51));
			qws.add(new Qianwen(52));
			qws.add(new Qianwen(53));
			qws.add(new Qianwen(54));
			qws.add(new Qianwen(55));
			qws.add(new Qianwen(56));
			qws.add(new Qianwen(57));
			qws.add(new Qianwen(58));
			qws.add(new Qianwen(59));
			qws.add(new Qianwen(60));
			qws.add(new Qianwen(61));
			qws.add(new Qianwen(62));
			qws.add(new Qianwen(63));
			qws.add(new Qianwen(64));
			qws.add(new Qianwen(65));
			qws.add(new Qianwen(66));
			qws.add(new Qianwen(67));
			qws.add(new Qianwen(68));
			qws.add(new Qianwen(69));
			qws.add(new Qianwen(70));
			qws.add(new Qianwen(71));
			qws.add(new Qianwen(72));
			qws.add(new Qianwen(73));
			qws.add(new Qianwen(74));
			qws.add(new Qianwen(75));
			qws.add(new Qianwen(76));
			qws.add(new Qianwen(77));
			qws.add(new Qianwen(78));
			qws.add(new Qianwen(79));
			qws.add(new Qianwen(80));
			qws.add(new Qianwen(81));
			qws.add(new Qianwen(82));
			qws.add(new Qianwen(83));
			qws.add(new Qianwen(84));
			qws.add(new Qianwen(85));
			qws.add(new Qianwen(86));
			qws.add(new Qianwen(87));
			qws.add(new Qianwen(88));
			qws.add(new Qianwen(89));
			qws.add(new Qianwen(90));
			qws.add(new Qianwen(91));
			qws.add(new Qianwen(92));
			qws.add(new Qianwen(93));
			qws.add(new Qianwen(94));
			qws.add(new Qianwen(95));
			qws.add(new Qianwen(96));
			qws.add(new Qianwen(97));
			qws.add(new Qianwen(98));
			qws.add(new Qianwen(99));
			qws.add(new Qianwen(100));
		} else if (typeId.equals("2")) {
			qws.add(new Qianwen(101));
			qws.add(new Qianwen(102));
			qws.add(new Qianwen(103));
			qws.add(new Qianwen(104));
			qws.add(new Qianwen(105));
			qws.add(new Qianwen(106));
			qws.add(new Qianwen(107));
			qws.add(new Qianwen(108));
			qws.add(new Qianwen(109));
			qws.add(new Qianwen(110));
			qws.add(new Qianwen(111));
			qws.add(new Qianwen(112));
			qws.add(new Qianwen(113));
			qws.add(new Qianwen(114));
			qws.add(new Qianwen(115));
			qws.add(new Qianwen(116));
			qws.add(new Qianwen(117));
			qws.add(new Qianwen(118));
			qws.add(new Qianwen(119));
			qws.add(new Qianwen(120));
			qws.add(new Qianwen(121));
			qws.add(new Qianwen(122));
			qws.add(new Qianwen(123));
			qws.add(new Qianwen(124));
			qws.add(new Qianwen(125));
			qws.add(new Qianwen(126));
			qws.add(new Qianwen(127));
			qws.add(new Qianwen(128));
			qws.add(new Qianwen(129));
			qws.add(new Qianwen(130));
			qws.add(new Qianwen(131));
			qws.add(new Qianwen(132));
			qws.add(new Qianwen(133));
			qws.add(new Qianwen(134));
			qws.add(new Qianwen(135));
			qws.add(new Qianwen(136));
			qws.add(new Qianwen(137));
			qws.add(new Qianwen(138));
			qws.add(new Qianwen(139));
			qws.add(new Qianwen(140));
			qws.add(new Qianwen(141));
			qws.add(new Qianwen(142));
			qws.add(new Qianwen(143));
			qws.add(new Qianwen(144));
			qws.add(new Qianwen(145));
			qws.add(new Qianwen(146));
			qws.add(new Qianwen(147));
			qws.add(new Qianwen(148));
			qws.add(new Qianwen(149));
			qws.add(new Qianwen(150));
			qws.add(new Qianwen(151));
			qws.add(new Qianwen(152));
			qws.add(new Qianwen(153));
			qws.add(new Qianwen(154));
			qws.add(new Qianwen(155));
			qws.add(new Qianwen(156));
			qws.add(new Qianwen(157));
			qws.add(new Qianwen(158));
			qws.add(new Qianwen(159));
			qws.add(new Qianwen(160));
		} else {
			qws.add(new Qianwen(0));
		}
		List<Double> orignalRates = new ArrayList<Double>(qws.size());
		orignalRates.add((double)(1.0/100));

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
