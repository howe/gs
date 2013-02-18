package cn.gaoseng.tool;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import cn.gaoseng.bean.TQ;
import cn.gaoseng.bean.Tianqi;
import cn.gaoseng.bean.Weather;

/**
 * 天气气候工具类
 * @author Howe(howechiang@gmail.com) 2013-02-17 12:41:08
 *
 */
public class Qihou {
	
	/**
	 * 查询实时天气
	 * @param cityId(默认查询帝都天气)
	 * @return weather
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public static Tianqi queryTianqi(String cityId) throws ClientProtocolException, IOException{
		
		if (cityId == null)
			cityId = "101010100";		
		Tianqi tianqi = new Tianqi();
		
		HttpClient client = new DefaultHttpClient();
		HttpGet get = new HttpGet("http://www.weather.com.cn/data/sk/"+cityId+".html");
		HttpResponse response = client.execute(get);		
		HttpEntity entity = response.getEntity();
		String tmp = EntityUtils.toString(entity, "UTF-8");
		if(tmp.indexOf("city")>=0)
			tianqi.setCity(tmp.substring(tmp.indexOf("city")+7, tmp.indexOf("cityid")-3));
		if(tmp.indexOf("cityid")>=0)
			tianqi.setCityid(tmp.substring(tmp.indexOf("cityid")+9, tmp.indexOf("temp")-3));
		if(tmp.indexOf("temp")>=0)
			tianqi.setTemp(tmp.substring(tmp.indexOf("temp")+7, tmp.indexOf("WD")-3)+"℃");
		if(tmp.indexOf("WD")>=0)
			tianqi.setWd(tmp.substring(tmp.indexOf("WD")+5, tmp.indexOf("WS")-3));
		if(tmp.indexOf("WS")>=0)
			tianqi.setWs(tmp.substring(tmp.indexOf("WS")+5, tmp.indexOf("SD")-3));
		if(tmp.indexOf("SD")>=0)
			tianqi.setSd(tmp.substring(tmp.indexOf("SD")+5, tmp.indexOf("WSE")-3));
		if(tmp.indexOf("time")>=0)
			tianqi.setTime(tmp.substring(tmp.indexOf("time")+7, tmp.indexOf("isRadar")-3));
		return tianqi;
	}
	

	/**
	 * 查询最近6日天气
	 * @param cityId(默认查询帝都天气)
	 * @return weather
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public static Weather queryWeather(String cityId) throws ClientProtocolException, IOException{
		
		if (cityId == null)
			cityId = "101010100";
		Weather weather = new Weather();
		
		HttpClient client = new DefaultHttpClient();
		HttpGet get = new HttpGet("http://m.weather.com.cn/data/"+cityId+".html");
		HttpResponse response = client.execute(get);		
		HttpEntity entity = response.getEntity();
		String tmp = EntityUtils.toString(entity, "UTF-8");	
		if(tmp.indexOf("city")>=0)
			weather.setCity(tmp.substring(tmp.indexOf("city")+7, tmp.indexOf("city_en")-3));
		if(tmp.indexOf("city_en")>=0)
			weather.setCity_en(tmp.substring(tmp.indexOf("city_en")+10, tmp.indexOf("date_y")-3));
		if(tmp.indexOf("date_y")>=0)
			weather.setDate_y(tmp.substring(tmp.indexOf("date_y")+9, tmp.indexOf("date\"")-3));
		if(tmp.indexOf("date_y")>=0)
			weather.setDate_y(tmp.substring(tmp.indexOf("date_y")+9, tmp.indexOf("date\"")-3));
		if(tmp.indexOf("date\"")>=0)
			weather.setDate(tmp.substring(tmp.indexOf("date\"")+7, tmp.indexOf("week")-3).replaceAll("\"", ""));
		if(tmp.indexOf("week")>=0)
			weather.setWeek(tmp.substring(tmp.indexOf("week")+7, tmp.indexOf("fchh")-3));
		if(tmp.indexOf("fchh")>=0)
			weather.setFchh(tmp.substring(tmp.indexOf("fchh")+7, tmp.indexOf("cityid")-3));
		if(tmp.indexOf("cityid")>=0)
			weather.setCityid(tmp.substring(tmp.indexOf("cityid")+9, tmp.indexOf("temp1")-3));
		if(tmp.indexOf("temp1")>=0)
			weather.setTemp1(tmp.substring(tmp.indexOf("temp1")+8, tmp.indexOf("temp2")-3));
		if(tmp.indexOf("temp2")>=0)
			weather.setTemp2(tmp.substring(tmp.indexOf("temp2")+8, tmp.indexOf("temp3")-3));
		if(tmp.indexOf("temp3")>=0)
			weather.setTemp3(tmp.substring(tmp.indexOf("temp3")+8, tmp.indexOf("temp4")-3));
		if(tmp.indexOf("temp4")>=0)
			weather.setTemp4(tmp.substring(tmp.indexOf("temp4")+8, tmp.indexOf("temp5")-3));
		if(tmp.indexOf("temp5")>=0)
			weather.setTemp5(tmp.substring(tmp.indexOf("temp5")+8, tmp.indexOf("temp6")-3));
		if(tmp.indexOf("temp6")>=0)
			weather.setTemp6(tmp.substring(tmp.indexOf("temp6")+8, tmp.indexOf("tempF1")-3));
		if(tmp.indexOf("tempF1")>=0)
			weather.setTempF1(tmp.substring(tmp.indexOf("tempF1")+9, tmp.indexOf("tempF2")-3));
		if(tmp.indexOf("tempF2")>=0)
			weather.setTempF2(tmp.substring(tmp.indexOf("tempF2")+9, tmp.indexOf("tempF3")-3));
		if(tmp.indexOf("tempF3")>=0)
			weather.setTempF3(tmp.substring(tmp.indexOf("tempF3")+9, tmp.indexOf("tempF4")-3));
		if(tmp.indexOf("tempF4")>=0)
			weather.setTempF4(tmp.substring(tmp.indexOf("tempF4")+9, tmp.indexOf("tempF5")-3));
		if(tmp.indexOf("tempF5")>=0)
			weather.setTempF5(tmp.substring(tmp.indexOf("tempF5")+9, tmp.indexOf("tempF6")-3));
		if(tmp.indexOf("tempF6")>=0)
			weather.setTempF6(tmp.substring(tmp.indexOf("tempF6")+9, tmp.indexOf("weather1")-3));
		if(tmp.indexOf("weather1")>=0)
			weather.setWeather1(tmp.substring(tmp.indexOf("weather1")+11, tmp.indexOf("weather2")-3));
		if(tmp.indexOf("weather2")>=0)
			weather.setWeather2(tmp.substring(tmp.indexOf("weather2")+11, tmp.indexOf("weather3")-3));
		if(tmp.indexOf("weather3")>=0)
			weather.setWeather3(tmp.substring(tmp.indexOf("weather3")+11, tmp.indexOf("weather4")-3));
		if(tmp.indexOf("weather4")>=0)
			weather.setWeather4(tmp.substring(tmp.indexOf("weather4")+11, tmp.indexOf("weather5")-3));
		if(tmp.indexOf("weather5")>=0)
			weather.setWeather5(tmp.substring(tmp.indexOf("weather5")+11, tmp.indexOf("weather6")-3));
		if(tmp.indexOf("weather6")>=0)
			weather.setWeather6(tmp.substring(tmp.indexOf("weather6")+11, tmp.indexOf("img1")-3));
		if(tmp.indexOf("wind1")>=0)
			weather.setWind1(tmp.substring(tmp.indexOf("wind1")+8, tmp.indexOf("wind2")-3));
		if(tmp.indexOf("wind2")>=0)
			weather.setWind2(tmp.substring(tmp.indexOf("wind2")+8, tmp.indexOf("wind3")-3));
		if(tmp.indexOf("wind3")>=0)
			weather.setWind3(tmp.substring(tmp.indexOf("wind3")+8, tmp.indexOf("wind4")-3));
		if(tmp.indexOf("wind4")>=0)
			weather.setWind4(tmp.substring(tmp.indexOf("wind4")+8, tmp.indexOf("wind5")-3));
		if(tmp.indexOf("wind5")>=0)
			weather.setWind5(tmp.substring(tmp.indexOf("wind5")+8, tmp.indexOf("wind6")-3));
		if(tmp.indexOf("wind6")>=0)
			weather.setWind6(tmp.substring(tmp.indexOf("wind6")+8, tmp.indexOf("fx1")-3));
		if(tmp.indexOf("fl1")>=0)
			weather.setFl1(tmp.substring(tmp.indexOf("fl1")+6, tmp.indexOf("fl2")-3));
		if(tmp.indexOf("fl2")>=0)
			weather.setFl2(tmp.substring(tmp.indexOf("fl2")+6, tmp.indexOf("fl3")-3));
		if(tmp.indexOf("fl3")>=0)
			weather.setFl3(tmp.substring(tmp.indexOf("fl3")+6, tmp.indexOf("fl4")-3));
		if(tmp.indexOf("fl4")>=0)
			weather.setFl4(tmp.substring(tmp.indexOf("fl4")+6, tmp.indexOf("fl5")-3));
		if(tmp.indexOf("fl5")>=0)
			weather.setFl5(tmp.substring(tmp.indexOf("fl5")+6, tmp.indexOf("fl6")-3));
		if(tmp.indexOf("fl6")>=0)
			weather.setFl6(tmp.substring(tmp.indexOf("fl6")+6, tmp.indexOf("index")-3));
		if(tmp.indexOf("index")>=0)
			weather.setIndex(tmp.substring(tmp.indexOf("index")+8, tmp.indexOf("index_d")-3));
		if(tmp.indexOf("index_d")>=0)
			weather.setIndex_d(tmp.substring(tmp.indexOf("index_d")+10, tmp.indexOf("index48")-3));
		if(tmp.indexOf("index48")>=0)
			weather.setIndex48(tmp.substring(tmp.indexOf("index48")+10, tmp.indexOf("index48_d")-3));
		if(tmp.indexOf("index48_d")>=0)
			weather.setIndex48_d(tmp.substring(tmp.indexOf("index48_d")+12, tmp.indexOf("index_uv")-3));
		if(tmp.indexOf("index_uv")>=0)
			weather.setIndex_uv(tmp.substring(tmp.indexOf("index48_uv")+13, tmp.indexOf("index_xc")-3));
		if(tmp.indexOf("index_xc")>=0)
			weather.setIndex_xc(tmp.substring(tmp.indexOf("index_xc")+11, tmp.indexOf("index_tr")-3));
		if(tmp.indexOf("index_tr")>=0)
			weather.setIndex_tr(tmp.substring(tmp.indexOf("index_tr")+11, tmp.indexOf("index_co")-3));
		if(tmp.indexOf("index_co")>=0)
			weather.setIndex_co(tmp.substring(tmp.indexOf("index_co")+11, tmp.indexOf("st1")-3));
		if(tmp.indexOf("index_cl")>=0)
			weather.setIndex_cl(tmp.substring(tmp.indexOf("index_cl")+11, tmp.indexOf("index_ls")-3));
		if(tmp.indexOf("index_ls")>=0)
			weather.setIndex_ls(tmp.substring(tmp.indexOf("index_ls")+11, tmp.indexOf("index_ag")-3));
		if(tmp.indexOf("index_ag")>=0)
			weather.setIndex_ag(tmp.substring(tmp.indexOf("index_ag")+11, tmp.length()-3));
		return weather;
	}
	
	
	/**
	 * 查询今日天气
	 * @param cityId(默认查询帝都天气)
	 * @return weather
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public static TQ queryTQ(String cityId) throws ParseException, IOException{
		
		if (cityId == null)
			cityId = "101010100";
		TQ tq = new TQ();
		HttpClient client = new DefaultHttpClient();
		HttpGet get = new HttpGet("http://www.weather.com.cn/data/cityinfo/"+cityId+".html");
		HttpResponse response = client.execute(get);		
		HttpEntity entity = response.getEntity();
		String tmp = EntityUtils.toString(entity, "UTF-8");
		if(tmp.indexOf("city")>=0)
			tq.setCity(tmp.substring(tmp.indexOf("city")+7, tmp.indexOf("cityid")-3));
		if(tmp.indexOf("cityid")>=0)
			tq.setCityid(tmp.substring(tmp.indexOf("cityid")+9, tmp.indexOf("temp1")-3));
		if(tmp.indexOf("temp1")>=0)
			tq.setTemp1(tmp.substring(tmp.indexOf("temp1")+8, tmp.indexOf("temp2")-3));
		if(tmp.indexOf("temp2")>=0)
			tq.setTemp2(tmp.substring(tmp.indexOf("temp2")+8, tmp.indexOf("weather\"")-3));
		if(tmp.indexOf("weather\"")>=0)
			tq.setWeather(tmp.substring(tmp.indexOf("weather\"")+10, tmp.indexOf("img1")-3));
		if(tmp.indexOf("ptime")>=0)
			tq.setPtime(tmp.substring(tmp.indexOf("ptime")+8, tmp.length()-3));
		return tq;
	}
	
	public static void main(String[] args) throws ClientProtocolException, IOException {

		Tianqi qianqi = new Tianqi();
		qianqi = Qihou.queryTianqi("101221704");		
		System.out.print(qianqi.getCity());
		System.out.print(" - 实时温度: "+qianqi.getTemp());
		System.out.print("  相对湿度: "+qianqi.getSd());
		System.out.print("  风力情况: "+qianqi.getWd());
		System.out.print("("+qianqi.getWs()+")");
		System.out.print("  检测时间: "+qianqi.getTime());
//		Weather weather = new Weather();
//		weather = Qihou.queryWeather("101221704");
//		System.out.println(weather.getIndex_d());		
//		TQ tq = new TQ();
//		tq = Qihou.queryTQ("101221704");
//		System.out.println(tq.getWeather());
		
//		String tmp = "{\"weatherinfo\":{\"city\":\"九华山\",\"cityid\":\"101221704\",\"temp\":\"7\",\"WD\":\"北风\",\"WS\":\"1级\",\"SD\":\"91%\",\"WSE\":\"1\",\"time\":\"12:35\",\"isRadar\":\"0\",\"Radar\":\"\"}}";
//		System.out.println(tmp.substring(tmp.indexOf("city")+7, tmp.indexOf("cityid")-3));
//		System.out.println(tmp.substring(tmp.indexOf("cityid")+9, tmp.indexOf("temp")-3));
//		System.out.println(tmp.substring(tmp.indexOf("temp")+7, tmp.indexOf("WD")-3));
//		System.out.println(tmp.substring(tmp.indexOf("WD")+5, tmp.indexOf("WS")-3));
//		System.out.println(tmp.substring(tmp.indexOf("WS")+5, tmp.indexOf("SD")-3));
//		System.out.println(tmp.substring(tmp.indexOf("SD")+5, tmp.indexOf("WSE")-3));
//		System.out.println(tmp.substring(tmp.indexOf("time")+7, tmp.indexOf("isRadar")-3));
		
//		String tmp = "{\"weatherinfo\":{\"city\":\"九华山\",\"city_en\":\"jiuhuashan\",\"date_y\":\"2013年2月17日\",\"date\"\":\"\",\"week\":\"星期日\",\"fchh\":\"11\",\"cityid\":\"101221704\",\"temp1\":\"7℃~1℃\",\"temp2\":\"4℃~-5℃\",\"temp3\":\"-2℃~-5℃\",\"temp4\":\"2℃~-2℃\",\"temp5\":\"4℃~0℃\",\"temp6\":\"6℃~2℃\",\"tempF1\":\"44.6℉~33.8℉\",\"tempF2\":\"39.2℉~23℉\",\"tempF3\":\"28.4℉~23℉\",\"tempF4\":\"35.6℉~28.4℉\",\"tempF5\":\"39.2℉~32℉\",\"tempF6\":\"42.8℉~35.6℉\",\"weather1\":\"小雨\",\"weather2\":\"中雨转暴雪\",\"weather3\":\"中雪转阴\",\"weather4\":\"小雪转雨夹雪\",\"weather5\":\"小雨\",\"weather6\":\"阴转多云\",\"img1\":\"7\",\"img2\":\"99\",\"img3\":\"8\",\"img4\":\"17\",\"img5\":\"15\",\"img6\":\"2\",\"img7\":\"14\",\"img8\":\"6\",\"img9\":\"7\",\"img10\":\"99\",\"img11\":\"2\",\"img12\":\"1\",\"img_single\":\"7\",\"img_title1\":\"小雨\",\"img_title2\":\"小雨\",\"img_title3\":\"中雨\",\"img_title4\":\"暴雪\",\"img_title5\":\"中雪\",\"img_title6\":\"阴\",\"img_title7\":\"小雪\",\"img_title8\":\"雨夹雪\",\"img_title9\":\"小雨\",\"img_title10\":\"小雨\",\"img_title11\":\"阴\",\"img_title12\":\"多云\",\"img_title_single\":\"小雨\",\"wind1\":\"东北风3-4级\",\"wind2\":\"北风4-5级转3-4级\",\"wind3\":\"东北风3-4级转微风\",\"wind4\":\"微风\",\"wind5\":\"微风\",\"wind6\":\"微风\",\"fx1\":\"东北风\",\"fx2\":\"东北风\",\"fl1\":\"3-4级\",\"fl2\":\"4-5级转3-4级\",\"fl3\":\"3-4级转小于3级\",\"fl4\":\"小于3级\",\"fl5\":\"小于3级\",\"fl6\":\"小于3级\",\"index\":\"冷\",\"index_d\":\"天气冷，建议着棉服、羽绒服、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣、冬大衣或厚羽绒服。\",\"index48\":\"寒冷\",\"index48_d\":\"天气寒冷，建议着厚羽绒服、毛皮大衣加厚毛衣等隆冬服装。年老体弱者尤其要注意保暖防冻。\",\"index_uv\":\"最弱\",\"index48_uv\":\"最弱\",\"index_xc\":\"不宜\",\"index_tr\":\"一般\",\"index_co\":\"较舒适\",\"st1\":\"6\",\"st2\":\"-1\",\"st3\":\"3\",\"st4\":\"-8\",\"st5\":\"-4\",\"st6\":\"-7\",\"index_cl\":\"不宜\",\"index_ls\":\"不宜\",\"index_ag\":\"极不易发\"}}";
//		System.out.println(tmp.substring(tmp.indexOf("city")+7, tmp.indexOf("city_en")-3));
//		System.out.println(tmp.substring(tmp.indexOf("city_en")+10, tmp.indexOf("date_y")-3));
//		System.out.println(tmp.substring(tmp.indexOf("date_y")+9, tmp.indexOf("date\"")-3));
//		System.out.println(tmp.substring(tmp.indexOf("date\"")+7, tmp.indexOf("week")-3).replaceAll("\"", ""));
//		System.out.println(tmp.substring(tmp.indexOf("week")+7, tmp.indexOf("fchh")-3));
//		System.out.println(tmp.substring(tmp.indexOf("fchh")+7, tmp.indexOf("cityid")-3));
//		System.out.println(tmp.substring(tmp.indexOf("cityid")+9, tmp.indexOf("temp1")-3));
//		System.out.println(tmp.substring(tmp.indexOf("temp1")+8, tmp.indexOf("temp2")-3));
//		System.out.println(tmp.substring(tmp.indexOf("temp2")+8, tmp.indexOf("temp3")-3));
//		System.out.println(tmp.substring(tmp.indexOf("temp3")+8, tmp.indexOf("temp4")-3));
//		System.out.println(tmp.substring(tmp.indexOf("temp4")+8, tmp.indexOf("temp5")-3));
//		System.out.println(tmp.substring(tmp.indexOf("temp5")+8, tmp.indexOf("temp6")-3));
//		System.out.println(tmp.substring(tmp.indexOf("temp6")+8, tmp.indexOf("tempF1")-3));
//		System.out.println(tmp.substring(tmp.indexOf("tempF1")+9, tmp.indexOf("tempF2")-3));
//		System.out.println(tmp.substring(tmp.indexOf("tempF2")+9, tmp.indexOf("tempF3")-3));
//		System.out.println(tmp.substring(tmp.indexOf("tempF3")+9, tmp.indexOf("tempF4")-3));
//		System.out.println(tmp.substring(tmp.indexOf("tempF4")+9, tmp.indexOf("tempF5")-3));
//		System.out.println(tmp.substring(tmp.indexOf("tempF5")+9, tmp.indexOf("tempF6")-3));
//		System.out.println(tmp.substring(tmp.indexOf("tempF6")+9, tmp.indexOf("weather1")-3));
//		System.out.println(tmp.substring(tmp.indexOf("weather1")+11, tmp.indexOf("weather2")-3));
//		System.out.println(tmp.substring(tmp.indexOf("weather2")+11, tmp.indexOf("weather3")-3));
//		System.out.println(tmp.substring(tmp.indexOf("weather3")+11, tmp.indexOf("weather4")-3));
//		System.out.println(tmp.substring(tmp.indexOf("weather4")+11, tmp.indexOf("weather5")-3));
//		System.out.println(tmp.substring(tmp.indexOf("weather5")+11, tmp.indexOf("weather6")-3));
//		System.out.println(tmp.substring(tmp.indexOf("weather6")+11, tmp.indexOf("img1")-3));
//		System.out.println(tmp.substring(tmp.indexOf("wind1")+8, tmp.indexOf("wind2")-3));
//		System.out.println(tmp.substring(tmp.indexOf("wind2")+8, tmp.indexOf("wind3")-3));
//		System.out.println(tmp.substring(tmp.indexOf("wind3")+8, tmp.indexOf("wind4")-3));
//		System.out.println(tmp.substring(tmp.indexOf("wind4")+8, tmp.indexOf("wind5")-3));
//		System.out.println(tmp.substring(tmp.indexOf("wind5")+8, tmp.indexOf("wind6")-3));
//		System.out.println(tmp.substring(tmp.indexOf("wind6")+8, tmp.indexOf("fx1")-3));
//		System.out.println(tmp.substring(tmp.indexOf("fl1")+6, tmp.indexOf("fl2")-3));
//		System.out.println(tmp.substring(tmp.indexOf("fl2")+6, tmp.indexOf("fl3")-3));
//		System.out.println(tmp.substring(tmp.indexOf("fl3")+6, tmp.indexOf("fl4")-3));
//		System.out.println(tmp.substring(tmp.indexOf("fl4")+6, tmp.indexOf("fl5")-3));
//		System.out.println(tmp.substring(tmp.indexOf("fl5")+6, tmp.indexOf("fl6")-3));
//		System.out.println(tmp.substring(tmp.indexOf("fl6")+6, tmp.indexOf("index")-3));
//		System.out.println(tmp.substring(tmp.indexOf("index")+8, tmp.indexOf("index_d")-3));
//		System.out.println(tmp.substring(tmp.indexOf("index_d")+10, tmp.indexOf("index48")-3));
//		System.out.println(tmp.substring(tmp.indexOf("index48")+10, tmp.indexOf("index48_d")-3));
//		System.out.println(tmp.substring(tmp.indexOf("index48_d")+12, tmp.indexOf("index_uv")-3));
//		System.out.println(tmp.substring(tmp.indexOf("index_uv")+11, tmp.indexOf("index48_uv")-3));
//		System.out.println(tmp.substring(tmp.indexOf("index48_uv")+13, tmp.indexOf("index_xc")-3));
//		System.out.println(tmp.substring(tmp.indexOf("index_xc")+11, tmp.indexOf("index_tr")-3));
//		System.out.println(tmp.substring(tmp.indexOf("index_tr")+11, tmp.indexOf("index_co")-3));
//		System.out.println(tmp.substring(tmp.indexOf("index_co")+11, tmp.indexOf("st1")-3));
//		System.out.println(tmp.substring(tmp.indexOf("index_cl")+11, tmp.indexOf("index_ls")-3));
//		System.out.println(tmp.substring(tmp.indexOf("index_ls")+11, tmp.indexOf("index_ag")-3));
//		System.out.println(tmp.substring(tmp.indexOf("index_ag")+11, tmp.length()-3));
		
//		String tmp = "{\"weatherinfo\":{\"city\":\"九华山\",\"cityid\":\"101221704\",\"temp1\":\"7℃\",\"temp2\":\"1℃\",\"weather\":\"小雨\",\"img1\":\"d7.gif\",\"img2\":\"n7.gif\",\"ptime\":\"11:00\"}}";
//		System.out.println(tmp.substring(tmp.indexOf("city")+7, tmp.indexOf("cityid")-3));
//		System.out.println(tmp.substring(tmp.indexOf("cityid")+9, tmp.indexOf("temp1")-3));
//		System.out.println(tmp.substring(tmp.indexOf("temp1")+8, tmp.indexOf("temp2")-3));
//		System.out.println(tmp.substring(tmp.indexOf("temp2")+8, tmp.indexOf("weather\"")-3));
//		System.out.println(tmp.substring(tmp.indexOf("weather\"")+10, tmp.indexOf("img1")-3));
//		System.out.println(tmp.substring(tmp.indexOf("ptime")+8, tmp.length()-3));
	}
	
}
