package com.real_estate.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Land {
	
	@Id
	@GeneratedValue
	private int id;
	private String description;
	private int price;
	private String location;
	private String about;
	private String photo,photo1;
	
	public Land() {
		
	}
	public Land(int id, String description, int price, String location,String about,String photo,String photo1) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
		this.location = location;
		this.about=about;
		this.photo=photo;
		this.photo1=photo1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getPhoto1() {
		return photo1;
	}
	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}
	@Override
	public String toString() {
		return "Land [id=" + id + ", description=" + description + ", price=" + price + ", location=" + location
				+ ", about=" + about + ", photo=" + photo + ", photo1=" + photo1 + "]";
	}
	
}
