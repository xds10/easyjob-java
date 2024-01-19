package com.easyjob.entity.query;

import java.util.Date;


/**
 * 参数
 */
public class SysAccountQuery extends BaseParam {


	/**
	 * 用户id
	 */
	private Integer userId;

	/**
	 * 手机号
	 */
	private String phone;

	private String phoneFuzzy;

	/**
	 * 用户名
	 */
	private String username;

	private String usernameFuzzy;

	/**
	 * 密码
	 */
	private String password;

	private String passwordFuzzy;

	/**
	 * 职位
	 */
	private String position;

	private String positionFuzzy;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 多个角色
	 */
	private String roles;

	private String rolesFuzzy;

	/**
	 * 创建时间
	 */
	private String createTime;

	private String createTimeStart;

	private String createTimeEnd;


	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return this.userId;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return this.phone;
	}

	public void setPhoneFuzzy(String phoneFuzzy){
		this.phoneFuzzy = phoneFuzzy;
	}

	public String getPhoneFuzzy(){
		return this.phoneFuzzy;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return this.username;
	}

	public void setUsernameFuzzy(String usernameFuzzy){
		this.usernameFuzzy = usernameFuzzy;
	}

	public String getUsernameFuzzy(){
		return this.usernameFuzzy;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}

	public void setPasswordFuzzy(String passwordFuzzy){
		this.passwordFuzzy = passwordFuzzy;
	}

	public String getPasswordFuzzy(){
		return this.passwordFuzzy;
	}

	public void setPosition(String position){
		this.position = position;
	}

	public String getPosition(){
		return this.position;
	}

	public void setPositionFuzzy(String positionFuzzy){
		this.positionFuzzy = positionFuzzy;
	}

	public String getPositionFuzzy(){
		return this.positionFuzzy;
	}

	public void setStatus(Integer status){
		this.status = status;
	}

	public Integer getStatus(){
		return this.status;
	}

	public void setRoles(String roles){
		this.roles = roles;
	}

	public String getRoles(){
		return this.roles;
	}

	public void setRolesFuzzy(String rolesFuzzy){
		this.rolesFuzzy = rolesFuzzy;
	}

	public String getRolesFuzzy(){
		return this.rolesFuzzy;
	}

	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	public String getCreateTime(){
		return this.createTime;
	}

	public void setCreateTimeStart(String createTimeStart){
		this.createTimeStart = createTimeStart;
	}

	public String getCreateTimeStart(){
		return this.createTimeStart;
	}
	public void setCreateTimeEnd(String createTimeEnd){
		this.createTimeEnd = createTimeEnd;
	}

	public String getCreateTimeEnd(){
		return this.createTimeEnd;
	}

}
