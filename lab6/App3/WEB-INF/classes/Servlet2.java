import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        
        // Retrieve data from session
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
        String roll = (String) session.getAttribute("roll");
        String address = (String) session.getAttribute("address");
        
        // Display the data
        pw.println("<h3>Submitted Data:</h3>");
        pw.println("Name: " + name + "<br>");
        pw.println("Roll Number: " + roll + "<br>");
        pw.println("Address: " + address);
    }
}