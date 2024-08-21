

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/authenticationServlet")
public class authenticationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = (String) request.getAttribute("email");
		String password =(String) request.getAttribute("pasword");
		
		boolean isAuthenticated="allen23@gmail.com".equals(username) &&"password".equals(password);
		
		if(isAuthenticated) {
			response.sendRedirect("success.jsp");
			
		}else {
			response.sendRedirect("login.jsp?error=invalid credentials");
		}
	}

	
	}