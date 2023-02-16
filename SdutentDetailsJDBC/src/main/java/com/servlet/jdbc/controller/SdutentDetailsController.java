package com.servlet.jdbc.controller;

import java.io.IOException;

import com.servlet.jdbc.db.RegisterDao;
import com.servlet.jdbc.dto.Sudents;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SdutentDetailsController
 */
@WebServlet("/SdutentDetailsController")
public class SdutentDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public SdutentDetailsController() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Name = request.getParameter("Name");
	    String Rollno = request.getParameter("id");
		String FatherName = request.getParameter("fatherName");
		String whichclass = request.getParameter("whichclass");
		String Phone = request.getParameter("phone");
		String City = request.getParameter("city");
		String State = request.getParameter("state");
		String country = request.getParameter("country");
		Sudents member = new Sudents();
		member.setRollno(Rollno);
		member.setSdu_name(Name);
		member.setFather_name(FatherName);
		member.setSdu_class(whichclass);
		member.setPhone(Phone);
		member.setCity(City);
		member.setState(State);
		member.setCountry(country);
		RegisterDao rDao = new RegisterDao();
	       rDao.save(member);
		request.getRequestDispatcher("SdutentDetailsRedirect").include(request, response);
	}

}
