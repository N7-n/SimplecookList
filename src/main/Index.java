package main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//   	GetData dao = new GetData();
      //  List<DTO> list = dao.getData();
 //       int id=0;
		// 取得したListオブジェクトを順番に取り出し、出力
  //      for(DTO item : list){
 //           id = item.getId();
    //        request.setAttribute("title", item.getTitle());
 //           System.out.println(id);
      //  }
    	request.setAttribute("id", 1);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/result.jsp");
        rd.forward(request, response);
	}

}
