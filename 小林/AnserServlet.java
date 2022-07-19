package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Question;

@WebServlet("/AnserServlet")
public class AnserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AnserServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userAnsText = request.getParameter("ans");
		int userAns = Integer.parseInt(userAnsText);

		String userSelect = request.getParameter("selectText");

		HttpSession session = request.getSession();
		int count = (int) session.getAttribute("count");
		int seikai = (int) session.getAttribute("seikai");
		Question[] q10 = (Question[])session.getAttribute("question");

		//回答と正解を照合
		String result = "不正解";
		if(q10[count].getAns() == userAns) {
			result = "正解！";
			//総正解数のカウントを１増やす
			seikai++;
		}

			session.setAttribute("seikai", seikai);
			session.setAttribute("result", result);
			session.setAttribute("userAns", userAns);
			session.setAttribute("userSelect", userSelect);

		//
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/anser.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
