package UserService;

public class UserService {

    UserDAO userDAO = new UserDAO();

    public void join(User songa) {
        userDAO.save(songa);
    }
}
