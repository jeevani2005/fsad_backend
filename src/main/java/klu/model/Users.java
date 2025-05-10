package klu.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name="users")
public class Users {
	@Column
String fullname;
	@Column
	@Id
String email;
	public String getFullname() {
		return fullname;
	}
	@Override
	public String toString() {
		return "Users [fullname=" + fullname + ", email=" + email + ", role=" + role + ", password=" + password + "]";
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column
int role;
	@Column
String password;


}