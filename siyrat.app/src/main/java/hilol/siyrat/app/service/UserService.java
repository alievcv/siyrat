package hilol.siyrat.app.service;



import hilol.siyrat.app.entity.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.socket.WebSocketMessage;

import java.util.List;

public interface UserService {

    void addPoint(Long id);
    void updateUsersBeginningMonthAndWeek();
    ResponseEntity<Users> findById(Long udid);
    void createUser(Users users);
    ResponseEntity<List<Users>> getUsersRating(String type);
    List<Users> getAllUsers();
}
