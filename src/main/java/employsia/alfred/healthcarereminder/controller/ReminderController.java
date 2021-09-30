package employsia.alfred.healthcarereminder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReminderController {

    @GetMapping("/greeting")
    public @ResponseBody String greeting() {
        return "Hello World";
    }
}
