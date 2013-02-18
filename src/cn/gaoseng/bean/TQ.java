package cn.gaoseng.bean;

/***
 * 今日天气
 * @author Howe
 *
 */
public class TQ {

	/**
	 * 城市名
	 */
	private String city;
	/**
	 * 城市编号
	 */
	private String cityid;
	/**
	 * 最高温度
	 */
	private String temp1;
	/**
	 * 最低温度
	 */
	private String temp2;
	/**
	 * 天气
	 */
	private String weather;
	/**
	 * 发布时间
	 */
	private String ptime;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getPtime() {
		return ptime;
	}
	public void setPtime(String ptime) {
		this.ptime = ptime;
	}
}
