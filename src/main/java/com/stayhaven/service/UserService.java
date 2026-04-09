package com.stayhaven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stayhaven.entity.User;
import com.stayhaven.repository.UserRepository;
import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }
    public User loginUser(User user) {
        return userRepository.findByEmailAndPassword(
            user.getEmail(),
            user.getPassword()
        ); }
        public List<User> getAllUsers() {
            return userRepository.findAll() ;
        }

    
        

    
}