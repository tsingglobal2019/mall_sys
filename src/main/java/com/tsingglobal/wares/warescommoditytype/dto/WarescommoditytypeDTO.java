package com.tsingglobal.wares.warescommoditytype.dto;

import java.io.Serializable;

/**
* 描述：请修改类、方法注释DTO
* @author Team
* @date Mon Mar 25 00:07:55 CST 2019
*/
public class WarescommoditytypeDTO implements Serializable{

	private static final long serialVersionUID = -1;
	
	
	private long id;
	
	public void setId( final long id){
		
		this.id = id;
	}
	
	public long getId(){
		
		return this.id;
	}
    
	
	private long pid;
	
	public void setPid( final long pid){
		
		this.pid = pid;
	}
	
	public long getPid(){
		
		return this.pid;
	}
    
	
	private String commoditytypeCode;
	
	public void setCommoditytypeCode( final String commoditytypeCode){
		
		this.commoditytypeCode = commoditytypeCode;
	}
	
	public String getCommoditytypeCode(){
		
		return this.commoditytypeCode;
	}
    
	
	private String commoditytypeName;
	
	public void setCommoditytypeName( final String commoditytypeName){
		
		this.commoditytypeName = commoditytypeName;
	}
	
	public String getCommoditytypeName(){
		
		return this.commoditytypeName;
	}
    
	
	private int commoditytypeLevel;
	
	public void setCommoditytypeLevel( final int commoditytypeLevel){
		
		this.commoditytypeLevel = commoditytypeLevel;
	}
	
	public int getCommoditytypeLevel(){
		
		return this.commoditytypeLevel;
	}
    
	
	private int commodityNum;
	
	public void setCommodityNum( final int commodityNum){
		
		this.commodityNum = commodityNum;
	}
	
	public int getCommodityNum(){
		
		return this.commodityNum;
	}
    
	
	private String commoditytypeMeasurementunit;
	
	public void setCommoditytypeMeasurementunit( final String commoditytypeMeasurementunit){
		
		this.commoditytypeMeasurementunit = commoditytypeMeasurementunit;
	}
	
	public String getCommoditytypeMeasurementunit(){
		
		return this.commoditytypeMeasurementunit;
	}
    
	
	private int commoditytypeOrder;
	
	public void setCommoditytypeOrder( final int commoditytypeOrder){
		
		this.commoditytypeOrder = commoditytypeOrder;
	}
	
	public int getCommoditytypeOrder(){
		
		return this.commoditytypeOrder;
	}
    
	
	private int commoditytypeShow;
	
	public void setCommoditytypeShow( final int commoditytypeShow){
		
		this.commoditytypeShow = commoditytypeShow;
	}
	
	public int getCommoditytypeShow(){
		
		return this.commoditytypeShow;
	}
    
	
	private int commoditytypeNavigationshow;
	
	public void setCommoditytypeNavigationshow( final int commoditytypeNavigationshow){
		
		this.commoditytypeNavigationshow = commoditytypeNavigationshow;
	}
	
	public int getCommoditytypeNavigationshow(){
		
		return this.commoditytypeNavigationshow;
	}
    
	
	private String commoditytypeImgpath;
	
	public void setCommoditytypeImgpath( final String commoditytypeImgpath){
		
		this.commoditytypeImgpath = commoditytypeImgpath;
	}
	
	public String getCommoditytypeImgpath(){
		
		return this.commoditytypeImgpath;
	}
    
	
	private String commoditytypeKeyword;
	
	public void setCommoditytypeKeyword( final String commoditytypeKeyword){
		
		this.commoditytypeKeyword = commoditytypeKeyword;
	}
	
	public String getCommoditytypeKeyword(){
		
		return this.commoditytypeKeyword;
	}
    
	
	private String commoditytypeDes;
	
	public void setCommoditytypeDes( final String commoditytypeDes){
		
		this.commoditytypeDes = commoditytypeDes;
	}
	
	public String getCommoditytypeDes(){
		
		return this.commoditytypeDes;
	}
    
}
