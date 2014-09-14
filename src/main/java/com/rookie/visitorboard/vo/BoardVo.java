package com.rookie.visitorboard.vo;

public class BoardVo {
	private int boardId;
	private String email;
	private String password;
	private String content;
	private String registeredDate;
	private String updatedDate;
	
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(String registeredDate) {
		this.registeredDate = registeredDate;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdateDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
}
