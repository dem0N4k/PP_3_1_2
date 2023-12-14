package web.pp_3_1_2.service;

import web.pp_3_1_2.model.User;

import java.util.List;

public interface UserService {

    User getUser(Long id);

    List<User> getAllUsers();

    User saveUser(User user);

    void deleteUser(Long id);


}
