/**
 *
 */
package main.java.br.com.caiolobo.services.generic;

import main.java.br.com.caiolobo.dao.Persistente;
import main.java.br.com.caiolobo.exceptions.DAOException;
import main.java.br.com.caiolobo.exceptions.MaisDeUmRegistroException;
import main.java.br.com.caiolobo.exceptions.TableException;
import main.java.br.com.caiolobo.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericService<T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;


    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;

}
