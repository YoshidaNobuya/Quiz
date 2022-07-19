package model;

import java.util.ArrayList;
import java.util.Collections;

public class QuestionLogicTest {

	// 10問抽出し、選択肢を並び替えて保存するメソッド
	public Question[] setQuestion(ArrayList<Question> qCate) {

		// 選択したカテゴリの問題をランダムに並び替える
		Collections.shuffle(qCate);

		// 選択したカテゴリの問題を10問抽出する
		Question[] q10 = null;

		for (int i = 0; i < 10; i++) {
			q10[i] = new Question(qCate.get(i).getId(), qCate.get(i).getText(), qCate.get(i).getSelect(),
					qCate.get(i).getAns(), qCate.get(i).getComment());
		}

		// 選択肢を並び替える

		return q10;
	}

	public static void main(String[] args) {
		
	}
}
