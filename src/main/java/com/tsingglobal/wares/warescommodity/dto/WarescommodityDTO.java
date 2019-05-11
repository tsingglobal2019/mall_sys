package com.tsingglobal.wares.warescommodity.dto;

import java.io.Serializable;

/**
* 描述：请修改类、方法注释DTO
* @author Team
* @date Mon Mar 25 00:07:55 CST 2019
*/
public class WarescommodityDTO implements Serializable{

	private static final long serialVersionUID = -1;
	
	
	private long id;
	
	public void setId( final long id){
		
		this.id = id;
	}
	
	public long getId(){
		
		return this.id;
	}
    
	
	private String commodityCode;
	
	public void setCommodityCode( final String commodityCode){
		
		this.commodityCode = commodityCode;
	}
	
	public String getCommodityCode(){
		
		return this.commodityCode;
	}
    
	
	private String commodityName;
	
	public void setCommodityName( final String commodityName){
		
		this.commodityName = commodityName;
	}
	
	public String getCommodityName(){
		
		return this.commodityName;
	}
    
	
	private String commodityTitle;
	
	public void setCommodityTitle( final String commodityTitle){
		
		this.commodityTitle = commodityTitle;
	}
	
	public String getCommodityTitle(){
		
		return this.commodityTitle;
	}
    
	
	private String commodityDes;
	
	public void setCommodityDes( final String commodityDes){
		
		this.commodityDes = commodityDes;
	}
	
	public String getCommodityDes(){
		
		return this.commodityDes;
	}
    
	
	private String commodityNum;
	
	public void setCommodityNum( final String commodityNum){
		
		this.commodityNum = commodityNum;
	}
	
	public String getCommodityNum(){
		
		return this.commodityNum;
	}
    
	
	private java.math.BigDecimal commodityPrice;
	
	public void setCommodityPrice( final java.math.BigDecimal commodityPrice){
		
		this.commodityPrice = commodityPrice;
	}
	
	public java.math.BigDecimal getCommodityPrice(){
		
		return this.commodityPrice;
	}
    
	
	private java.math.BigDecimal commodityMarketPrice;
	
	public void setCommodityMarketPrice( final java.math.BigDecimal commodityMarketPrice){
		
		this.commodityMarketPrice = commodityMarketPrice;
	}
	
	public java.math.BigDecimal getCommodityMarketPrice(){
		
		return this.commodityMarketPrice;
	}
    
	
	private int commodityInventory;
	
	public void setCommodityInventory( final int commodityInventory){
		
		this.commodityInventory = commodityInventory;
	}
	
	public int getCommodityInventory(){
		
		return this.commodityInventory;
	}
    
	
	private int measurementUnit;
	
	public void setMeasurementUnit( final int measurementUnit){
		
		this.measurementUnit = measurementUnit;
	}
	
	public int getMeasurementUnit(){
		
		return this.measurementUnit;
	}
    
	
	private java.math.BigDecimal commodityWeight;
	
	public void setCommodityWeight( final java.math.BigDecimal commodityWeight){
		
		this.commodityWeight = commodityWeight;
	}
	
	public java.math.BigDecimal getCommodityWeight(){
		
		return this.commodityWeight;
	}
    
	
	private int commodityLabel;
	
	public void setCommodityLabel( final int commodityLabel){
		
		this.commodityLabel = commodityLabel;
	}
	
	public int getCommodityLabel(){
		
		return this.commodityLabel;
	}
    
	
	private int commodityOrder;
	
	public void setCommodityOrder( final int commodityOrder){
		
		this.commodityOrder = commodityOrder;
	}
	
	public int getCommodityOrder(){
		
		return this.commodityOrder;
	}
    
	
	private int commoditySalesVolume;
	
	public void setCommoditySalesVolume( final int commoditySalesVolume){
		
		this.commoditySalesVolume = commoditySalesVolume;
	}
	
	public int getCommoditySalesVolume(){
		
		return this.commoditySalesVolume;
	}
    
	
	private int commodityAuditState;
	
	public void setCommodityAuditState( final int commodityAuditState){
		
		this.commodityAuditState = commodityAuditState;
	}
	
	public int getCommodityAuditState(){
		
		return this.commodityAuditState;
	}
    
	
	private String commodityImgPath;
	
	public void setCommodityImgPath( final String commodityImgPath){
		
		this.commodityImgPath = commodityImgPath;
	}
	
	public String getCommodityImgPath(){
		
		return this.commodityImgPath;
	}
    
}
