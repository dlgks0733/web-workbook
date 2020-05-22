package web.spms.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.spms.dao.MySqlMemberDAO;
import web.spms.vo.Member;

/**
 * Servlet implementation class MemberAddServlet
 */
@WebServlet("/member/add")
public class MemberAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("viewUrl", "/member/MemberForm.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ServletContext sc = this.getServletContext();
			MySqlMemberDAO memberDao = (MySqlMemberDAO)sc.getAttribute("memberDAO");
			
			Member member = (Member) request.getAttribute("member");
			memberDao.insert(member);
			
			request.setAttribute("viewUrl", "redirect:list.do");
			
			
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

}
