
package main.java.br.com.caiolobo.dao;

import main.java.br.com.caiolobo.dao.generic.GenericDAO;
import main.java.br.com.caiolobo.domain.Cliente;


public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

    public ClienteDAO() {
        super(Cliente.class);
    }
}
