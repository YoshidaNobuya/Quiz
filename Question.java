package quiz5;

public class Question {
	private int num;		//問題番号
	private String q;		//問題文
	private String[][] select;	//選択肢4つを格納した配列　select[0][0]=問1の選択肢1 select[0][1]=問1の選択肢2 select[0][2]=問1の選択肢3 select[0][3]=問1の選択肢4
	private String comment;		//解説文


	public Question() { }

	public Question(int n) {			//n=0の時
		this.num = n+1;				//問題番号numに１が代入される→問1
		this.q = this.VBA_TEXT[num];		//VBA＿TEXT[0]の中身は問1の問題文。　変数qに問1の問題文を代入→問1の問題文完成！
		this.select = this.VBA_SELECT[num][];	//VBA＿SELSECT[0][]の中身は問1の4択内容。　使い方はフィールドのselect横のコメントに記載。　
		this.comment = this.VBA_COMMENT[num];	//VBA_COMMENT[0]の中身は問1の解説文。　変数commentに問1の解説文を代入→問1の解説文完成！
	}

	public int getNum() {		//n=0の時、【 println(q10[0].getNum()); 】 →　1が表示される
		return num;
	}
	public String getQ() {		//n=0の時、【 println(q10[0].getQ()); 】→　文字列の問1問題文が表示される
		return q;
	}
	public String[][] getSelect() {	//n=0の時、【 println(q10[0].getQ()); 】→　文字列の問1問題文が表示される
		return select;
	}
	public String getComment() {	//n=0の時、【 println(q10[0].getComment()); 】→　文字列の問1解説文が表示される
		return comment;
	}

}
