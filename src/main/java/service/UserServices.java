/**
 * @author : Arjun Gautam
 * e-mail : arjungautam5431@gmail.com
 * Date :2021-02-17
 * Time :14:43
 */
package service;

import model.User;

import java.util.List;

public interface UserServices {
    List<User> getAllUsers();

    User getUserById(int id);

    String addUser(User user);

    User updateUser(int id, User user);

    String deleteUser(int id);
}
