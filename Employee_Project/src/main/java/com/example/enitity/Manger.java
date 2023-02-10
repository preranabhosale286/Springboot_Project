package com.example.enitity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Manger {
	
private String MName;
private int MId;
private int MSalary;
private String MDept;
public String getMName() {
	return MName;
}
public void setMName(String mName) {
	MName = mName;
}
public int getMId() {
	return MId;
}
public void setMId(int mId) {
	MId = mId;
}
public int getMSalary() {
	return MSalary;
}
public void setMSalary(int mSalary) {
	MSalary = mSalary;
}
public String getMDept() {
	return MDept;
}
public void setMDept(String mDept) {
	MDept = mDept;
}
public Manger(String mName, int mId, int mSalary, String mDept) {
	super();
	MName = mName;
	MId = mId;
	MSalary = mSalary;
	MDept = mDept;
}
public Manger() {
	super();
	// TODO Auto-generated constructor stub
}


}
