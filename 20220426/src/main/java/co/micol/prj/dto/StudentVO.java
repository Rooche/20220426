package co.micol.prj.dto;

import java.sql.Date;

public class StudentVO { //VO는 Value Object
	// 객체를 값처럼 쓸 수 있고, 제약사항 중 하나는 객체의 인스턴스 변수가 생성자를 통해서 일단 설정된 후에는 결코 변하지 않음을 보장
	private String studentId; //학번
	private String name; //이름
	private int age; //나이
	private String gender; //성별
	private Date birthDay; //생년월일
	
	public StudentVO() {
	}

	public StudentVO(String name) { //새로만든 생성자 오버로딩
		this.name = name;
	}
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) { 
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	public String toString() { //toString() 메소드를 오버라이드함
		System.out.print(studentId + " : ");
		System.out.print(name + " : ");
		System.out.print(age + " : ");
		System.out.print(birthDay + " : ");
		System.out.println(gender);
		return null; //출력하고 끝낸다는 의미
	}
}
