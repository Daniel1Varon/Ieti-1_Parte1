package ieti1.service;

import ieti1.data.User;

import java.util.List;

public interface UserService {
    User create(User user);

    User findById(String id);

    List<User> all();

    Boolean deleteById(String id);

    User update(User user, String userId);
}
