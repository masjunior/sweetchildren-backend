
package web.command;

import core.aplicacao.Resultado;
import dominio.IEntidade;


public interface ICommand {

	public Resultado execute(IEntidade entidade);
	
}
