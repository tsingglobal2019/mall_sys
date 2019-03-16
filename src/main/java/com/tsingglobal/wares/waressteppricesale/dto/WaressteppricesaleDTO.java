package com.tsingglobal.wares.waressteppricesale.dto;

import java.io.Serializable;

/**
* 描述：请修改类、方法注释DTO
* @author Team
* @date Fri Feb 22 04:50:50 CST 2019
*/
public class WaressteppricesaleDTO implements Serializable{

	private static final long serialVersionUID = -1;
	
	
	private long id;
	
	public void setId( final long id){
		
		this.id = id;
	}
	
	public long getId(){
		
		return this.id;
	}
    
	
	private long saletypeId;
	
	public void setSaletypeId( final long saletypeId){
		
		this.saletypeId = saletypeId;
	}
	
	public long getSaletypeId(){
		
		return this.saletypeId;
	}
    
	
	private int steppricePurchases;
	
	public void setSteppricePurchases( final int steppricePurchases){
		
		this.steppricePurchases = steppricePurchases;
	}
	
	public int getSteppricePurchases(){
		
		return this.steppricePurchases;
	}
    
	
	private java.math.BigDecimal steppriceDiscount;
	
	public void setSteppriceDiscount( final java.math.BigDecimal steppriceDiscount){
		
		this.steppriceDiscount = steppriceDiscount;
	}
	
	public java.math.BigDecimal getSteppriceDiscount(){
		
		return this.steppriceDiscount;
	}
    
	
	private String mark;
	
	public void setMark( final String mark){
		
		this.mark = mark;
	}
	
	public String getMark(){
		
		return this.mark;
	}
    
}
