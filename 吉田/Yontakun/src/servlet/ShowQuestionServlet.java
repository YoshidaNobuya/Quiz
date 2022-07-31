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


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// カテゴリ番号をリクエストパラメータから取得
		int cateNum=Integer.parseInt(request.getParameter("cate"));

		//QuestionDAOクラスに処理を依頼
		QuestionDAO qDAO=new QuestionDAO();
		ArrayList<Question> questionList=qDAO.findAll(cateNum);

		//QuestionLogicクラスに処理を依頼
		Question[] q10=new Question[10];
		q10=QuestionLogic.setQuestion(questionList);

		//セッションスコープにインスタンスを保存
		HttpSession session=request.getSession();
		int count=0;
		session.setAttribute("count", count);
		session.setAttribute("q10", q10);

		//showQuestion.jspにフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/showQuestion.jsp");
		dispatcher.forward(request, response);

	}

}