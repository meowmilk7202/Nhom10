package vn.iotstar.Entity;

import java.io.Serializable;

import javax.servlet.http.Part;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Builder // Viết method nối chuỗi
@Data // tạo ra get set
@DynamoDBTable(tableName = "faculty") 
public class Faculty implements Serializable {
	
	@DynamoDBHashKey
	@DynamoDBAutoGeneratedKey
    private String facultyId;
	
	@DynamoDBAttribute
    private String facultyName;
	
	@DynamoDBAttribute
    private String image;
	
    private Part file;
    
    @DynamoDBAttribute
    private int deleted;

    

	public Faculty(String facultyName, String image, int deleted) {
		super();
		this.facultyName = facultyName;
		this.image = image;
		this.deleted = deleted;
	}

	public Faculty() {
		// TODO Auto-generated constructor stub
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

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

	public Part getFile() {
		return file;
	}

	public void setFile(Part file) {
		this.file = file;
	}
}
