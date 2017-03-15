package com.izmo.entity;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
public class Address implements Serializable{
    
    /**
     * @author ABHISHEK MISHRA
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id", nullable = false)
    private long addressId;
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private Student student;
    public Address(){	
    }
    
    public Address(long addressId, String street, String city, String state, String zipcode, Student student) {
	super();
	this.addressId = addressId;
	this.street = street;
	this.city = city;
	this.state = state;
	this.zipcode = zipcode;
	this.student = student;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
    
}
