package com.easyjob.entity.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.easyjob.entity.enums.DateTimePatternEnum;
import com.easyjob.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;


/**
 * 
 */
public class SysAccount implements Serializable {


	/**
	 * 用户id
	 */
	private Integer userId;

	/**
	 * 手机号
	 */
	@JsonIgnore
	private String phone;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 职位
	 */
	private String position;

	/**
	 * 状态
	 */
	private Integer status;

	/**
	 * 多个角色
	 */
	private String roles;

	/**
	 * 创建时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;


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

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return this.username;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}

	public void setPosition(String position){
		this.position = position;
	}

	public String getPosition(){
		return this.position;
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

	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	public Date getCreateTime(){
		return this.createTime;
	}

	@Override
	public String toString (){
		return "用户id:"+(userId == null ? "空" : userId)+"，手机号:"+(phone == null ? "空" : phone)+"，用户名:"+(username == null ? "空" : username)+"，密码:"+(password == null ? "空" : password)+"，职位:"+(position == null ? "空" : position)+"，状态:"+(status == null ? "空" : status)+"，多个角色:"+(roles == null ? "空" : roles)+"，创建时间:"+(createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}
