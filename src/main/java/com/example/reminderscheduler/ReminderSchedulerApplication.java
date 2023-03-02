package com.example.reminderscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //For Scheduled Jobs
public class ReminderSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReminderSchedulerApplication.class, args);
    }

}
