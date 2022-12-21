/**
 * 
 */
package main.java.br.com.caiolobo.dao;

import main.java.br.com.caiolobo.dao.generic.IGenericDAO;
import main.java.br.com.caiolobo.domain.Venda;
import main.java.br.com.caiolobo.exceptions.DAOException;
import main.java.br.com.caiolobo.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
