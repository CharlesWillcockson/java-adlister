import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "pickColorServlet", value = "/pickColorServlet")
public class pickColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        String color = request.getParameter("bg_color");
        request.setAttribute("bg_color", color);
        request.getRequestDispatcher("changeColorServlet").forward(request, response);
    }

}
