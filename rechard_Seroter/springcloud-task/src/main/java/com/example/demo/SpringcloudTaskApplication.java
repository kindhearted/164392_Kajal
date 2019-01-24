package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringcloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudTaskApplication.class, args);
	}

	@Bean
	public TollProcessingTask tollProcessingtask() {
		return new TollProcessingTask();
	}
	
	public class TollProcessingTask implements CommandLineRunner{

		@Override
		public void run(String... string) throws Exception {

			if(null!=string) {
				System.out.println("parameter length"+string.length);
			
				String stationId=string[1];
				String licensePlate=string[1];
				String timeStamp=string[3];
				System.out.println("Station Id is: "+ stationId+" Licence Plate: "+ licensePlate+" Time Stamp is :"+timeStamp);
			
			}
		}
		
	}
	
}

