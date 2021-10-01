package employsia.alfred.healthcarereminder.controller;

import employsia.alfred.healthcarereminder.validator.RequestValidator;
import org.springframework.web.bind.annotation.*;


@RestController
public class ReminderController {

    public static final ReplyRandomizer replier = new ReplyRandomizer();

    /**
     * Debugging function
     * @return
     */
    @GetMapping({"/","/greeting"})
    public @ResponseBody String getGreeting() {
        return "Hello World !";
    }

    @PostMapping("/posture")
    public @ResponseBody String getPostureReminder() {
        return replier.getPostureMessage();
    }

    @PostMapping("/water")
    public @ResponseBody String getWaterReminder() {
        return replier.getWaterMessage();
    }

    /**
     * BrokerRequest response to the broker to confirm that this service is running
     * @return Static message to announce it is alive !
     */
    @GetMapping("/alive")
    public @ResponseBody String isAlive() {
        return "HCR service is alive !";
    }
}
