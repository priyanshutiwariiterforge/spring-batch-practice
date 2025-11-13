package com.example.springbatchpractice;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class SpringBatchPracticeApplication implements CommandLineRunner {
public class SpringBatchPracticeApplication {
//    @Autowired
//    private JobLauncher jobLauncher;
//
//    @Autowired
//    private Job userJob;

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchPracticeApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        jobLauncher.run(userJob,
//                new JobParametersBuilder()
//                        .addLong("startAt", System.currentTimeMillis())
//                        .toJobParameters());
//    }
}
