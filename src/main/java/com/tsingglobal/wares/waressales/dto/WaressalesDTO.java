package com.tsingglobal.wares.waressales.dto;

import java.io.Serializable;

/**
* 描述：请修改类、方法注释DTO
* @author Team
* @date Fri Feb 22 04:50:50 CST 2019
*/
public class WaressalesDTO implements Serializable{

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
    
	
	private int commodityPresenterScore;
	
	public void setCommodityPresenterScore( final int commodityPresenterScore){
		
		this.commodityPresenterScore = commodityPresenterScore;
	}
	
	public int getCommodityPresenterScore(){
		
		return this.commodityPresenterScore;
	}
    
	
	private int commodityPresenterMaxscore;
	
	public void setCommodityPresenterMaxscore( final int commodityPresenterMaxscore){
		
		this.commodityPresenterMaxscore = commodityPresenterMaxscore;
	}
	
	public int getCommodityPresenterMaxscore(){
		
		return this.commodityPresenterMaxscore;
	}
    
	
	private int commodityForenotice;
	
	public void setCommodityForenotice( final int commodityForenotice){
		
		this.commodityForenotice = commodityForenotice;
	}
	
	public int getCommodityForenotice(){
		
		return this.commodityForenotice;
	}
    
	
	private int commodityPublish;
	
	public void setCommodityPublish( final int commodityPublish){
		
		this.commodityPublish = commodityPublish;
	}
	
	public int getCommodityPublish(){
		
		return this.commodityPublish;
	}
    
	
	private int commodityRecommendation;
	
	public void setCommodityRecommendation( final int commodityRecommendation){
		
		this.commodityRecommendation = commodityRecommendation;
	}
	
	public int getCommodityRecommendation(){
		
		return this.commodityRecommendation;
	}
    
	
	private int commodityServiceType;
	
	public void setCommodityServiceType( final int commodityServiceType){
		
		this.commodityServiceType = commodityServiceType;
	}
	
	public int getCommodityServiceType(){
		
		return this.commodityServiceType;
	}
    
	
	private String commoditySubTitle;
	
	public void setCommoditySubTitle( final String commoditySubTitle){
		
		this.commoditySubTitle = commoditySubTitle;
	}
	
	public String getCommoditySubTitle(){
		
		return this.commoditySubTitle;
	}
    
	
	private String commodityDes;
	
	public void setCommodityDes( final String commodityDes){
		
		this.commodityDes = commodityDes;
	}
	
	public String getCommodityDes(){
		
		return this.commodityDes;
	}
    
	
	private String commodityMark;
	
	public void setCommodityMark( final String commodityMark){
		
		this.commodityMark = commodityMark;
	}
	
	public String getCommodityMark(){
		
		return this.commodityMark;
	}
    
	
	private int commoditySalesType;
	
	public void setCommoditySalesType( final int commoditySalesType){
		
		this.commoditySalesType = commoditySalesType;
	}
	
	public int getCommoditySalesType(){
		
		return this.commoditySalesType;
	}
    
}
