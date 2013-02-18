package cn.gaoseng.bean;

/***
 * 六天天气
 * @author Howe
 *
 */
public class Weather {

	/**
	 * 城市名(中文)
	 */
	private String city;
	/**
	 * 城市名(E文)
	 */
	private String city_en;
	/**
	 * 日期(公历) 2013年2月17日
	 */
	private String date_y;
	/**
	 * 日期(农历)
	 */
	private String date;
	/**
	 * 星期
	 */
	private String week;
	/**
	 * 周数
	 */
	private String fchh;
	/**
	 * 城市编号
	 */
	private String cityid;
	/**
	 * 第1天温度(摄氏度)
	 */
	private String temp1;
	/**
	 * 第2天温度(摄氏度)
	 */
	private String temp2;
	/**
	 * 第3天温度(摄氏度)
	 */
	private String temp3;
	/**
	 * 第4天温度(摄氏度)
	 */
	private String temp4;
	/**
	 * 第5天温度(摄氏度)
	 */
	private String temp5;
	/**
	 * 第6天温度(摄氏度)
	 */
	private String temp6;
	/**
	 * 第1天温度(华氏度)
	 */
	private String tempF1;
	/**
	 * 第2天温度(华氏度)
	 */
	private String tempF2;
	/**
	 * 第3天温度(华氏度)
	 */
	private String tempF3;
	/**
	 * 第4天温度(华氏度)
	 */
	private String tempF4;
	/**
	 * 第5天温度(华氏度)
	 */
	private String tempF5;
	/**
	 * 第6天温度(华氏度)
	 */
	private String tempF6;
	/**
	 * 第1天天气
	 */
	private String weather1;
	/**
	 * 第2天天气
	 */
	private String weather2;
	/**
	 * 第3天天气
	 */
	private String weather3;
	/**
	 * 第4天天气
	 */
	private String weather4;
	/**
	 * 第5天天气
	 */
	private String weather5;
	/**
	 * 第6天天气
	 */
	private String weather6;
	/**
	 * 第1天风向
	 */
	private String wind1;
	/**
	 * 第2天风向
	 */
	private String wind2;
	/**
	 * 第3天风向
	 */
	private String wind3;
	/**
	 * 第4天风向
	 */
	private String wind4;
	/**
	 * 第5天风向
	 */
	private String wind5;
	/**
	 * 第6天风向
	 */
	private String wind6;
	/**
	 * 第1天风力
	 */
	private String fl1;
	/**
	 * 第2天风力
	 */
	private String fl2;
	/**
	 * 第3天风力
	 */
	private String fl3;
	/**
	 * 第4天风力
	 */
	private String fl4;
	/**
	 * 第5天风力
	 */
	private String fl5;
	/**
	 * 第6天风力
	 */
	private String fl6;
	/**
	 * 今日穿衣指数
	 */
	private String index;
	/**
	 * 今日穿衣指数详细
	 */
	private String index_d;
	/**
	 * 48小时内穿衣指数
	 */
	private String index48;
	/**
	 * 48小时内穿衣指数详细
	 */
	private String index48_d;
	/**
	 * 今日紫外线强度
	 */
	private String index_uv;
	/**
	 * 48小时内紫外线强度
	 */
	private String index48_uv;
	/**
	 * 今日洗车建议
	 */
	private String index_xc;
	/**
	 * 今日旅游建议
	 */
	private String index_tr;
	/**
	 * 今日人体舒适度
	 */
	private String index_co;
	/**
	 * 今日晨练建议
	 */
	private String index_cl;
	/**
	 * 今日晾衣建议
	 */
	private String index_ls;
	/**
	 * 今日过敏气候提醒
	 */
	private String index_ag;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity_en() {
		return city_en;
	}
	public void setCity_en(String city_en) {
		this.city_en = city_en;
	}
	public String getDate_y() {
		return date_y;
	}
	public void setDate_y(String date_y) {
		this.date_y = date_y;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getFchh() {
		return fchh;
	}
	public void setFchh(String fchh) {
		this.fchh = fchh;
	}
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	public String getTemp1() {
		return temp1;
	}
	public void setTemp1(String temp1) {
		this.temp1 = temp1;
	}
	public String getTemp2() {
		return temp2;
	}
	public void setTemp2(String temp2) {
		this.temp2 = temp2;
	}
	public String getTemp3() {
		return temp3;
	}
	public void setTemp3(String temp3) {
		this.temp3 = temp3;
	}
	public String getTemp4() {
		return temp4;
	}
	public void setTemp4(String temp4) {
		this.temp4 = temp4;
	}
	public String getTemp5() {
		return temp5;
	}
	public void setTemp5(String temp5) {
		this.temp5 = temp5;
	}
	public String getTemp6() {
		return temp6;
	}
	public void setTemp6(String temp6) {
		this.temp6 = temp6;
	}
	public String getTempF1() {
		return tempF1;
	}
	public void setTempF1(String tempF1) {
		this.tempF1 = tempF1;
	}
	public String getTempF2() {
		return tempF2;
	}
	public void setTempF2(String tempF2) {
		this.tempF2 = tempF2;
	}
	public String getTempF3() {
		return tempF3;
	}
	public void setTempF3(String tempF3) {
		this.tempF3 = tempF3;
	}
	public String getTempF4() {
		return tempF4;
	}
	public void setTempF4(String tempF4) {
		this.tempF4 = tempF4;
	}
	public String getTempF5() {
		return tempF5;
	}
	public void setTempF5(String tempF5) {
		this.tempF5 = tempF5;
	}
	public String getTempF6() {
		return tempF6;
	}
	public void setTempF6(String tempF6) {
		this.tempF6 = tempF6;
	}
	public String getWeather1() {
		return weather1;
	}
	public void setWeather1(String weather1) {
		this.weather1 = weather1;
	}
	public String getWeather2() {
		return weather2;
	}
	public void setWeather2(String weather2) {
		this.weather2 = weather2;
	}
	public String getWeather3() {
		return weather3;
	}
	public void setWeather3(String weather3) {
		this.weather3 = weather3;
	}
	public String getWeather4() {
		return weather4;
	}
	public void setWeather4(String weather4) {
		this.weather4 = weather4;
	}
	public String getWeather5() {
		return weather5;
	}
	public void setWeather5(String weather5) {
		this.weather5 = weather5;
	}
	public String getWeather6() {
		return weather6;
	}
	public void setWeather6(String weather6) {
		this.weather6 = weather6;
	}
	public String getWind1() {
		return wind1;
	}
	public void setWind1(String wind1) {
		this.wind1 = wind1;
	}
	public String getWind2() {
		return wind2;
	}
	public void setWind2(String wind2) {
		this.wind2 = wind2;
	}
	public String getWind3() {
		return wind3;
	}
	public void setWind3(String wind3) {
		this.wind3 = wind3;
	}
	public String getWind4() {
		return wind4;
	}
	public void setWind4(String wind4) {
		this.wind4 = wind4;
	}
	public String getWind5() {
		return wind5;
	}
	public void setWind5(String wind5) {
		this.wind5 = wind5;
	}
	public String getWind6() {
		return wind6;
	}
	public void setWind6(String wind6) {
		this.wind6 = wind6;
	}
	public String getFl1() {
		return fl1;
	}
	public void setFl1(String fl1) {
		this.fl1 = fl1;
	}
	public String getFl2() {
		return fl2;
	}
	public void setFl2(String fl2) {
		this.fl2 = fl2;
	}
	public String getFl3() {
		return fl3;
	}
	public void setFl3(String fl3) {
		this.fl3 = fl3;
	}
	public String getFl4() {
		return fl4;
	}
	public void setFl4(String fl4) {
		this.fl4 = fl4;
	}
	public String getFl5() {
		return fl5;
	}
	public void setFl5(String fl5) {
		this.fl5 = fl5;
	}
	public String getFl6() {
		return fl6;
	}
	public void setFl6(String fl6) {
		this.fl6 = fl6;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getIndex_d() {
		return index_d;
	}
	public void setIndex_d(String index_d) {
		this.index_d = index_d;
	}
	public String getIndex48() {
		return index48;
	}
	public void setIndex48(String index48) {
		this.index48 = index48;
	}
	public String getIndex48_d() {
		return index48_d;
	}
	public void setIndex48_d(String index48_d) {
		this.index48_d = index48_d;
	}
	public String getIndex_uv() {
		return index_uv;
	}
	public void setIndex_uv(String index_uv) {
		this.index_uv = index_uv;
	}
	public String getIndex48_uv() {
		return index48_uv;
	}
	public void setIndex48_uv(String index48_uv) {
		this.index48_uv = index48_uv;
	}
	public String getIndex_xc() {
		return index_xc;
	}
	public void setIndex_xc(String index_xc) {
		this.index_xc = index_xc;
	}
	public String getIndex_tr() {
		return index_tr;
	}
	public void setIndex_tr(String index_tr) {
		this.index_tr = index_tr;
	}
	public String getIndex_co() {
		return index_co;
	}
	public void setIndex_co(String index_co) {
		this.index_co = index_co;
	}
	public String getIndex_cl() {
		return index_cl;
	}
	public void setIndex_cl(String index_cl) {
		this.index_cl = index_cl;
	}
	public String getIndex_ls() {
		return index_ls;
	}
	public void setIndex_ls(String index_ls) {
		this.index_ls = index_ls;
	}
	public String getIndex_ag() {
		return index_ag;
	}
	public void setIndex_ag(String index_ag) {
		this.index_ag = index_ag;
	}	
}
