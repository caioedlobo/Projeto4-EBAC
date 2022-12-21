/**
 * 
 */
package main.java.br.com.caiolobo.services;

import main.java.br.com.caiolobo.dao.IProdutoDAO;
import main.java.br.com.caiolobo.domain.Produto;
import main.java.br.com.caiolobo.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
