package fr.imie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello/*")
public class HelloServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// pathinfo pour récupérer le parametre présent dans /hello/toto
		String pathInfo = request.getPathInfo();
		String username = pathInfo == null ? "" : pathInfo.substring(1);

		request.setAttribute("username", username);
		request.getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(request, response);
	}

}
