package br.com.schedule.tasks;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class ScheduleTask {
	
//	A B C D E F
	
//	A: Segundos (0 – 59).
//	B: Minutos (0 – 59).
//	C: Horas (0 – 23).
//	D: Dia (1 – 31).
//	E: Mês (1 – 12).
//	F: Dia da semana (0 – 6).
	
	@Scheduled(cron="1 */10 3 * * *")
	public void teste(){
		System.out.println("Fixed delay task - " + System.currentTimeMillis() / 1000);
	}

}
