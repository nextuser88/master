package com.izmo.entity;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="STUDENT", uniqueConstraints = {
	@UniqueConstraint(columnNames = "student_id")})
public class Student implements Serializable{
    /**
     * @author ABHISHEK MISHRA
     */
    private static final long serialVersionUID = 9132377068872465513L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "first_name", length = 10)
    @NotEmpty(message = "first name should not be empty")
    private String firstName;
    @Column(name = "last_name", length = 10)
    @NotEmpty(message = "last name should not be empty")
    private String lastName;
    @NotNull(message = "please specify your gender")
    private String gender;
    @Size(min = 6, max = 15, message = "Your password is between 6 and 15 characters")
    private String password;
    @NotEmpty
    @Email(message = "your email id is not in valid format")
    private String email;
    @NotNull
    @Size(min = 10, max = 10 , message = "Phone Number should be of 10 digits")
    private String phoneNumber;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address_id", referencedColumnName = "addressId")
    private Address address;
    public Student() {
    }
    public Student(Integer id, String firstName, String lastName, String gender, String password, String email,
	    String phoneNumber) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.password = password;
	this.email = email;
	this.phoneNumber = phoneNumber;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
  }
