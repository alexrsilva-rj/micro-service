package br.com.kerberus.userapi.services.impl;

import br.com.kerberus.userapi.domain.User;
import br.com.kerberus.userapi.repositories.UserRepository;
import br.com.kerberus.userapi.services.UserService;
import br.com.kerberus.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException( "Object Not found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
