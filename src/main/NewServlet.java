package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class NewServlet
 */
public class NewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stu
	        // CSRF対策
	        request.setAttribute("_token", request.getSession().getId());

	        // おまじないとしてのインスタンスを生成
	        request.setAttribute("dto", new DTO());

	        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/new.jsp");
	        rd.forward(request, response);
	     }/*AddData data = new AddData();
		DTO dto =new DTO();
		dto.setTitle("title");
		dto.setText("text");
		dto.setTime(20);
		dto.setItem("item");
		data.addData("title","text","item",20);*/


}
