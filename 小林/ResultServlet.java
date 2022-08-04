package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ResultServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		int count = (int) session.getAttribute("count");


		if(count == 0) {
			session.setAttribute("dummy", "");
		}
		String dummy = (String) session.getAttribute("dummy");
		String userSelect = (String) session.getAttribute("userSelect");
		session.setAttribute("dummy", userSelect);

		if (dummy.equals(userSelect)) {
			//もう一度同じページを表示
			RequestDispatcher dispatcher = request.getRequestDispatcher("/ShowQuestionServlet?cate=0");
			dispatcher.forward(request, response);
		}else {
			if(count < 9) {
				count++;
				session.setAttribute("count",count);
				//ShowQuestionServletに処理をパス
				//response.sendRedirect("/ShowQuestionServlet?cate=0");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/ShowQuestionServlet?cate=0");
				dispatcher.forward(request, response);

			}else {
				//リザルト画面を表示
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
				dispatcher.forward(request, response);
			}
		}



	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
