package com.five.monkey.vi.vhr.dal.entity;

import java.util.Date;

public class User {
	private Long	id;

	private String	identifyId;

	private String	name;

	private String	phone;

	private String	email;

	private String	address;

	private Byte	sex;

	private Date	birthday;

	private Byte	wedLock;

	private String	race;

	private String	place;

	private String	politic;

	private String	school;

	private String	specialty;

	private Byte	topDegree;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentifyId() {
		return identifyId;
	}

	public void setIdentifyId(String identifyId) {
		this.identifyId = identifyId == null ? null : identifyId.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Byte getWedLock() {
		return wedLock;
	}

	public void setWedLock(Byte wedLock) {
		this.wedLock = wedLock;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race == null ? null : race.trim();
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place == null ? null : place.trim();
	}

	public String getPolitic() {
		return politic;
	}

	public void setPolitic(String politic) {
		this.politic = politic == null ? null : politic.trim();
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school == null ? null : school.trim();
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty == null ? null : specialty.trim();
	}

	public Byte getTopDegree() {
		return topDegree;
	}

	public void setTopDegree(Byte topDegree) {
		this.topDegree = topDegree;
	}
}