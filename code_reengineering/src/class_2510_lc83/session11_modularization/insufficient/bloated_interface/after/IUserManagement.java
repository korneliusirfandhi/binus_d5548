package class_2510_lc83.session11_modularization.insufficient.bloated_interface.after;

import class_2510_lc83.session11_modularization.insufficient.bloated_interface.before.User;

import java.util.List;

public interface IUserManagement {
    void registerUser(User user);
    void removeUser(String userId);
    User findUser(User user);
    List<User> getActiveUsers();
}
