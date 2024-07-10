package UserService;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {

    Map<Integer, User> db = new HashMap<>();

    public void save(User songa) {
        db.put(0,songa);
        System.out.println("00님 회원가입을 환영합니다. ");
    }

}

