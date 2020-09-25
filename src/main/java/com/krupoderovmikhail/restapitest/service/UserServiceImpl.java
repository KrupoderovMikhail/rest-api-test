package com.krupoderovmikhail.restapitest.service;

import com.krupoderovmikhail.restapitest.exception.DataNotFoundException;
import com.krupoderovmikhail.restapitest.exception.UserNotFoundException;
import com.krupoderovmikhail.restapitest.model.User;
import com.krupoderovmikhail.restapitest.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Krupoderov Mikhail
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        List<User> users = userRepository.findAll();

        if (users.isEmpty()) {
            throw new DataNotFoundException();
        }
        log.info("IN getAll - {} users found", users.size());

        return users;
    }

    @Override
    public User findById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
        log.info("IN findById - user: {} found by id :{}", user, id);

        return user;
    }

    @Override
    public User save(User user) {
        User createdUser = userRepository.save(user);
        log.info("IN createUser - user: {} successfully created", createdUser);

        return createdUser;
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
        log.info("IN delete - user with id: {} successfully deleted", id);
    }
}
