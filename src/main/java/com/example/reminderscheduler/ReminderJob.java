package com.example.reminderscheduler;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//This class will be used to schedule jobs
@Component
public class ReminderJob {



    //Fire at 12:00 PM every day
    @Scheduled(cron = "${noon.time}" )
    public void RunAt12PM() {
        System.out.println("it is 12 PM now ");
    }


    //  Fire at 10:15 AM every day
    @Scheduled(cron = "${morningten15.time}" )
    public void RunAtNoon() {
        System.out.println("it is  10:15 now ");
    }

    // Fire at 10:30 AM every day
    @Scheduled(cron = "${morningten30.time}" )
    public void RunAtNoon2() {
        System.out.println("it is 10:30 now ");
    }




}
