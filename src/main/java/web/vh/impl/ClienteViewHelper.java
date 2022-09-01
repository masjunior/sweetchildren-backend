
package web.vh.impl;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import core.aplicacao.Resultado;
import dominio.Cliente;
import dominio.EntidadeDominio;
import web.vh.IViewHelper;


public class ClienteViewHelper implements IViewHelper {

	/** 
	 * TODO Descri��o do M�todo
	 * @param request
	 * @param response
	 * @return
	 * @see IViewHelper#getEntidade(HttpServletRequest, HttpServletResponse)
	 */
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		String nome = request.getParameter("txtNome");
		String cpf = request.getParameter("txtCpf");
		String id = request.getParameter("txtId");
		
		
		Cliente c = new Cliente();
		c.setNome(nome);
		
		if(id != null && !id.trim().equals("")){
			c.setId(Integer.parseInt(id));
		}
		
		c.setCpf(cpf);
		return c;
	}

	/** 
	 * TODO Descri��o do M�todo
	 * @param request
	 * @param response
	 * @return
	 * @see IViewHelper#setView(HttpServletRequest, HttpServletResponse)
	 */
	public void setView(Resultado resultado, HttpServletRequest request,
						HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	public void setView(Resultado resultado, ServletConfig config) {
		// TODO Auto-generated method stub
		
	}

}
