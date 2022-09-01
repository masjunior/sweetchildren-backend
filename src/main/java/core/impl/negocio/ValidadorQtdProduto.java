package core.impl.negocio;

import core.IStrategy;
import dominio.IEntidade;
import dominio.Produto;

public class ValidadorQtdProduto implements IStrategy {

	@Override
	public String processar(IEntidade entidade) {
		
		if(entidade instanceof Produto){
			Produto c = (Produto)entidade;
			
			if(c.getQuantidade() < 1){
				return "Quantidade deve ser no minimo 1!";
			}
			
		}else{
			return "Quantidade n�o pode ser v�lidado, pois entidade n�o � um produto!";
		}
		
		
		return null;
	}

}
