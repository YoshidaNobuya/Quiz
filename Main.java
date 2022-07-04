package quiz5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Category category_i = new Category(0,"VBA");
		Category[] categories = {category_i};

		Question[] q10 = new Question[10];
		for(int i = 0; i < 10; i++) {
			q10[i] = new Question();
			q10[i].set(i);
		}

		//イントロ表示
		Monitor.introduction();

		//クイズカテゴリ表示
		Monitor.selectCategory(categories);

		String b = new Scanner(System.in).nextLine();
		if(b == null || b.equals("")) {
			b = "0";
		}
		int categoNum = Integer.parseInt(b);

		//選択カテゴリーの確認
		Monitor.checkCategory(categories, categoNum);

		String c = new Scanner(System.in).nextLine();
		if(c == null || c.equals("")) {
			c = "1";
		}
		int cNum = Integer.parseInt(c);
		System.out.println();

		if(cNum == 0) {
			System.out.println("スタート");

			ShowQuestion showQuestion_i = new ShowQuestion();

			//問題の数だけループして問題画面を表示する
			for(int i = 0; i < q10.length; i++) {
				showQuestion_i.Show(q10[i]);
				System.out.println();
			}

			System.out.println("正解数:"+showQuestion_i.getCount());

			System.out.println("全問終了");
		}else {
			System.out.println("終了");
		}



	}

}