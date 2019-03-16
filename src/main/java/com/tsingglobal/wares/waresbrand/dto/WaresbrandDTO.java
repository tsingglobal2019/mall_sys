package com.tsingglobal.wares.waresbrand.dto;

import java.io.Serializable;

/**
* 描述：请修改类、方法注释DTO
* @author Team
* @date Fri Feb 22 04:50:49 CST 2019
*/
public class WaresbrandDTO implements Serializable{

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
    
	
	private String brandCode;
	
	public void setBrandCode( final String brandCode){
		
		this.brandCode = brandCode;
	}
	
	public String getBrandCode(){
		
		return this.brandCode;
	}
    
	
	private String brandName;
	
	public void setBrandName( final String brandName){
		
		this.brandName = brandName;
	}
	
	public String getBrandName(){
		
		return this.brandName;
	}
    
	
	private String brandFirst;
	
	public void setBrandFirst( final String brandFirst){
		
		this.brandFirst = brandFirst;
	}
	
	public String getBrandFirst(){
		
		return this.brandFirst;
	}
    
	
	private String brandLogo;
	
	public void setBrandLogo( final String brandLogo){
		
		this.brandLogo = brandLogo;
	}
	
	public String getBrandLogo(){
		
		return this.brandLogo;
	}
    
	
	private String brandEnlargedview;
	
	public void setBrandEnlargedview( final String brandEnlargedview){
		
		this.brandEnlargedview = brandEnlargedview;
	}
	
	public String getBrandEnlargedview(){
		
		return this.brandEnlargedview;
	}
    
	
	private String brandStory;
	
	public void setBrandStory( final String brandStory){
		
		this.brandStory = brandStory;
	}
	
	public String getBrandStory(){
		
		return this.brandStory;
	}
    
	
	private int brandIsshow;
	
	public void setBrandIsshow( final int brandIsshow){
		
		this.brandIsshow = brandIsshow;
	}
	
	public int getBrandIsshow(){
		
		return this.brandIsshow;
	}
    
	
	private int brandSelf;
	
	public void setBrandSelf( final int brandSelf){
		
		this.brandSelf = brandSelf;
	}
	
	public int getBrandSelf(){
		
		return this.brandSelf;
	}
    
	
	private int brandOrder;
	
	public void setBrandOrder( final int brandOrder){
		
		this.brandOrder = brandOrder;
	}
	
	public int getBrandOrder(){
		
		return this.brandOrder;
	}
    
}
