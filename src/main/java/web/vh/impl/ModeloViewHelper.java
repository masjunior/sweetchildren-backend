
package web.vh.impl;

import core.aplicacao.Resultado;
import dominio.IEntidade;
import dominio.Modelo;
import web.vh.IViewHelper;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ModeloViewHelper implements IViewHelper {

	public IEntidade getEntidade(HttpServletRequest request) {
		
			return new Modelo();
		
	}

	
	public void setView(Resultado resultado, HttpServletRequest request,
						HttpServletResponse response)  throws ServletException {
		
		
			
	}


	public void setView(Resultado resultado, ServletConfig config) {
		config.getServletContext().setAttribute("resultadoModelo", resultado);
		
	}

}
