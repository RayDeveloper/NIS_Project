//813117991
// the database columns file

package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;






@Entity
@Table(name="tbl_employee")
public class Employee {
	
	@NotEmpty
	@Pattern(regexp="^[A-Za-z]*$")
	@Size(min=1, max=20)
    private String fname;
	
	@NotEmpty
	@Pattern(regexp="^[A-Za-z]*$")
	@Size(min=1, max=20)
    private String lname;
	
	@NotNull
    private int nis_num;
	
    
    @Id//primary key
    @Column(name="id",nullable=false, updatable=true)
    @NotNull
	private Long id;
	
	
	@CreationTimestamp
	@Column(name="created_at", nullable=false, updatable=false)
	private Date createdAt;
	
	@UpdateTimestamp
	@Column(name="updated_at")
	private Date updatedAt;
	
	@NotNull
	private double Week1;
	@NotNull
	private double Week2;
	@NotNull
	private double Week3;
	@NotNull
	private double Week4;
	@NotNull
	private double Week5;

	private double Week1Nis;

	private double Week2Nis;

	private double Week3Nis;

	private double Week4Nis;

	private double Week5Nis;

	private double Week1NisTotal;

	private double Week2NisTotal;

	private double Week3NisTotal;

	private double Week4NisTotal;

	private double Week5NisTotal;
	
	
	
	public Long getid() {
		return id;
	}
	public Long id() {
		return id;
	}
	public void setid(Long id) {
		this.id = id;
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public int getnis_num() {
		return nis_num;
	}

	public int nis_num() {
		return nis_num;
	}

	public void setnis_num(int nis_num) {
		this.nis_num = nis_num;
	}


	
	public Date getcreatedAt() {
		return createdAt; 
	}
	
	public Date createdAt() {
		return createdAt; 
	}
	
	public Date getupdatedAt() {
		return updatedAt; 
	}
	
	public Date updatedAt() {
		return updatedAt; 
	}
	
	public void setupdatedAt(Date date) {
		this.updatedAt =date; 
	}
	
	public double getWeek1() {
		return Week1;
	}
	public void setWeek1(double d) {
		Week1 = d;
	}
	public double getWeek2() {
		return Week2;
	}
	public void setWeek2(double week2) {
		Week2 = week2;
	}
	public double getWeek3() {
		return Week3;
	}
	public void setWeek3(double week3) {
		Week3 = week3;
	}
	public double getWeek4() {
		return Week4;
	}
	public void setWeek4(double week4) {
		Week4 = week4;
	}
	public double getWeek5() {
		return Week5;
	}
	public void setWeek5(double week5) {
		Week5 = week5;
	}
	
	
	public void setWeek1Nis(double d) {
		Week1Nis = d;
		
	}
	public void setWeek2Nis(double i) {
		Week2Nis = i;
		
	}
	public void setWeek3Nis(double d) {
		Week3Nis= d;
		
	}
	public void setWeek4Nis(double d) {
		Week4Nis= d;
		
	}
	public void setWeek5Nis(double d) {
		Week5Nis= d;
		
	}
	public void setWeek1NisTotal(double week1NisTotal) {
		Week1NisTotal = week1NisTotal;
	}
	public void setWeek2NisTotal(double week2NisTotal) {
		Week2NisTotal = week2NisTotal;
	}
	public void setWeek3NisTotal(double week3NisTotal) {
		Week3NisTotal = week3NisTotal;
	}
	public void setWeek4NisTotal(double week4NisTotal) {
		Week4NisTotal = week4NisTotal;
	}
	public void setWeek5NisTotal(double week5NisTotal) {
		Week5NisTotal = week5NisTotal;
	}

	public double getWeek1Nis() {
		return Week1Nis;
	}
	public double getWeek2Nis() {
		return Week2Nis;
	}
	public double getWeek3Nis() {
		return Week3Nis;
	}
	public double getWeek4Nis() {
		return Week4Nis;
	}
	public double getWeek5Nis() {
		return Week5Nis;
	}
	public double getWeek1NisTotal() {
		return Week1NisTotal;
	}
	public double getWeek2NisTotal() {
		return Week2NisTotal;
	}
	public double getWeek3NisTotal() {
		return Week3NisTotal;
	}
	public double getWeek4NisTotal() {
		return Week4NisTotal;
	}
	public double getWeek5NisTotal() {
		return Week5NisTotal;
	}
	

}