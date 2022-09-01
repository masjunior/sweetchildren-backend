
package web.vh.impl;

import core.aplicacao.Resultado;
import dominio.IEntidade;
import web.vh.IViewHelper;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class HomeViewHelper implements IViewHelper {

	public IEntidade getEntidade(HttpServletRequest request) {
		
		return null;
	}

	
	public void setView(Resultado resultado, HttpServletRequest request,
						HttpServletResponse response)  throws ServletException {

		try {
			response.sendRedirect("home.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}


	public void setView(Resultado resultado, ServletConfig config) {
		// TODO Auto-generated method stub
		
	}

}
