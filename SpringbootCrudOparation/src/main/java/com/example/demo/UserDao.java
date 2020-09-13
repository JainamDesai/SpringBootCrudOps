package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getSarname() {
		return sarname;
	}
	public void setSarname(String sarname) {
		this.sarname = sarname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String name;
    @Override
	public String toString() {
		return "UserDao [name=" + name + ", lname=" + lname + ", sarname=" + sarname + ", pass=" + pass + ", getName()="
				+ getName() + ", getLname()=" + getLname() + ", getSarname()=" + getSarname() + ", getPass()="
				+ getPass() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public String lname;
    public String sarname;
    public String pass;
}
