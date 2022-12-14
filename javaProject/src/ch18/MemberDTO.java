package ch18;

import java.io.Serializable;

public class MemberDTO implements Serializable{
private String userid;
private String name;
private String passwd;
private String email;
private int	age;

public MemberDTO() {
	// TODO Auto-generated constructor stub
}

public MemberDTO(String userid, String name, String passwd, int age, String email) {
	super();
	this.userid = userid;
	this.name = name;
	this.passwd = passwd;
	this.email = email;
	this.age = age;
}

public String getUserid() {
	return userid;
}

public void setUserid(String userid) {
	this.userid = userid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPasswd() {
	return passwd;
}

public void setPasswd(String passwd) {
	this.passwd = passwd;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public String toString() {
	return "MemberDTO [userid=" + userid + ", name=" + name + ", passwd=" + passwd + ", email=" + email + ", age=" + age
			+ "]";
}




}
