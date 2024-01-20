package com.easyjob.controller;

import java.util.List;

import com.easyjob.entity.query.SysMenuQuery;
import com.easyjob.entity.po.SysMenu;
import com.easyjob.entity.vo.ResponseVO;
import com.easyjob.service.SysMenuService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 菜单表 Controller
 */
@RestController("sysMenuController")
@RequestMapping("/sysMenu")
public class SysMenuController extends ABaseController{

	@Resource
	private SysMenuService sysMenuService;
	/**
	 * 根据条件分页查询
	 */
	@RequestMapping("/loadDataList")
	public ResponseVO loadDataList(SysMenuQuery query){
		return getSuccessResponseVO(sysMenuService.findListByPage(query));
	}

	/**
	 * 新增
	 */
	@RequestMapping("/add")
	public ResponseVO add(SysMenu bean) {
		sysMenuService.add(bean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增
	 */
	@RequestMapping("/addBatch")
	public ResponseVO addBatch(@RequestBody List<SysMenu> listBean) {
		sysMenuService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 批量新增/修改
	 */
	@RequestMapping("/addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<SysMenu> listBean) {
		sysMenuService.addBatch(listBean);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据MenuId查询对象
	 */
	@RequestMapping("/getSysMenuByMenuId")
	public ResponseVO getSysMenuByMenuId(Integer menuId) {
		return getSuccessResponseVO(sysMenuService.getSysMenuByMenuId(menuId));
	}

	/**
	 * 根据MenuId修改对象
	 */
	@RequestMapping("/updateSysMenuByMenuId")
	public ResponseVO updateSysMenuByMenuId(SysMenu bean,Integer menuId) {
		sysMenuService.updateSysMenuByMenuId(bean,menuId);
		return getSuccessResponseVO(null);
	}

	/**
	 * 根据MenuId删除
	 */
	@RequestMapping("/deleteSysMenuByMenuId")
	public ResponseVO deleteSysMenuByMenuId(Integer menuId) {
		sysMenuService.deleteSysMenuByMenuId(menuId);
		return getSuccessResponseVO(null);
	}
}