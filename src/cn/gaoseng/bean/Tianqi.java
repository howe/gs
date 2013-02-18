package cn.gaoseng.bean;

/***
 * 实时天气
 * @author Howe
 *
 */
public class Tianqi {

	/**
	 * 城市名
	 */
	private String city;
	/**
	 * 城市编号
	 */
	private String cityid;
	/**
	 * 实时温度
	 */
	private String temp;
	/**
	 * 发布时间
	 */
	private String time;
	/**
	 * 风向
	 */
	private String wd;
	/**
	 * 风力
	 */
	private String ws;
	/**
	 * 相对湿度
	 */
	private String sd;
	
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
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getWd() {
		return wd;
	}
	public void setWd(String wd) {
		this.wd = wd;
	}
	public String getWs() {
		return ws;
	}
	public void setWs(String ws) {
		this.ws = ws;
	}
	public String getSd() {
		return sd;
	}
	public void setSd(String sd) {
		this.sd = sd;
	}	
}
