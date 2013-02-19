package cn.gaoseng.bean.qiuqian;

import org.nutz.dao.entity.annotation.*;

/**
* 签文表
*/
@Table("gs_qiuqian_qianwen")
public class Qianwen {

	/**
	 * ID
	 */
	@Id
	@Column("id")
	private Integer id;

	public Integer getid() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	/**
	 * 签文标题
	 */
	@Column("title")
	private String title;

	public String gettitle() {
		return title;
	}
	public void settitle(String title) {
		this.title = title;
	}
	/**
	 * 签文故事
	 */
	@Column("story")
	private String story;

	public String getstory() {
		return story;
	}
	public void setstory(String story) {
		this.story = story;
	}
	/**
	 * 解签
	 */
	@Column("jieqian")
	private String jieqian;

	public String getjieqian() {
		return jieqian;
	}
	public void setjieqian(String jieqian) {
		this.jieqian = jieqian;
	}
	/**
	 * 签文图片地址
	 */
	@Column("picUrl")
	private String picUrl;

	public String getpicUrl() {
		return picUrl;
	}
	public void setpicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	/**
	 * 类型ID
	 */
	@Column("typeId")
	private Integer typeId;

	public Integer gettypeId() {
		return typeId;
	}
	public void settypeId(Integer typeId) {
		this.typeId = typeId;
	}
	@Override
	public String toString() {
		return String.valueOf(id);
	}
	public Qianwen(int id){
		this.id = id;
	}
}