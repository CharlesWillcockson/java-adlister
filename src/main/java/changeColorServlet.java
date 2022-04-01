import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "changeColorServlet", value = "/changeColorServlet")
public class changeColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String newColor = (String)request.getAttribute("bg_color");
        request.setAttribute("newColor", newColor);
        request.getRequestDispatcher("/viewcolor.jsp").forward(request, response);
    }

}
