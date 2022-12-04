package com.marshal.arts.backend.bean;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user")

public class User {
	@Id
   private String id;
   private String name;
   private String mobile;
   private String type;
   private boolean yellow;
   private boolean red;
   private boolean green1;
   private boolean blue1;
   private boolean red1;
   private boolean orange;
   private boolean maroon;
   private boolean brownandblack;
   private boolean purple;
   private boolean black;
   private boolean blue;
   private boolean green;
   private boolean brown;
   private Date bluedate;
   private Date blackdate;
   private Date browndate;
   private Date greendate;
   private Date yellowdate;
   private Date reddate;
   private Date blue1date;
   private Date green1date;
   private Date redate;
   private Date red1date;
   private Date maroondate;
   private Date orangedate;
   private Date purpledate;
   private Date brownandblackdate;

   
   
   
public Date getBrowndate() {
	return browndate;
}
public void setBrowndate(Date browndate) {
	this.browndate = browndate;
}
public boolean isYellow() {
	return yellow;
}
public void setYellow(boolean yellow) {
	this.yellow = yellow;
}
public Date getYellowdate() {
	return yellowdate;
}
public void setYellowdate(Date yellowdate) {
	this.yellowdate = yellowdate;
}
public Date getReddate() {
	return reddate;
}
public void setReddate(Date reddate) {
	this.reddate = reddate;
}
public Date getBlue1date() {
	return blue1date;
}
public void setBlue1date(Date blue1date) {
	this.blue1date = blue1date;
}
public Date getGreen1date() {
	return green1date;
}
public void setGreen1date(Date green1date) {
	this.green1date = green1date;
}
public Date getRedate() {
	return redate;
}
public void setRedate(Date redate) {
	this.redate = redate;
}
public Date getRed1date() {
	return red1date;
}
public void setRed1date(Date red1date) {
	this.red1date = red1date;
}
public Date getMaroondate() {
	return maroondate;
}
public void setMaroondate(Date maroondate) {
	this.maroondate = maroondate;
}
public Date getOrangedate() {
	return orangedate;
}
public void setOrangedate(Date orangedate) {
	this.orangedate = orangedate;
}
public Date getPurpledate() {
	return purpledate;
}
public void setPurpledate(Date purpledate) {
	this.purpledate = purpledate;
}
public Date getBrownandblackdate() {
	return brownandblackdate;
}
public void setBrownandblackdate(Date brownandblackdate) {
	this.brownandblackdate = brownandblackdate;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

public boolean isRed() {
	return red;
}
public void setRed(boolean red) {
	this.red = red;
}
public boolean isGreen1() {
	return green1;
}
public void setGreen1(boolean green1) {
	this.green1 = green1;
}
public boolean isBlue1() {
	return blue1;
}
public void setBlue1(boolean blue1) {
	this.blue1 = blue1;
}
public boolean isRed1() {
	return red1;
}
public void setRed1(boolean red1) {
	this.red1 = red1;
}
public boolean isOrange() {
	return orange;
}
public void setOrange(boolean orange) {
	this.orange = orange;
}
public boolean isMaroon() {
	return maroon;
}
public void setMaroon(boolean maroon) {
	this.maroon = maroon;
}
public boolean isBrownandblack() {
	return brownandblack;
}
public void setBrownandblack(boolean brownandblack) {
	this.brownandblack = brownandblack;
}
public boolean isPurple() {
	return purple;
}
public void setPurple(boolean purple) {
	this.purple = purple;
}
public Date getBluedate() {
	return bluedate;
}
public void setBluedate(Date bluedate) {
	this.bluedate = bluedate;
}
public Date getBlackdate() {
	return blackdate;
}
public void setBlackdate(Date blackdate) {
	this.blackdate = blackdate;
}
public Date getGreendate() {
	return greendate;
}
public void setGreendate(Date greendate) {
	this.greendate = greendate;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}

public boolean isBlack() {
	return black;
}
public void setBlack(boolean black) {
	this.black = black;
}
public boolean isBlue() {
	return blue;
}
public void setBlue(boolean blue) {
	this.blue = blue;
}
public boolean isGreen() {
	return green;
}
public void setGreen(boolean green) {
	this.green = green;
}
public boolean isBrown() {
	return brown;
}
public void setBrown(boolean brown) {
	this.brown = brown;
}
   
   
   
	
	
}
