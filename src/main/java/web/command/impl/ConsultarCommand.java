
package web.command.impl;

import core.aplicacao.Resultado;
import dominio.EntidadeDominio;
import dominio.IEntidade;


public class ConsultarCommand extends AbstractCommand{

	
	public Resultado execute(IEntidade entidade) {
		
		return fachada.consultar((EntidadeDominio)entidade);
	}

}
