package me.lenycer;

import me.lenycer.service.SchedulerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by a1100440 on 2018. 5. 30..
 */
@Component
public class LenycerScheduler {

    private static final Logger logger = LoggerFactory.getLogger(LenycerScheduler.class);

    private boolean stop = false;

    @Autowired
    private SchedulerService schedulerService;

    @Scheduled(fixedDelay = 5000)
    public void schedule() {
        if(stop) {
            logger.info("stop [{}] scheduler", schedulerService.getClass().getName());
            schedulerService.stop();
            System.exit(0);
        }

        schedulerService.execute();
    }

    public void stop() {
        this.stop = true;
    }
}
