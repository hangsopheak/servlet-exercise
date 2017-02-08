package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
	
	public static int countUser = 0;
	private int id;
	private String email;
	private String password;
	private Date createdDate;
	private String urlPhoto;
	
	public User(String email, String password, String createdDate, String urlPhoto) throws ParseException {
		countUser++;
		this.id = countUser;
		this.setEmail(email);
		this.setPassword(password);
		this.setCreatedDateFromString(createdDate);
		this.setUrlPhoto(urlPhoto);
	}
	
	public User(String email, String password, String createdDate) throws ParseException {
		countUser++;
		this.id = countUser;
		this.setEmail(email);
		this.setPassword(password);
		this.setCreatedDateFromString(createdDate);
	}
	
	public User(String email, String password, Date createdDate, String urlPhoto) throws ParseException {
		countUser++;
		this.id = countUser;
		this.setEmail(email);
		this.setPassword(password);
		this.setCreatedDate(createdDate);
		this.setUrlPhoto(urlPhoto);
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedDate() {
		return createdDate;
	}
	
	public String getCreatedDateToString(){
		if(this.createdDate != null) return (new SimpleDateFormat("yyyy-MM-dd H:m:s")).format(this.createdDate);
		else return "";
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public void setCreatedDateFromString(String createdDate) throws ParseException{
		if(createdDate != null) this.setCreatedDate((new SimpleDateFormat("yyyy-MM-dd H:m:s")).parse(createdDate));
	}

	public String getUrlPhoto() {
		return (urlPhoto == null ? "":urlPhoto);
	}

	public void setUrlPhoto(String urlPhoto) {
		this.urlPhoto = urlPhoto;
	}
	
	

}
