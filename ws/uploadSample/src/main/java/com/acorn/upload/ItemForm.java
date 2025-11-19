package com.acorn.upload;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;


//사용자 화면에서 데이터를 입력받을 용도 

public class ItemForm {
	
    private Long itemId;
    private String itemName; 
    private List<MultipartFile> imageFiles; 
    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    private Date date;
    
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
    
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public List<MultipartFile> getImageFiles() {
		return imageFiles;
	}
	public void setImageFiles(List<MultipartFile> imageFiles) {
		this.imageFiles = imageFiles;
	}
	public ItemForm(Long itemId, String itemName, List<MultipartFile> imageFiles) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.imageFiles = imageFiles;
	}
    
    
	@Override
	public String toString() {
		return "ItemForm [itemId=" + itemId + ", itemName=" + itemName + ", imageFiles=" + imageFiles + ", date=" + date
				+ "]";
	}
	public ItemForm() {
		// TODO Auto-generated constructor stub
	}
}
