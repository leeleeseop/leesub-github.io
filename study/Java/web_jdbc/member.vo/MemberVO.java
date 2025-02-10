package com.webjjang.member.vo;

public class MemberVO {

	private String id;
	private String name;
	private String birth;
	private String tel;
	private String gradeName;
	private String status;
	private String gender;
	private String email;
	private String regdate;
	private String conDate;
	private String newMsgCnt;
	private String photo;
	private int gradeNo;
	private String pw;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getConDate() {
		return conDate;
	}
	public void setConDate(String conDate) {
		this.conDate = conDate;
	}
	public String getNewMsgCnt() {
		return newMsgCnt;
	}
	public void setNewMsgCnt(String newMsgCnt) {
		this.newMsgCnt = newMsgCnt;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getGradeNo() {
		return gradeNo;
	}
	public void setGradeNo(int gradeNo) {
		this.gradeNo = gradeNo;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", birth=" + birth + ", tel=" + tel + ", gradeName="
				+ gradeName + ", status=" + status + ", gender=" + gender + ", email=" + email + ", regdate=" + regdate
				+ ", conDate=" + conDate + ", newMsgCnt=" + newMsgCnt + ", photo=" + photo + ", gradeNo=" + gradeNo
				+ ", pw=" + pw + "]";
	}
	

		
	
}
