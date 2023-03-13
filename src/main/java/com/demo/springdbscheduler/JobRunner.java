package com.demo.springdbscheduler;

import com.github.kagkarlsson.scheduler.Scheduler;
import com.github.kagkarlsson.scheduler.task.FailureHandler;
import com.github.kagkarlsson.scheduler.task.helper.OneTimeTask;
import com.github.kagkarlsson.scheduler.task.helper.Tasks;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.time.Instant;

public class JobRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
