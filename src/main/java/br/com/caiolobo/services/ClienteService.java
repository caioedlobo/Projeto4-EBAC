/**
 * 
 */
package main.java.br.com.caiolobo.services;

import main.java.br.com.caiolobo.dao.IClienteDAO;
import main.java.br.com.caiolobo.domain.Cliente;
import main.java.br.com.caiolobo.exceptions.MaisDeUmRegistroException;
import main.java.br.com.caiolobo.exceptions.TableException;
import main.java.br.com.caiolobo.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf){
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			e.printStackTrace();
		}
		return null;
	}

}
