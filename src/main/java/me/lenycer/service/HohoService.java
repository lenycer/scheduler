package me.lenycer.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by a1100440 on 2018. 5. 30..
 */
@Component
@Profile("hoho")
public class HohoService implements SchedulerService {

    @Override
    public void execute() {
        System.out.println("Hoho service by hoho profile");
    }

    @Override
    public void stop() {
        // TODO clear resource and close
    }
}
