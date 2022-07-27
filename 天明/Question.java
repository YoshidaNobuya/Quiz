package model;

public class Question {
	private int id;		 //
	private String category; //
	private String Q;	 //
	private String select0;	 //
	private String select1;	 //
	private String select2;	 //
	private String select3;	 //



	public int getId() {
		return id;
	}
	public String getCategory() {
		return category;
	}
	public String getQ() {
		return Q;
	}
	public String getSelect0() {
		return select0;
	}
	public String getSelect1() {
		return select1;
	}
	public String getSelect2() {
		return select2;
	}
	public String getSelect3() {
		return select3;
	}
	public String getComment() {
		return comment;
	}

	public Question() {

	}
	public Question(int id, String category, String Q, String select0, String select1 ,String select2,String select3) {

	}
}