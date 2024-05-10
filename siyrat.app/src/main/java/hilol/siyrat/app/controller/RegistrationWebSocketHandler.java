package hilol.siyrat.app.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import hilol.siyrat.app.entity.Users;
import hilol.siyrat.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component

public class RegistrationWebSocketHandler extends TextWebSocketHandler {
    @Autowired
    private UserService userService;

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {

        String payload = message.getPayload();
        ObjectMapper mapper = new ObjectMapper();
        Users user = mapper.readValue(payload, Users.class);
        userService.createUser(user);
    }
}
