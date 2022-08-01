package model;

public class Question {
	private int id;		 //
	private String category; //
	private String text;	 //
	private String ans;
	private String select0;	 //
	private String select1;	 //
	private String select2;	 //
	private String select3;	 //
	private String comment;  //


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category=category;
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text=text;
	}

	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans=ans;
	}

	public String getSelect0() {
		return select0;
	}
	public void setSelect0(String select0) {
		this.select0=select0;
	}

	public String getSelect1() {
		return select1;
	}
	public void setSelect1(String select1) {
		this.select1=select1;
	}

	public String getSelect2() {
		return select2;
	}
	public void setSelect2(String select2) {
		this.select2=select2;
	}

	public String getSelect3() {
		return select3;
	}
	public void setSelect3(String select3) {
		this.select3=select3;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment=comment;
	}

	public Question() {

	}
	public Question(int id, String category, String text, String ans,String select0, String select1 ,String select2,String select3,String comment) {
		this.id=id;
		this.category=category;
		this.text=text;
		this.ans=ans;
		this.select0=select0;
		this.select1=select1;
		this.select2=select2;
		this.select3=select3;
		this.comment=comment;
	}
}