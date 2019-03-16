package com.tsingglobal.wares.waresstandardvalue.dto;

import java.io.Serializable;

/**
* 描述：请修改类、方法注释DTO
* @author Team
* @date Fri Feb 22 04:50:50 CST 2019
*/
public class WaresstandardvalueDTO implements Serializable{

	private static final long serialVersionUID = -1;
	
	
	private long id;
	
	public void setId( final long id){
		
		this.id = id;
	}
	
	public long getId(){
		
		return this.id;
	}
    
	
	private long standardId;
	
	public void setStandardId( final long standardId){
		
		this.standardId = standardId;
	}
	
	public long getStandardId(){
		
		return this.standardId;
	}
    
	
	private String standardvalueName;
	
	public void setStandardvalueName( final String standardvalueName){
		
		this.standardvalueName = standardvalueName;
	}
	
	public String getStandardvalueName(){
		
		return this.standardvalueName;
	}
    
	
	private int standardvalueOrder;
	
	public void setStandardvalueOrder( final int standardvalueOrder){
		
		this.standardvalueOrder = standardvalueOrder;
	}
	
	public int getStandardvalueOrder(){
		
		return this.standardvalueOrder;
	}
    
}
