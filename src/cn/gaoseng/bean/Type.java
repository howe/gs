package cn.gaoseng.bean;

import org.nutz.dao.entity.annotation.*;

/**
 * 
 * @author howe
 *
 */
@Table("gs_qiuqian_type")
public class Type {

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
	 * 类型名称
	 */
	@Column("typeName")
	private String typeName;
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	/**
	 * 父ID
	 */
	@Column("parentId")
	private Integer parentId;
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
}