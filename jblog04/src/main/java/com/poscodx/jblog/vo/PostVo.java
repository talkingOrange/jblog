package com.poscodx.jblog.vo;

public class PostVo {

	private Long no;
	private String title;
	private String contents;
	private Long category_no;
	private String date;
	
	public PostVo() {
	}

	
	public PostVo(Long no, String title, String contents, Long category_no, String date) {
		super();
		this.no = no;
		this.title = title;
		this.contents = contents;
		this.category_no = category_no;
		this.date = date;
	}


	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Long getCategory_no() {
		return category_no;
	}

	public void setCategory_no(Long category_no) {
		this.category_no = category_no;
	}

	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "PostVo [no=" + no + ", title=" + title + ", contents=" + contents + ", category_no=" + category_no
				+ ", date=" + date + "]";
	}


	
}
