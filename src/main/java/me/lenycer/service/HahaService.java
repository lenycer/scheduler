package me.lenycer.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by a1100440 on 2018. 5. 30..
 */
@Component
@Profile("haha")
public class HahaService implements SchedulerService {

    @Override
    public void execute() {
        System.out.println("Haha service by haha profile");
    }

    @Override
    public void stop() {
        // TODO clear resource and close
    }
}
