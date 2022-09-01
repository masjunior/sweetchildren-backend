
package web.command.impl;

import core.aplicacao.Resultado;
import dominio.EntidadeDominio;
import dominio.IEntidade;


public class AlterarCommand extends AbstractCommand{

	
	public Resultado execute(IEntidade entidade) {
		
		return fachada.alterar((EntidadeDominio) entidade);
	}

}
