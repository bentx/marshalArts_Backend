package com.marshal.arts.backend.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.marshal.arts.backend.abstact.userAbstract;

@Document("activeuser")
public class ActiveUser {
	 @Id
     private String month;

     private int activeuser;

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getActiveuser() {
		return activeuser;
	}

	public void setActiveuser(int activeuser) {
		this.activeuser = activeuser;
	}

     
  

}
