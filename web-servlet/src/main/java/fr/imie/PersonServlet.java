package fr.imie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/person")
public class PersonServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String toto = (request.getParameter("toto"));
		request.setAttribute("toto", toto);
		request.getRequestDispatcher("form.jsp").forward(request, response);
	}

}
