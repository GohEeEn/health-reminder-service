package employsia.alfred.healthcarereminder.controller;

import employsia.alfred.healthcarereminder.model.BrokerRequest;
import employsia.alfred.healthcarereminder.model.ServiceResponse;
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
    public @ResponseBody ServiceResponse getPostureReminder(@RequestBody BrokerRequest request) {
        return new ServiceResponse(replier.getPostureMessage(request.getUsername()));
    }

    @PostMapping("/water")
    public @ResponseBody ServiceResponse getWaterReminder(@RequestBody BrokerRequest request) {
        return new ServiceResponse(replier.getWaterMessage(request.getUsername()));
    }

    @RequestMapping("/help")
    public @ResponseBody ServiceResponse getHelp() {
        return new ServiceResponse(
                "Health Care Reminder is a distributed system service that reminds users to maintain" +
                " a healthy life style while WFH (Working From Home)\n" +
                "--------------------------------------------------------------------------------\n" +
                "Enter a command for Health Care Reminder service :\n" +
                "help - Get this helping list\n" +
                "water - Get reminder for drinking water after awhile\n" +
                "posture - Get reminder for stretching after awhile\n"
        );
    }

    /**
     * BrokerRequest response to the broker to confirm that this service is running
     * @return Static message to announce it is alive !
     */
    @GetMapping("/alive")
    public @ResponseBody ServiceResponse isAlive() {
        return new ServiceResponse("HCR service is alive !");
    }

    @PostMapping("/error")
    public @ResponseBody ServiceResponse isError() {
        return new ServiceResponse("Wrong payload given ! Please try again or use help command to get the full list of available commands!");
    }
}
