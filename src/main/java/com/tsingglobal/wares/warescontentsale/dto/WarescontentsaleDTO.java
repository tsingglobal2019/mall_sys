package com.tsingglobal.wares.warescontentsale.dto;

import java.io.Serializable;

/**
* 描述：请修改类、方法注释DTO
* @author Team
* @date Fri Feb 22 04:50:50 CST 2019
*/
public class WarescontentsaleDTO implements Serializable{

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
    
	
	private java.math.BigDecimal contentPrice;
	
	public void setContentPrice( final java.math.BigDecimal contentPrice){
		
		this.contentPrice = contentPrice;
	}
	
	public java.math.BigDecimal getContentPrice(){
		
		return this.contentPrice;
	}
    
	
	private java.math.BigDecimal contentDiscountprice;
	
	public void setContentDiscountprice( final java.math.BigDecimal contentDiscountprice){
		
		this.contentDiscountprice = contentDiscountprice;
	}
	
	public java.math.BigDecimal getContentDiscountprice(){
		
		return this.contentDiscountprice;
	}
    
	
	private String mark;
	
	public void setMark( final String mark){
		
		this.mark = mark;
	}
	
	public String getMark(){
		
		return this.mark;
	}
    
}
