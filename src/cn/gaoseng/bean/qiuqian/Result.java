package cn.gaoseng.bean.qiuqian;

import org.nutz.dao.entity.annotation.*;

/**
* 求签结果
*/
@Table("gs_qiuqian_result")
public class Result {

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
	 * 微信用户OPENID
	 */
	@Column("openId")
	private String openId;

	public String getopenId() {
		return openId;
	}
	public void setopenId(String openId) {
		this.openId = openId;
	}
	/**
	 * 抽签时间
	 */
	@Column("createTime")
	private String createTime;

	public String getcreateTime() {
		return createTime;
	}
	public void setcreateTime(String createTime) {
		this.createTime = createTime;
	}
	/**
	 * 签文ID
	 */
	@Column("qwId")
	private Integer qwId;

	public Integer getqwId() {
		return qwId;
	}
	public void setqwId(Integer qwId) {
		this.qwId = qwId;
	}
}