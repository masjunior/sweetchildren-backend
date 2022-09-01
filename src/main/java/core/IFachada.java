package core;

import core.aplicacao.Resultado;
import dominio.EntidadeDominio;
import dominio.IEntidade;


public interface IFachada {

	public Resultado salvar(EntidadeDominio entidade);
	public Resultado alterar(EntidadeDominio entidade);
	public Resultado excluir(EntidadeDominio entidade);
	public Resultado consultar(IEntidade entidade);
	public Resultado visualizar(EntidadeDominio entidade);
	
	
}
