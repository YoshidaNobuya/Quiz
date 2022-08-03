package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.QuestionDAO;
import model.Question;
import model.QuestionLogic;

@WebServlet("/ShowQuestionServlet")
public class ShowQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// カテゴリ番号をリクエストパラメータから取得
		int cateNum = Integer.parseInt(request.getParameter("cate")); // カテゴリ番号

		if (cateNum > 0 && cateNum < 8) {	//１問目開始時は問題を設定する処理を行う
			// QuestionDAOクラスに処理を依頼
			QuestionDAO qDAO = new QuestionDAO();
			ArrayList<Question> questionList = qDAO.findAll(cateNum);

			// QuestionLogicクラスに処理を依頼
			Question[] q10 = new Question[10];
			q10 = QuestionLogic.setQuestion(questionList);

			// セッションスコープにインスタンスを保存
			int count = 0; // 問題数カウント
			HttpSession session = request.getSession();
			session.setAttribute("count", count);
			session.setAttribute("q10", q10);
		} else if (cateNum == 0) {
			// 2問目以降は上記処理をスキップする
		} else {
			// 不正な値を受け取ったらTOPページに戻る
			HttpSession session = request.getSession();
			session.invalidate();
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/top.jsp");
			dispatcher.forward(request, response);
		}

		// showQuestion.jspにフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/showQuestion.jsp");
		dispatcher.forward(request, response);

	}

}