package br.com.kerberus.userapi.services;

import br.com.kerberus.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();

}
