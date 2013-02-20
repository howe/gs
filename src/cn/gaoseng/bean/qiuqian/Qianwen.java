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

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 签文标题
	 */
	@Column("title")
	private String title;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 签文地址
	 */
	@Column("url")
	private String url;

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 解签
	 */
	@Column("jieqian")
	private String jieqian;

	public String getJieqian() {
		return jieqian;
	}
	public void setJieqian(String jieqian) {
		this.jieqian = jieqian;
	}
	/**
	 * 签文图片地址
	 */
	@Column("picUrl")
	private String picUrl;

	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	/**
	 * 类型ID
	 */
	@Column("typeId")
	private Integer typeId;

	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
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