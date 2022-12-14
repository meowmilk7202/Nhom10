package vn.iotstar.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data // tạo ra get set
@DynamoDBTable(tableName = "student")
public class Student implements Serializable {

	@DynamoDBHashKey
	@DynamoDBAutoGeneratedKey
	private String id;
	
	@DynamoDBAttribute
	private String mssv;
	
	@DynamoDBAttribute
	private String username;
	
	@DynamoDBAttribute
	private String studentClassId;
	
	@DynamoDBAttribute
	private String name;
	
	@DynamoDBAttribute
	private String dob;
	
	@DynamoDBAttribute
	private String image;
	
	@DynamoDBAttribute
	private String address;
	
	@DynamoDBAttribute
	private String gender;
	
	@DynamoDBAttribute
	private String phone;
	
	@DynamoDBAttribute
	private int deleted;
	
	@DynamoDBAttribute
	private String facultyId;

	public String getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getStudentClassId() {
		return studentClassId;
	}

	public void setStudentClassId(String studentClassId) {
		this.studentClassId = studentClassId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public String getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}

	public Student(String id, String mssv, String studentClassId, String name, String dob, String image, String address,
			String gender, String phone, int deleted, String facultyId) {
		super();
		this.id = id;
		this.mssv = mssv;
		this.studentClassId = studentClassId;
		this.name = name;
		this.dob = dob;
		this.image = image;
		this.address = address;
		this.gender = gender;
		this.phone = phone;
		this.deleted = deleted;
		this.facultyId = facultyId;
	}

	public Student() {
		super();
	}

}
