package br.com.schedule.resources;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;
import br.com.schedule.models.Funcionario;
import br.com.schedule.repositorys.FuncionarioRepository;
import br.com.schedule.services.FuncionarioService;

@Path("FuncionarioResources")
public class FuncionarioResources {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	@GET
	@Path("/funcionariosRepo")
	@Produces("application/json")
	public List<Funcionario> funcionariosRepo() {
		return this.funcionarioRepository.findAll();
	}
	@GET
	@Path("/funcionarios")
	@Produces("application/json")
	public List<Funcionario> funcionarios() {
		return this.funcionarioService.funcionarios();
	}
	@GET
	@Path("/funcionariosMock")
	@Produces("application/json")
	public List<Funcionario> funcionariosMock() {
		return Arrays.asList(new Funcionario(1l,"Tiago",24,new Date()));
	}
}
