package com.easyjob.entity.dto;

import com.easyjob.entity.vo.SysMenuVO;

import java.util.List;

/**
 * 用户session信息
 */
public class SessionUserAdminDto {
    private Integer userid;
    private String username;
    private Boolean superAdmin;
    private List<SysMenuVO> menuList;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getSuperAdmin() {
        return superAdmin;
    }

    public void setSuperAdmin(Boolean superAdmin) {
        this.superAdmin = superAdmin;
    }

    public List<SysMenuVO> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<SysMenuVO> menuList) {
        this.menuList = menuList;
    }
}
