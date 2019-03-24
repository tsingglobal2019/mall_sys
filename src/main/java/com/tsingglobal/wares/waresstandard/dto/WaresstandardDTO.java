package com.tsingglobal.wares.waresstandard.dto;

import java.io.Serializable;

/**
* 描述：请修改类、方法注释DTO
* @author Team
* @date Sun Mar 24 17:27:31 CST 2019
*/
public class WaresstandardDTO implements Serializable{

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
    
	
	private String standardName;
	
	public void setStandardName( final String standardName){
		
		this.standardName = standardName;
	}
	
	public String getStandardName(){
		
		return this.standardName;
	}
    
}
