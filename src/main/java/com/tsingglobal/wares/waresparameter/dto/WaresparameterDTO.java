package com.tsingglobal.wares.waresparameter.dto;

import java.io.Serializable;

/**
* 描述：请修改类、方法注释DTO
* @author Team
* @date Fri Feb 22 04:50:50 CST 2019
*/
public class WaresparameterDTO implements Serializable{

	private static final long serialVersionUID = -1;
	
	
	private long id;
	
	public void setId( final long id){
		
		this.id = id;
	}
	
	public long getId(){
		
		return this.id;
	}
    
	
	private long commodityId;
	
	public void setCommodityId( final long commodityId){
		
		this.commodityId = commodityId;
	}
	
	public long getCommodityId(){
		
		return this.commodityId;
	}
    
	
	private int parameterIscomputer;
	
	public void setParameterIscomputer( final int parameterIscomputer){
		
		this.parameterIscomputer = parameterIscomputer;
	}
	
	public int getParameterIscomputer(){
		
		return this.parameterIscomputer;
	}
    
	
	private String parameterValue;
	
	public void setParameterValue( final String parameterValue){
		
		this.parameterValue = parameterValue;
	}
	
	public String getParameterValue(){
		
		return this.parameterValue;
	}
    
}
