package web.dao;

import web.model.User;

import javax.persistence.Id;
import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    User getUserById(long id);
    void add(User user);
    void deleteUser(long id);
    void updateUser(User user);
}
