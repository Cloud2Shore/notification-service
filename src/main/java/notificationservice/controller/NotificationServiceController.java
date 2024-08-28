package notificationservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationServiceController {

    @PostMapping("/sendConfirmation")
    public void sendBookingConfirmation(@RequestParam("userId") String userId) {
        // Placeholder for real notification logic
        System.out.println("Booking confirmation sent to user " + userId);
    }
}

