package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuestionLogicTest {

	// 10問抽出し、選択肢を並び替えて保存するメソッド
	public static QuestionTest[] setQuestion(ArrayList<QuestionTest> qCate) { // qCate:データベースから取ってきたままの状態

		// 選択したカテゴリの問題をランダムに並び替える
		Collections.shuffle(qCate);

		// 選択したカテゴリの問題を10問抽出する
		QuestionTest[] q10 = new QuestionTest[10];

		for (int i = 0; i < 10; i++) {
			q10[i]=qCate.get(i);
			
			
			// shuffleを使うためにansをListに変換
			List<String> ans = Arrays.asList("a","b","c","d");
			// リストansの中に保存されているa,b,c,dの値をランダムでシャッフル
			Collections.shuffle(ans);
			q10[i].setAns(ans.get(0));
			
			String[] temp = { q10[i].getSelect0(), q10[i].getSelect1(), q10[i].getSelect2(), q10[i].getSelect3() };
			
			
			// select0～3をシャッフルした順番に並び替える
			for (int j = 0; j < 4; j++) {
				switch (ans.get(j)) {
				case "a":
					q10[i].setSelect0(temp[j]);
					break;
				case "b":
					q10[i].setSelect1(temp[j]);
					break;
				case "c":
					q10[i].setSelect2(temp[j]);
					break;
				case "d":
					q10[i].setSelect3(temp[j]);
					break;

				default:
					break;
				}
			}

		}
		return q10;
	}

	public static void main(String[] args) {
		ArrayList<QuestionTest> qCate = new ArrayList<QuestionTest>();
		QuestionTest[] q10=new QuestionTest[10];
		
		for (int i = 0; i < 12; i++) {
		qCate.add(i,new QuestionTest());
		System.out.println(qCate.get(i));
		}
		q10=setQuestion(qCate);
		for (int i = 0; i < 10; i++) {
		System.out.println(q10);
	}
	}
}
