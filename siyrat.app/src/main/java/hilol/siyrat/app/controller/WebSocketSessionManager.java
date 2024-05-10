package hilol.siyrat.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketSession;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class WebSocketSessionManager {
    @Autowired
    private  AddPointWebSocketHandler registrationHandler;
    private Map<WebSocketSession, String> sessionEndpointMap = new ConcurrentHashMap<WebSocketSession, String>();




}
