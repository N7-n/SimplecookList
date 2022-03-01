import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AddData;
import main.DTO;


/**
 * Servlet implementation class CreateServlet
 */
public class Create extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create() {
        super();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		// TODO Auto-generated method stub
    	String _token = request.getParameter("_token");
        if(_token != null && _token.equals(request.getSession().getId())) {
		AddData data = new AddData();
		DTO dto =new DTO();
		String title =request.getParameter("title");
		String text =request.getParameter("text");
		String item =request.getParameter("item");
		int time =Integer.parseInt(request.getParameter("time"));
		dto.setTitle(title);
		dto.setText(text);
		dto.setTime(time);
		dto.setItem(item);
		data.addData(title,text,item,time);
        response.sendRedirect(request.getContextPath() + "/Index");
        }

    }

}
