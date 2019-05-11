package com.tsingglobal.wares.waresmembersale.dto;

import java.io.Serializable;

/**
* 描述：请修改类、方法注释DTO
* @author Team
* @date Mon Mar 25 00:07:55 CST 2019
*/
public class WaresmembersaleDTO implements Serializable{

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
    
	
	private int membersaleGold;
	
	public void setMembersaleGold( final int membersaleGold){
		
		this.membersaleGold = membersaleGold;
	}
	
	public int getMembersaleGold(){
		
		return this.membersaleGold;
	}
    
	
	private int membersaleSilver;
	
	public void setMembersaleSilver( final int membersaleSilver){
		
		this.membersaleSilver = membersaleSilver;
	}
	
	public int getMembersaleSilver(){
		
		return this.membersaleSilver;
	}
    
	
	private int membersaleDiamod;
	
	public void setMembersaleDiamod( final int membersaleDiamod){
		
		this.membersaleDiamod = membersaleDiamod;
	}
	
	public int getMembersaleDiamod(){
		
		return this.membersaleDiamod;
	}
    
	
	private String mark;
	
	public void setMark( final String mark){
		
		this.mark = mark;
	}
	
	public String getMark(){
		
		return this.mark;
	}
    
}
