package fr.imie;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/seasons")
public class SeasonServlet extends HttpServlet {

	private List seasons = Arrays.asList("printemps", "été", "automne", "hiver");

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("seasons", seasons);
		request.getRequestDispatcher("/WEB-INF/views/seasons.jsp").forward(request, response);
	}

}
