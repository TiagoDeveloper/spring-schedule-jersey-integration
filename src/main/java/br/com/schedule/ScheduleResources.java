package br.com.schedule;

import org.glassfish.jersey.server.ResourceConfig;

import br.com.schedule.resources.FuncionarioResources;

public class ScheduleResources extends ResourceConfig{

	public ScheduleResources(){
		register(FuncionarioResources.class);
	}
}
