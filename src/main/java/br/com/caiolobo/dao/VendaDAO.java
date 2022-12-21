/**
 *
 */
package main.java.br.com.caiolobo.dao;

import main.java.br.com.caiolobo.dao.generic.GenericDAO;
import main.java.br.com.caiolobo.domain.Venda;
import main.java.br.com.caiolobo.exceptions.DAOException;
import main.java.br.com.caiolobo.exceptions.TipoChaveNaoEncontradaException;

public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {


    public VendaDAO() {
        super(Venda.class);
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        super.alterar(venda);
    }

    @Override
    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        super.alterar(venda);
    }
}
