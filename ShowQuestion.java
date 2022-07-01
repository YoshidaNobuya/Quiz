package quiz5;

public class ShowQuestion {

	//Questionクラス型の配列を引数にとって問題,解答,解説を表示するメソッド
	public void Show(Question q) {

		//問題を表示
		System.out.println("問"+q.getNum());
		System.out.println(q.getQ());

		//選択肢(Stringですべて表示されるので、for文で回さなくてよくなった。)
		System.out.println(q.getSelect());

		//ユーザーに解答を選択してもらう
		String input=new java.util.Scanner(System.in).nextLine();
		int ans=Integer.parseInt(input);

		if(ans==q.getAns()) {
			System.out.println("正解！");
		}else {
			System.out.println("不正解… 正解は"+q.getAns()+"でした。");
		}
			System.out.println(q.getComment());

	}

}
