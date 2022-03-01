package main;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.GetDataList;

/**
 * Servlet implementation class Index
 */
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Index() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
    	GetDataList dao = new GetDataList();
    	List<DTO> data = dao.getList();

    	request.setAttribute("data", data);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Index.jsp");
        rd.forward(request, response);
//        request.setAttribute("time", time);

 //       getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
    }

}
