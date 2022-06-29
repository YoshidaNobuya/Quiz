package quiz5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Category category_i = new Category(0,"VBA");
		Category[] categories = {category_i};
		Monitor monitor_i = new Monitor();

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
		c.toUpperCase();

		if(c.equals("YES")) {

		}else if(c.equals("NO")) {

		}else {

		}
	}

}
