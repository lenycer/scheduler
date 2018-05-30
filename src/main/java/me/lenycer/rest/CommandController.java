package me.lenycer.rest;

import me.lenycer.LenycerScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by a1100440 on 2018. 5. 30..
 */
@RestController
public class CommandController {

    @Autowired
    private LenycerScheduler lenycerScheduler;

    @Value("${scheduler.stop.key}")
    private String key;

    @RequestMapping("/scheduler/stop")
    public String stop(@RequestParam String key) {
        Optional.ofNullable(key).ifPresent(k -> {
            if(k.equals(key)) {
                lenycerScheduler.stop();
            }
        });

        return "stop command";
    }
}
