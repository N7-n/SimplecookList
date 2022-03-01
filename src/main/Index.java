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
    	  if(request.getSession().getAttribute("flush") != null) {
              // セッションスコープ内のフラッシュメッセージをリクエストスコープに保存し、セッションスコープからは削除する
              request.setAttribute("flush", request.getSession().getAttribute("flush"));
              request.getSession().removeAttribute("flush");
          }
    	request.setAttribute("data", data);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Index.jsp");
        rd.forward(request, response);
    }

}
