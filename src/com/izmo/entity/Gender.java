/*package com.izmo.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "ForeignKeyGenderEntity")
@Table(name = "Gender" , uniqueConstraints ={ 
	@UniqueConstraint(columnNames = "gender_id")})
public class Gender implements Serializable{
    *//**
     * @author ABHISHEK MISHRA
     *//*
    private static final long serialVersionUID = 8153596380646236330L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "gender_id", unique = true, nullable = false, length = 20)
    private Integer genderId;
    @Column(name = "gender", nullable = false)
    private String gender;
    @OneToOne(mappedBy = "gender")
    private Student student;
    public Gender() {
    }
    
     public Gender(Integer genderId, String gender, Student student) {
	super();
	this.genderId = genderId;
	this.gender = gender;
	this.student = student;
    }

    public Integer getGenderId() {
        return genderId;
    }
    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    
 }
*/