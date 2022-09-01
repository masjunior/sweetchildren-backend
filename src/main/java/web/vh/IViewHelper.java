
package web.vh;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import core.aplicacao.Resultado;
import dominio.IEntidade;


public interface IViewHelper {

	public IEntidade getEntidade(HttpServletRequest request);
	
	public void setView(Resultado resultado,
						HttpServletRequest request, HttpServletResponse response)throws ServletException;
	
	public void setView(Resultado resultado, ServletConfig config);
}
