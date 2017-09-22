package da2.jmro.u1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import da2.jmro.u1.Operacion;

/**
 * Servlet implementation class CalcularServlet
 */
@WebServlet("/CalcularServlet")
public class CalcularServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcularServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double  value1=Double.parseDouble(request.getParameter("value1"));
		double  value2=Double.parseDouble(request.getParameter("value2"));
		Operacion operacion= new Operacion();
		
		operacion.setValue1(value1);
		operacion.setValue2(value2);
		request.setAttribute("op", operacion);
		RequestDispatcher dispatcher= request.getRequestDispatcher("resultado.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
