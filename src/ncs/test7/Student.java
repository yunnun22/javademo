package ncs.test7;

public class Student extends Human{
	String number;
	String major;
	
public Student() {
	// TODO Auto-generated constructor stub
}

public Student(String number, String major) {
	super();
	this.number = number;
	this.major = major;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public String getMajor() {
	return major;
}

public void setMajor(String major) {
	this.major = major;
}
@Override
public String toString() {
	
	return String.format("%s %s",number,major);
}
}
