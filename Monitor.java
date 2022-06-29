package quiz5;

public class Monitor {

	public void introduction() {
		System.out.println("ようこそ第5クイズへ");
		System.out.print("スタート(＞の横でENTER)＞");
	}

	public void selectCategory(Category[] category) {
		System.out.println("+---------------------------------------+");
		System.out.println("|クイズカテゴリーの選択\t\t\t\t\t|");
		for(int i = 0; i < category.length; i++){
		System.out.println("|カテゴリー" + category[i].getNum() + ":" + category[i].getName() + "\t\t\t\t\t\t|");
		}
		System.out.println("|\t\t\t\t\t\t\t\t\t\t|");
		System.out.println("|上記のカテゴリから解きたいカテゴリー\t|");
		System.out.println("|の数字を入力してください。\t\t\t\t|");
		System.out.println("+---------------------------------------+");
		System.out.print("入力＞");
	}

	public void checkCategory(Category[] categories, int num) {
		System.out.println("カテゴリー" + num + ":" + categories[num].getName() +"が選択されました。");
		System.out.print("・スタート\t…　0\n・キャンセル\t…　1\n入力＞");
	}

	public void yesOrNo(String c) {

	}

}
