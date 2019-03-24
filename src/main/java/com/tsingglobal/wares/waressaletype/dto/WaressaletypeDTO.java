package com.tsingglobal.wares.waressaletype.dto;

import java.io.Serializable;

/**
* 描述：请修改类、方法注释DTO
* @author Team
* @date Sun Mar 24 17:27:31 CST 2019
*/
public class WaressaletypeDTO implements Serializable{

	private static final long serialVersionUID = -1;
	
	
	private long id;
	
	public void setId( final long id){
		
		this.id = id;
	}
	
	public long getId(){
		
		return this.id;
	}
    
	
	private String salestypeCode;
	
	public void setSalestypeCode( final String salestypeCode){
		
		this.salestypeCode = salestypeCode;
	}
	
	public String getSalestypeCode(){
		
		return this.salestypeCode;
	}
    
}
