
package web.command.impl;

import core.aplicacao.Resultado;
import dominio.EntidadeDominio;
import dominio.IEntidade;


public class SalvarCommand extends AbstractCommand{

	
	public Resultado execute(IEntidade entidade) {
		
		return fachada.salvar((EntidadeDominio) entidade);
	}

}
