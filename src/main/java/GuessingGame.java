import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/GuessingGame")
public class GuessingGame extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("guessinggame.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double answer = Math.floor(Math.random() * 3) + 1;
        String guess = request.getParameter("guess");
        double guessInt = Integer.parseInt(guess);

        response.getWriter().println(guessInt);
        response.getWriter().println(answer);

        if (guessInt > 3 || guessInt < 1) {
            response.sendRedirect("/guessinggame.jsp");
        } else {

            if (answer == guessInt) {
                String result = "You won!";
                request.setAttribute("result", result);
                request.getRequestDispatcher("correctServlet").forward(request, response);
            } else {
                String result = "You lose!";
                request.setAttribute("result", result);
                request.getRequestDispatcher("incorrectServlet").forward(request, response);
            }
        }
    }
}
