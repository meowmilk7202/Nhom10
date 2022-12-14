package vn.iotstar.Model;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
@JacksonStdImpl
@Data
public class AdminModel {
	private String id;
	private String username;
	private String name;
	private String phone;
	private String image;
	private int deleted;
	private MultipartFile imageFile;
	private Boolean isEdit = false;

	public AdminModel() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public Boolean getIsEdit() {
		return isEdit;
	}

	public void setIsEdit(Boolean isEdit) {
		this.isEdit = isEdit;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public MultipartFile getImageFile() {
		return imageFile;
	}

	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AdminModel(String id, String username, String name, String phone, String image, int deleted,
			MultipartFile imageFile, Boolean isEdit) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.phone = phone;
		this.image = image;
		this.deleted = deleted;
		this.imageFile = imageFile;
		this.isEdit = isEdit;
	}

}
