package quiz5;

public class Question {
	private int num;		//問題番号
	private String q;		//問題文
	private String select;	//選択肢
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


		//選択肢をランダムに配置するために４つのint型を宣言
		int a,b,c,d;

		//変数aにランダムで0～3の値を代入
		a = new java.util.Random().nextInt(4);

		//変数bにランダムで0～3の値を代入
		b = new java.util.Random().nextInt(4);
		//bの値がaと同じになると同じ選択肢が2つ表示されてしまうので、aに代入された値以外が出るまでループ
		while(b == a) {
			b = new java.util.Random().nextInt(4);
		}

		c = new java.util.Random().nextInt(4);
		//cの値がa、bの値と被らなくなるなるまでループ
		while(c==a && c==b) {
			c = new java.util.Random().nextInt(4);
		}
		d = new java.util.Random().nextInt(4);
		//dの値がa、b、cの値と被らなくなるなるまでループ
		while(d==a && d==b && d==c) {
			d = new java.util.Random().nextInt(4);
		}

		//改行コードを使った文字列で選択肢を表現
		//1：VBAの選択肢\n
		//2：VBAの選択肢\n
		//3：VBAの選択肢\n
		//4：VBAの選択肢
		this.select = "1：" + VBA[num][a] + "\n2：" + VBA[num][b] + "\n3：" + VBA[num][c] + "\n4：" + VBA[num][d];

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
	public String getComment() {	//解説文の取り出し
		return comment;
	}

}
