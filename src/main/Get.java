package main;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Getfo;
/**
 * Servlet implementation class Get
 */
public class Get extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Get() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubresponse.getWriter().append("Served at: ").append(request.getContextPath());
		Getfo dao = new Getfo();
		List<DTO> data = dao.getfo();
		request.setAttribute("data", data);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/une.jsp");
        rd.forward(request, response);

	}
}
