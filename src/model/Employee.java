/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rajmehta
 */

public class Employee {

	int employeeId, age;
	double cellPhoneNumber;
	String  name, gender, startDate, level, teamInfo, positionTitle, email, photo;
	
		public Employee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Employee(int employeeId, int age, double cellPhoneNumber, String name, String gender, String startDate,
			String level, String teamInfo, String positionTitle, String email, String photo) {
		super();
		this.employeeId = employeeId;
		this.age = age;
		this.cellPhoneNumber = cellPhoneNumber;
		this.name = name;
		this.gender = gender;
		this.startDate = startDate;
		this.level = level;
		this.teamInfo = teamInfo;
		this.positionTitle = positionTitle;
		this.email = email;
		this.photo = photo;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public void setCellPhoneNumber(double cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

    @Override
    public String toString() {
        return "Employee{" + ", age=" + age + ", cellPhoneNumber=" + cellPhoneNumber + ", name=" + name + ", gender=" + gender + ", startDate=" + startDate + ", level=" + level + ", teamInfo=" + teamInfo + ", positionTitle=" + positionTitle + ", email=" + email + ", photo=" + photo + '}';
    }

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getTeamInfo() {
		return teamInfo;
	}

	public void setTeamInfo(String teamInfo) {
		this.teamInfo = teamInfo;
	}

	public String getPositionTitle() {
		return positionTitle;
	}

	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
