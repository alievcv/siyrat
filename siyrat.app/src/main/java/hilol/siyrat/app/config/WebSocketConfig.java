package hilol.siyrat.app.config;



import hilol.siyrat.app.controller.AddPointWebSocketHandler;
import hilol.siyrat.app.controller.GetUsersRatingWebSocketHandler;
import hilol.siyrat.app.controller.RegistrationWebSocketHandler;
import hilol.siyrat.app.controller.UpdateDateWebSocketHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    @Autowired
    private AddPointWebSocketHandler addPointHandler;
    @Autowired
    private GetUsersRatingWebSocketHandler getUsersRatingHandler;
    @Autowired
    private RegistrationWebSocketHandler registrationHandler;
    @Autowired
    private UpdateDateWebSocketHandler updateDateHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(addPointHandler, "/addPoint").setAllowedOrigins("*");
        registry.addHandler(getUsersRatingHandler, "/getUsersRating").setAllowedOrigins("*");
        registry.addHandler(registrationHandler, "/registration").setAllowedOrigins("*");
        registry.addHandler(updateDateHandler, "/updateDate").setAllowedOrigins("*");
    }
}
