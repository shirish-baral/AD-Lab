import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
    public FormServlet() {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        out.println("<html><body>");
        out.println("<h2>Form Submission Results:</h2>");

        if (name != null && !name.trim().isEmpty() &&
            email != null && !email.trim().isEmpty() &&
            message != null && !message.trim().isEmpty()) {
            out.println("<p><strong>Name:</strong> " + name + "</p>");
            out.println("<p><strong>Email:</strong> " + email + "</p>");
            out.println("<p><strong>Message:</strong> " + message + "</p>");
        } else {
            out.println("<p>Error: All fields are required!</p>");
        }

        out.println("<a href='index.html'>Go back to the form</a>");
        out.println("</body></html>");
    }

    // Also implement doGet to handle potential GET requests
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<p>This servlet expects a POST request. Please use the form to submit data.</p>");
        out.println("<a href='index.html'>Go to the form</a>");
        out.println("</body></html>");
    }
}
