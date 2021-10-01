package employsia.alfred.healthcarereminder.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class ReminderController {

    private static final ReplyRandomizer replier = new ReplyRandomizer();

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

    @RequestMapping("/help")
    public @ResponseBody String getHelp() {
        return "Health Care Reminder is a distributed system service that reminds users to maintain" +
                " a healthy life style while WFH (Working From Home)\n" +
                "--------------------------------------------------------------------------------\n" +
                "Enter a command for Health Care Reminder service :\n" +
                "help - Get this helping list\n" +
                "water - Get reminder for drinking water after awhile\n" +
                "posture - Get reminder for stretching after awhile\n";
    }

    /**
     * BrokerRequest response to the broker to confirm that this service is running
     * @return Static message to announce it is alive !
     */
    @GetMapping("/alive")
    public @ResponseBody String isAlive() {
        return "HCR service is alive !";
    }

    @PostMapping("/error")
    public @ResponseBody String isError() {
        return "Wrong command is given ! Please try again or use help command to get the full list of available commands!";
    }
}
