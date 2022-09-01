
package web.vh.impl;

import core.aplicacao.Resultado;
import dominio.IEntidade;
import dominio.Marca;
import web.vh.IViewHelper;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarcaViewHelper implements IViewHelper {

	public IEntidade getEntidade(HttpServletRequest request) {

		return new Marca();
	}

	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		

	}

	public void setView(Resultado resultado, ServletConfig config) {
		config.getServletContext().setAttribute("resultadoMarca", resultado);
		
	}

}
