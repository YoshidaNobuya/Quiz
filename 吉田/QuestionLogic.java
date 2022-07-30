package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuestionLogic {

	// 10問抽出し、選択肢を並び替えて保存するメソッド
	public static Question[] setQuestion(ArrayList<Question> questionList) {

		// 選択したカテゴリの問題をランダムに並び替える
		Collections.shuffle(questionList);

		// 選択したカテゴリの問題を10問抽出する
		Question[] q10 = new Question[10];
		for (int i = 0; i < 10; i++) {
			q10[i] = questionList.get(i);

			// String型のListを生成しshuffleメソッドを使ってa,b,c,dの順番を並び替える
			List<String> shuffleAns = Arrays.asList("a", "b", "c", "d");
			Collections.shuffle(shuffleAns);

			// 正解肢を更新
			q10[i].setAns(shuffleAns.get(0));

			// 一時保管用の配列を用意
			String[] temp = { q10[i].getSelect0(), q10[i].getSelect1(), q10[i].getSelect2(), q10[i].getSelect3() };

			// select0～3をシャッフルした順番に並び替える
			for (int j = 0; j < 4; j++) {
				switch (shuffleAns.get(j)) {
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
}
