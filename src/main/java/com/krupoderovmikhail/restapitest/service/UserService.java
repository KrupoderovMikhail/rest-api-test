package com.krupoderovmikhail.restapitest.service;

import com.krupoderovmikhail.restapitest.model.User;

import java.util.List;

/**
 * @author Krupoderov Mikhail
 */
public interface UserService {

    public List<User> findAll();

    public User findById(Long id);

    public User save(User user);

    public void delete(Long id);
}
