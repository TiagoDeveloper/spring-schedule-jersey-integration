package br.com.schedule.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.schedule.models.Funcionario;
import br.com.schedule.repositorys.FuncionarioRepository;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{
	
	@Autowired
	private FuncionarioRepository funcionarioRepository; 

	public List<Funcionario> funcionarios() {
		return this.funcionarioRepository.findAll();
	}

}
