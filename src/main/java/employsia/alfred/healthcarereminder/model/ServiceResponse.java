package employsia.alfred.healthcarereminder.model;

import org.springframework.web.bind.annotation.RestController;

/**
 * Java class defined for service response modelling with Jackson to convert it to JSON format
 */
@RestController
public class ServiceResponse {

    private String response;

    public ServiceResponse() {}

    public ServiceResponse(String message) {
        this.response = message;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
