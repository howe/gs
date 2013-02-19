package cn.gaoseng.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("gs_common_type")
public class Type {

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
	 * 类型名
	 */
	@Column("typeName")
	private String typeName;

	public String gettypeName() {
		return typeName;
	}
	public void settypeName(String typeName) {
		this.typeName = typeName;
	}
	/**
	 * 父ID
	 */
	@Column("parentId")
	private Integer parentId;

	public Integer getparentId() {
		return parentId;
	}
	public void setparentId(Integer parentId) {
		this.parentId = parentId;
	}
}