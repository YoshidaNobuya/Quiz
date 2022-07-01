package quiz5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Category category_i = new Category(0,"VBA");
		Category[] categories = {category_i};
		Monitor monitor_i = new Monitor();

		Question[] q10 = new Question[10];
		for(int i = 0; i < 10; i++) {
			q10[i] = new Question(i);
		}

		//イントロ
		monitor_i.introduction();

		String a = new Scanner(System.in).nextLine();

		//クイズカテゴリ表示
		monitor_i.selectCategory(categories);

		String b = new Scanner(System.in).nextLine();
		int categoNum = Integer.parseInt(b);

		//選択カテゴリーの確認
		monitor_i.checkCategory(categories, categoNum);

		String c = new Scanner(System.in).nextLine();
		int cNum = Integer.parseInt(c);

		if(cNum == 0) {
			System.out.println("スタート");
		}else if(cNum == 1) {

		}else {
			System.out.println("入力に誤りがあります");
		}

		for(int i = 0; i < 10; i++) {

		}
	}

}
