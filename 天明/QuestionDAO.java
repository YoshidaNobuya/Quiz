package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Question;

public class QuestionDAO {

	//データベース接続に使用する情報
	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/data/Yontakun";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";

	public ArrayList<Question> findAll(int cateNum) {
		ArrayList<Question> questionList = new ArrayList<>();

		cateNum=cateNum*1000;
		int cateNum2=(cateNum+1)*1000;

		//データベース接続
		try (Connection conn = DriverManager.getConnection(
				JDBC_URL, DB_USER, DB_PASS)) {

			//SELECT文の準備
			String sql = "SELECT * FROM QUESTION WHERE ?<ID AND ID<?";
			PreparedStatement pStmt = conn.prepareStatement(sql);

			//SELECT文中の？に使用する値(cateNum,cateNum2)を設定
			pStmt.setInt(1,cateNum);
			pStmt.setInt(2,cateNum2);

			//SELECTを実行
			ResultSet rs = pStmt.executeQuery();

			//SELECT文の結果をArrayListに格納

			while (rs.next()) {
				int id = rs.getInt("id");
				String category = rs.getString("category");
				String text = rs.getString("Q");
				String ans="a";
				String select0 = rs.getString("select0");
				String select1 = rs.getString("select1");
				String select2 = rs.getString("select2");
				String select3 = rs.getString("select3");
				String comment = rs.getString("comment");
				Question question = new Question(id, category,text,ans,select0,select1,select2,select3,comment );
				questionList.add(question);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return questionList;
	}
}