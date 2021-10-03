package employsia.alfred.healthcarereminder.model;

import org.springframework.web.bind.annotation.RestController;

/**
 * Java class defined for slack bot request, to model the JSON payload into Java object with Jackson
 */
@RestController
public class BrokerRequest {

    private String user;
    private String username;
    private String userid;
    private String message;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
