package com.example.crudapp.service;

import com.example.crudapp.entity.User;
import com.example.crudapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> listAll() {
        return repo.findAll();
    }

    public void save(User user) {
        repo.save(user);
    }

    public User get(Long id) {
        Optional<User> result = repo.findById(id);
        return result.orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
