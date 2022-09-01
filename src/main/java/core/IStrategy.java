package core;

import dominio.IEntidade;


public interface IStrategy 
{

	public String processar(IEntidade entidade);
	
}
