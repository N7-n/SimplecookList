package main;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Get1Data;
import dao.Getcount;
import dao.Goodadd;

/**
 * Servlet implementation class Gooder
 */
public class Gooder extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Gooder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Goodadd dao1 = new Goodadd();
		Getcount dao2 = new Getcount();
		Get1Data dao = new Get1Data();
		int id=Integer.parseInt(request.getParameter("id"));
		int goodcount=dao2.getcount(id);
		dao1.goodadd(goodcount,id);
    	List<DTO> data = dao.get1Data(id);
    	request.setAttribute("data", data);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/show.jsp");
        rd.forward(request, response);
	}


}
