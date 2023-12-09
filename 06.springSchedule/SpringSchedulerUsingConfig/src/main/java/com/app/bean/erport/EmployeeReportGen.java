package com.app.bean.erport;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmployeeReportGen {
// 1000 milli Second = 1 Second
	@Scheduled(fixedDelay = 5000)
	public void genReport() {
		System.out.println(new Date());
	}
}
