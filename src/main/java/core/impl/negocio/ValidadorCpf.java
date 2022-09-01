package core.impl.negocio;

import core.IStrategy;
import dominio.Cliente;
import dominio.IEntidade;

public class ValidadorCpf implements IStrategy {

	@Override
	public String processar(IEntidade entidade) {
		
		if(entidade instanceof Cliente){
			Cliente c = (Cliente)entidade;
			
			if(c.getCpf().length() < 9){
				return "CPF deve conter 14 digitos!";
			}
			
		}else{
			return "CPF n�o pode ser v�lidado, pois entidade n�o � um cliente!";
		}
		
		
		return null;
	}

}
