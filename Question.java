package quiz5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question {
	private int num;		//問題番号
	private String q;		//問題文
	private String select;	//選択肢
	private int ans;		//正解の数字
	private String comment;	//解説文

	//VBA問題文一覧
	private final String[] VBA_TEXT = {
			"マクロを含むExcelブックの拡張子は？",//問1の問題文
			"cells(1,1)と同じセル番地はどれ？",
			"VBAの変数宣言で最初につけるのは？",
			"2バイトの整数型　-32768～32767を表す型は？",
			"If文の始め方　If 条件式【 ？ 】命令①　～　【 ？ 】に入るのは？",
			"命令文を記述する際の改行は？\r\n",
			"For文　For 変数＝初期値　【 ？ 】　終値　～処理～　Next　変数　　【 ？ 】に入るのは？",
			"ユーザーのコントロールに対する操作とプロシージャの操作を紐づけたものを何という？",
			"データの最終行位置の取得（下方向へ）",
			"ユーザー定義関数を定義するときは、関数名の前と記述の終わりに○○を記述する"//問10の問題文
	};

	//VBA選択肢一覧
	private final String[][] VBA = new String[][] {
		{".xlsm",".xlsx",".vba",".exe"},//問１の選択肢
		{"Range(\"A1\")","Range(A1)","Range(A,1)","cells(A,1)"},
		{"Dim","As","Int","Variant"},
		{"Integer型","Int型","Double型","Long型"},
		{"Then","Else","TRUE","'＝＝"},
		{"␣_（半角スペース+半角アンダーバー）","vbCrLf","␣br","\\n"},
		{"To","next","for","if"},
		{"イベントプロシージャ","ユーザーフォーム","ユーザー定義関数","イベントハンドラ"},
		{"End(xlDown).Row","End(xlDown).Column","End(xlUp).Row","End(xlDown).Column"},
		{"Function","main","Youser","Sub"}//問10の選択肢
	};

	//VBA解説一覧
	private final String[] VBA_COMMENT = {
			".xlsxはＥｘｃｅｌブックの拡張子。マクロを有効にするには、.xlsmにする。",//問1の解説文
			"””（ダブルコーテーション）を忘れない。",
			"変数を使うときはDim宣言をすること。",
			"Integer型になるので注意！",
			"Then　忘れがちなので注意。",
			"vbCrLfはセル内の改行。",
			"To　Tは大文字なので注意。",
			"イベントにはClick、Change、Initializeなどがある。",
			"下方向はxlDown、右方向はxlRignt",
			"End　の後ろにも記述するのを忘れない。"//問10の解説文
	};
	public Question() { }

	public Question(int num) {
		this.num = num;
		this.q = VBA_TEXT[num];
		this.comment = VBA_COMMENT[num];


		/*VBA[][]は、問題毎の選択肢とその内容を保存している二次元配列です。
		VBA[要素1][要素2]
		要素1は問題番号に対応する選択肢を表す。
		要素2は4つある選択肢の1つの内容を表す。*/

		//要素2の値をランダムにすることで問題で表示される選択肢の順番がランダムになる。

		List<Integer> sNum = Arrays.asList(0,1,2,3);
		//リストsNumの中に保存されている0,1,2,3の値をランダムでシャッフル
		Collections.shuffle(sNum);

		//答えの番号を保存する
		/*VBA[num][0]に正解の選択k氏が保存されているので
		シャッフルされたリストの何番目に0が保存されているのかfor文で確認*/

		for(int i = 0; i < sNum.size(); i++) {
			if(sNum.get(i) == 0) {

				this.ans = (i+1);
				/*問題文では0～3ではなく1～4で表示されるので
				(i+1)をして答えに代入*/
			}
		}

		//改行コードを使った文字列で選択肢を表現
		//1：VBAの選択肢\n
		//2：VBAの選択肢\n
		//3：VBAの選択肢\n
		//4：VBAの選択肢
		this.select = "1：" + VBA[num][sNum.get(0)] + "\n2：" + VBA[num][sNum.get(1)] + "\n3：" + VBA[num][sNum.get(2)] + "\n4：" + VBA[num][sNum.get(3)];

	}

	public int getNum() {			//問題番号の取り出し
		return num;
	}
	public String getQ() {			//問題文の取り出し
		return q;
	}
	public String getSelect() {		//選択肢の取り出し
		return select;
	}
	public int getAns() {
		return ans;
	}

	public String getComment() {	//解説文の取り出し
		return comment;
	}

}
