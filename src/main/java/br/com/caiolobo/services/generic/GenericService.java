/**
 *
 */
package main.java.br.com.caiolobo.services.generic;

import main.java.br.com.caiolobo.dao.Persistente;
import main.java.br.com.caiolobo.dao.generic.IGenericDAO;
import main.java.br.com.caiolobo.exceptions.DAOException;
import main.java.br.com.caiolobo.exceptions.MaisDeUmRegistroException;
import main.java.br.com.caiolobo.exceptions.TableException;
import main.java.br.com.caiolobo.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;
public abstract class GenericService<T extends Persistente, E extends Serializable>
        implements IGenericService<T, E> {

    protected IGenericDAO<T, E> dao;

    protected GenericService(IGenericDAO<T, E> dao) {
        this.dao = dao;
    }

    @Override
    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(T entity) throws DAOException {
        this.dao.excluir(entity);
    }

    @Override
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
        return this.dao.consultar(valor);
    }

    @Override
    public Collection<T> buscarTodos() throws DAOException {
        return this.dao.buscarTodos();
    }

}
