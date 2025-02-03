import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get form parameters
        String name = request.getParameter("name");
        String roll = request.getParameter("roll");
        String address = request.getParameter("address");
        
        // Store in session
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("roll", roll);
        session.setAttribute("address", address);
        
        // Redirect to servlet2
        response.sendRedirect("servlet2");
    }
}