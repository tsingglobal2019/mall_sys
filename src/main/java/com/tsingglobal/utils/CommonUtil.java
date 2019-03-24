package com.tsingglobal.utils;

import java.util.Calendar;
import java.util.Random;

import com.tsingglobal.MallSysApplication;
import com.tsingglobal.system.log.dto.TLogDTO;
import com.tsingglobal.system.log.service.ITLogService;
import com.tsingglobal.system.user.domain.UserModel;
public class CommonUtil {
	
	
	public static String getOrgCode( final String orgCode) {
		final int[] indexArrays = {2,4,8,12,16,20,24,28,32};
		
		for( int i = 0 ; i < indexArrays.length ; i++) {
			
			if( orgCode.substring(indexArrays[i]).equals( Constants.ORG_ROOT_CODE.substring(indexArrays[i]))) {
				
				return orgCode.substring(0, indexArrays[i]);
			}
			
		}
		return null;
	}
	
	public static String getPermissionCode( final String permissionCode) {
		if( com.common.utils.CommonUtil.isEmpty(permissionCode) ) {
			
			return null;
		}
		
		final int[] indexArrays = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32};
		
		for( int i = 0 ; i < indexArrays.length ; i++) {
			
			if( permissionCode.substring(indexArrays[i]).equals( Constants.PERMISSION_ROOT_CODE.substring(indexArrays[i]))) {
				
				return permissionCode.substring(0, indexArrays[i]);
			}
			
		}
		return null;
	}
	
	/**
	 * 
	    * @Title: getParentOrgCode
	    * @Description: TODO(按组织机构级别获取机构编码的有效部分，主要用于模糊查询)
	    * @param @param orgCode	组织机构编码
	    * @param @param orgLevel	组织机构级别
	    * @param @return    参数			机构编码的有效部分
	    * @return String    返回类型
	 */
	public static String getParentOrgCode( final String orgCode, final String orgLevel) {
		
		if( com.common.utils.CommonUtil.isEmpty(orgCode) ) {
			
			return null;
		}
		
		String 	code = null;
		
		int iOrgLevel = ( com.common.utils.CommonUtil.isEmpty(orgLevel) ) ? 0 : Integer.parseInt(orgLevel);
		
		if( iOrgLevel > -1 ) {
					
			switch( iOrgLevel ) {
				case 0:
					code = orgCode.substring(0,2);
					break;
				case 1:
					code = orgCode.substring(0,4);
					break;
				case 2:
					code = orgCode.substring(0,8);
					break;
				case 3:
					code = orgCode.substring(0,12);
					break;
				case 4:
					code = orgCode.substring(0,16);
					break;
				case 5:
					code = orgCode.substring(0,20);
					break;
				case 6:
					code = orgCode.substring(0,24);
					break;
				case 7:
					code = orgCode.substring(0,28);
					break;
				case 8:
					code = orgCode.substring(0,32);
					break;	
			}
			
		}
		return code;
	}
	
	public static void log(final String module, final String op) throws Exception {
		
		log( module, op , null);
	}
	
	public static void log(final String module, final String op, final String userName) throws Exception {
		
		TLogDTO logDTO = new TLogDTO();
		
		logDTO.setId( com.common.utils.CommonUtil.genarateID() );
		
		logDTO.setF_org_id(0);
		
		logDTO.setF_org_name("");
		
		logDTO.setF_user_id(0);
		
		logDTO.setF_user_name( (com.common.utils.CommonUtil.isEmpty(userName)) ? CommonUtil.getCurUser().getUserName() : userName );
		
		logDTO.setF_log_time( new java.sql.Time(Calendar.getInstance().getTimeInMillis()));
		
		logDTO.setF_log_name(module);
		
		logDTO.setF_log_before(op);
		
//		tLogService.saveTLog(logDTO);
		
		MallSysApplication.cac.getBean(ITLogService.class).saveTLog(logDTO);
	}
	
	public static UserModel getCurUser() {
		
		if( null == com.common.utils.CommonUtil.getRequest().getSession().getAttribute("curUser") ) {
			
			return null;
		}
		
		return (UserModel)com.common.utils.CommonUtil.getRequest().getSession().getAttribute("curUser");
	}
	
	/**
	 * 生成四位随机码
	 * @return
	 */
	public static int generateRegisterCode() {
		
        Random ne=new Random();
        
        return ne.nextInt(9999-1000+1)+1000;
	}
	
//	public static void main(String[] args) {
//		
//		CommonUtil.getOrgCode(orgCode);
//		
//	}

//	@Autowired
//    private static ITLogService tLogService;
}
