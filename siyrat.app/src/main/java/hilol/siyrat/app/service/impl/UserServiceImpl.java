package hilol.siyrat.app.service.impl;




import hilol.siyrat.app.entity.Users;
import hilol.siyrat.app.repository.UserRepository;
import hilol.siyrat.app.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.WebSocketMessage;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    private final UserRepository userRepository;


    @Override
    public void addPoint(Long id) {

    }
    @Override
    public ResponseEntity<Users> findById(Long id) {
        return null;
    }

    @Override
    public void updateUsersBeginningMonthAndWeek() {

    }

    @Override
    public void createUser(Users users) {
        userRepository.save(users);
    }

    @Override
    public ResponseEntity<List<Users>> getUsersRating(String type) {
        return null;
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

//    @Override
//    public void addPoint(Long id) {
//        List<Users> users1 = userRepository.findAll();
//        if (users1.isEmpty()){
//            return;
//        }
//        Optional<Users> user = userRepository.findById(id);
//        if (user.isPresent()) {
//            Users user1 = user.get();
//            user1.getRating().setAllRating(user1.getRating().getAllRating()+5);
//
//            userRepository.save(user1);
//        }
//    }
//
//    @Override
//    public ResponseEntity<Users> createUser(Users user) {
//        Users users = userRepository.save(user);
//        user.setRating(new Rating());
//        return ResponseEntity.ok(users);
//    }
//
//    @Override
//    public ResponseEntity<List<Users>> getUsersRating(String type) {
//        return null;
//    }
//
//
//    @Override
//    public void updateUsersBeginningMonthAndWeek() {
//        List<Users> users1;
//
//        //Updates 'ratingAtTheBeginningOfTheMonth' field
//        if (Calendar.getInstance().get(Calendar.DAY_OF_MONTH) == 1) {
//                users1 = userRepository.findAll(Sort.by(Sort.Direction.DESC,"ratingByMonth"));
//            for (Users user1 : users1) {
//                user1.getRating().setRatingAtBeginningOfTheMonth(user1.getRating().getAllRating());
//                userRepository.save(user1);
//            }
//        }
//        //Updates 'ratingAtTheBeginningOfTheWeek' field
//        if (Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
//            users1 = userRepository.findAll(Sort.by(Sort.Direction.DESC, "ratingByWeek"));
//            for (Users user : users1) {
//                user.getRating().setRatingAtBeginningOfTheWeek(user.getRating().getAllRating());
//                userRepository.save(user);
//            }
//        }
//
//
//    }

//    @Override
//    public ResponseEntity<List<Users>> getUsersRating(String type) {
//        List<Users> users1 = userRepository.findAll();
//        if (users1.isEmpty()){
//            return null;
//        }
//        List<Users> users = userRepository.findAll();
//
//        return switch (type) {
//            case "all" ->  ResponseEntity.ok(users);
//            case "month"-> {
//                users.forEach(user -> user.getRating().setRatingByMonth(user.getRating().getAllRating()) - user.getRating().getRatingAtBeginningOfTheMonth());
//                yield ResponseEntity.ok(users.stream().map(UserMapper::toDto).toList());
//            }
//            case "week" -> {
//                users.forEach(user -> user.setRatingByWeek(user.getAllRating() - user.getRatingAtBeginningOfTheWeek()));
//                yield ResponseEntity.ok(users.stream().map(UserMapper::toDto).toList());
//            }
//
//            default -> null;
//        };
//    }
}
