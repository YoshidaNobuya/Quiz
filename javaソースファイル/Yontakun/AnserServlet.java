package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AnserServlet")
public class AnserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AnserServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userAns = request.getParameter("ans");
		String userSelect = request.getParameter("selectText");
		HttpSession session = request.getSession();
		int count = (int) session.getAttribute("count");
		Question[] q10 = (Question[])session.getAttribute("question");
		String seikai = "不正解";
		if(q10[count].getAns().equals(userAns)) {
			seikai = "正解！";
		}
			session.setAttribute("seikai", seikai);
			session.setAttribute("userAns", userAns);
			session.setAttribute("userSelect", userSelect);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/anser.jsp");
		dispatcher.forward(request, response);


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
