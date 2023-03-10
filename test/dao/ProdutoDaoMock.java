/**
 *
 */
package dao;

import main.java.br.com.caiolobo.dao.IProdutoDAO;
import main.java.br.com.caiolobo.domain.Produto;
import main.java.br.com.caiolobo.exceptions.DAOException;

import java.util.Collection;

public class ProdutoDaoMock implements IProdutoDAO {

    @Override
    public Produto cadastrar(Produto entity) {
        return new Produto();
    }

    @Override
    public void excluir(Produto entity) throws DAOException {
        // TODO Auto-generated method stub
    }

    @Override
    public Produto alterar(Produto entity) {
        return new Produto();
    }

    @Override
    public Produto consultar(String valor) {
        Produto produto = new Produto();
        produto.setCodigo(valor);
        return produto;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return null;
    }

}
