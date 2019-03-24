package com.tsingglobal.wares.warespreferentialsale.dto;

import java.io.Serializable;

/**
* 描述：请修改类、方法注释DTO
* @author Team
* @date Sun Mar 24 17:27:31 CST 2019
*/
public class WarespreferentialsaleDTO implements Serializable{

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
    
	
	private java.sql.Time preferentialBegindate;
	
	public void setPreferentialBegindate( final java.sql.Time preferentialBegindate){
		
		this.preferentialBegindate = preferentialBegindate;
	}
	
	public java.sql.Time getPreferentialBegindate(){
		
		return this.preferentialBegindate;
	}
    
	
	private java.sql.Time preferentialEnddate;
	
	public void setPreferentialEnddate( final java.sql.Time preferentialEnddate){
		
		this.preferentialEnddate = preferentialEnddate;
	}
	
	public java.sql.Time getPreferentialEnddate(){
		
		return this.preferentialEnddate;
	}
    
	
	private java.math.BigDecimal preferentialPrice;
	
	public void setPreferentialPrice( final java.math.BigDecimal preferentialPrice){
		
		this.preferentialPrice = preferentialPrice;
	}
	
	public java.math.BigDecimal getPreferentialPrice(){
		
		return this.preferentialPrice;
	}
    
	
	private String mark;
	
	public void setMark( final String mark){
		
		this.mark = mark;
	}
	
	public String getMark(){
		
		return this.mark;
	}
    
}
