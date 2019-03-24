package com.tsingglobal.wares.warescommodityclass.dto;

import java.io.Serializable;

/**
* 描述：请修改类、方法注释DTO
* @author Team
* @date Sun Mar 24 17:27:31 CST 2019
*/
public class WarescommodityclassDTO implements Serializable{

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
    
	
	private String commodityclassName;
	
	public void setCommodityclassName( final String commodityclassName){
		
		this.commodityclassName = commodityclassName;
	}
	
	public String getCommodityclassName(){
		
		return this.commodityclassName;
	}
    
	
	private int commodityPropertynum;
	
	public void setCommodityPropertynum( final int commodityPropertynum){
		
		this.commodityPropertynum = commodityPropertynum;
	}
	
	public int getCommodityPropertynum(){
		
		return this.commodityPropertynum;
	}
    
	
	private int commodityParameternum;
	
	public void setCommodityParameternum( final int commodityParameternum){
		
		this.commodityParameternum = commodityParameternum;
	}
	
	public int getCommodityParameternum(){
		
		return this.commodityParameternum;
	}
    
}
