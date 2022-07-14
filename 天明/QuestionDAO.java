package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Diary;

public class QuestionDAO {

	//データベース接続に使用する情報
	private final String JDBC_URL="jdbc:h2:tcp://localhost/~/data/myProject";
	private final String DB_USER="sa";
	private final String DB_PASS="";

	public List<Diary> findAll(){
		List<Diary> diaryList=new ArrayList<>();

		//データベース接続
		try(Connection conn=DriverManager.getConnection(
				JDBC_URL,DB_USER,DB_PASS)){

			//SELECT文の準備
			String sql="SELECT ~ FROM ~";
			PreparedStatement pStmt=conn.prepareStatement(sql);

			//SELECTを実行
			ResultSet rs=pStmt.executeQuery();


			//SELECT文の結果をArrayListに格納

			while(rs.next()) {
				int id=rs.getInt("ID");
				String date=rs.getString("DATE");
				String text=rs.getString("TEXT");
				Diary diary=new Diary(id,date,text);
				diaryList.add(diary);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return diaryList;
	}
}
