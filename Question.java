package quiz5;

public class Question {
	private int num;
	private String q;
	private String select;
	private String comment;

	private final String[] VBA_TEXT = {
			"マクロを含むExcelブックの拡張子は？",
			"cells(1,1)と同じセル番地はどれ？",
			"VBAの変数宣言で最初につけるのは？",
			"2バイトの整数型　-32768～32767を表す型は？",
			"If文の始め方　If 条件式【 ？ 】命令①　～　【 ？ 】に入るのは？",
			"命令文を記述する際の改行は？\r\n",
			"For文　For 変数＝初期値　【 ？ 】　終値　～処理～　Next　変数　　【 ？ 】に入るのは？",
			"ユーザーのコントロールに対する操作とプロシージャの操作を紐づけたものを何という？",
			"データの最終行位置の取得（下方向へ）",
			"ユーザー定義関数を定義するときは、関数名の前と記述の終わりに○○を記述する"
	};
	private final String[][] VBA = new String[][] {
		{".xlsm",".xlsx",".vba",".exe"},
		{"Range(\"A1\")","Range(A1)","Range(A,1)","cells(A,1)"},
		{"Dim","As","Int","Variant"},
		{"Integer型","Int型","Double型","Long型"},
		{"Then","Else","TRUE","'＝＝"},
		{"␣_（半角スペース+半角アンダーバー）","vbCrLf","␣br","\\n"},
		{"To","next","for","if"},
		{"イベントプロシージャ","ユーザーフォーム","ユーザー定義関数","イベントハンドラ"},
		{"End(xlDown).Row","End(xlDown).Column","End(xlUp).Row","End(xlDown).Column"},
		{"Function","main","Youser","Sub"}
	};
	private final String[] VBA_COMMENT = {
			".xlsxはＥｘｃｅｌブックの拡張子。マクロを有効にするには、.xlsmにする。",
			"””（ダブルコーテーション）を忘れない。",
			"変数を使うときはDim宣言をすること。",
			"Integer型になるので注意！",
			"Then　忘れがちなので注意。",
			"vbCrLfはセル内の改行。",
			"To　Tは大文字なので注意。",
			"イベントにはClick、Change、Initializeなどがある。",
			"下方向はxlDown、右方向はxlRignt",
			"End　の後ろにも記述するのを忘れない。"
	};
	public Question() { }

	public Question(int num) {
		this.num = num;
		this.q = VBA_TEXT[num];
		int a,b,c,d; 								//選択肢をランダムにするための変数を宣言
		a = new java.util.Random().nextInt(4);		//
		b = new java.util.Random().nextInt(4);
		while(b == a) {
			b = new java.util.Random().nextInt(4);
		}
		c = new java.util.Random().nextInt(4);
		while(c==a && c==b) {
			c = new java.util.Random().nextInt(4);
		}
		d = new java.util.Random().nextInt(4);
		while(d==a && d==b && d==c) {
			d = new java.util.Random().nextInt(4);
		}
		this.select = "1:" + VBA[num][a] + "\n2:" + VBA[num][b] + "\n3:" + VBA[num][c] + "\n4:" + VBA[num][d];
		this.comment = VBA_COMMENT[num];
	}

	public int getNum() {
		return num;
	}
	public String getQ() {
		return q;
	}
	public String getSelect() {
		return select;
	}
	public String getComment() {
		return comment;
	}

}
