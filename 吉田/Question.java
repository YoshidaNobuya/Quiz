package model;

public class Question {
	private int id;		//問題番号
	private String text;		//問題文
	private map select;	//選択肢
	private String comment;	//解説文
	
	
	
	public int getId() {
		return id;
	}
	public String getText() {
		return text;
	}
	public String getSelect() {
		return select;
	}
	public String getComment() {
		return comment;
	}
	
	public Question() {
		
	}
	public Question(int id, String text, String[] select, int ans, String comment) {
		
	}
}
