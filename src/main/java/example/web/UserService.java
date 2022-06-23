package example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    public User getUser(Long id){
        Optional<User> u=repository.findById(id);
        return u.get();
    }

    public User getUserByEmail(String email){
        Optional<User> u=repository.findByEmail(email);
        return u.get();
    }
}
