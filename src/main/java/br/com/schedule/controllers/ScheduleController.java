package br.com.schedule.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.schedule.repositorys.FuncionarioRepository;

@Controller
public class ScheduleController {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@RequestMapping("/")
	public @ResponseBody String home(){
		return "Olá mundo!!!"+funcionarioRepository.findAll();
	}

}
