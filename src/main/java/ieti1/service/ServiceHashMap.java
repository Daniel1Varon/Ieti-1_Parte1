package ieti1.service;

import ieti1.data.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ServiceHashMap implements UserService{
    private final HashMap<String,User> userMap= new HashMap<>();

    @Override
    public User create(User user) {
        return userMap.put(user.getId(),user);
    }

    @Override
    public User findById(String id) {
        return userMap.get(id);
    }

    @Override
    public List<User> all() {
        return new ArrayList<User>(userMap.values());
    }

    @Override
    public Boolean deleteById(String id) {
        userMap.remove(id);
        Boolean delete = !userMap.containsKey(id);
        return delete;
    }

    @Override
    public User update(User user, String userId) {
        return userMap.put(userId,user);
    }
}
