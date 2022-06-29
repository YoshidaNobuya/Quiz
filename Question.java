package quiz5;

public class Question {
	private int num;
	private String q;
	private String[] select;
	private int ans;
	private String comment;

	public Question() { }

	public Question(int num, String q, String[] select, int ans, String comment) {
		this.num = num;
		this.q = q;
		this.select = select;
		this.ans = ans;
		this.comment = comment;
	}

	public int getNum() {
		return num;
	}
	public String getQ() {
		return q;
	}
	public String[] getSelect() {
		return select;
	}
	public int getAns() {
		return ans;
	}
	public String getComment() {
		return comment;
	}

}
