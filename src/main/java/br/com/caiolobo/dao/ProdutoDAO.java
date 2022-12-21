/**
 * 
 */
package main.java.br.com.caiolobo.dao;

import main.java.br.com.caiolobo.dao.generic.GenericDAO;
import main.java.br.com.caiolobo.domain.Produto;


public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {

	public ProdutoDAO() {
		super(Produto.class);
	}
}
