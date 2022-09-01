package core.impl.naofuncionais;

import java.util.Date;

import core.IStrategy;
import dominio.EntidadeDominio;
import dominio.IEntidade;


public class ComplementarDtCadastro implements IStrategy {

	@Override
	public String processar(IEntidade entidade) {
		
		
		if(entidade !=null){
			Date data = new Date();		
			((EntidadeDominio)entidade).setDtCadastro(data);
		}else{
			return "Entidade: "+entidade.getClass().getCanonicalName()+" nula!";
		}
		
		
		
		return null;
	}

}
