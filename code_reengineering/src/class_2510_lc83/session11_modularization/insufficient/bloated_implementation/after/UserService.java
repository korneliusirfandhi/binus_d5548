package class_2510_lc83.session11_modularization.insufficient.bloated_implementation.after;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> users = new HashMap<>();

    public void registerUser(User user) {
        users.put(user.getUserId(), user);
    }

    public User findUser(String userId) {
        return users.get(userId);
    }

}
