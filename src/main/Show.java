package main;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Get1Data;

/**
 * Servlet implementation class Show
 */
public class Show extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Show() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Get1Data dao = new Get1Data();
    	List<DTO> data = dao.get1Data(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("data", data);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/show.jsp");
        rd.forward(request, response);
	}

}
