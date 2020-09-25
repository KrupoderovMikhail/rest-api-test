package com.krupoderovmikhail.restapitest.repository;

import com.krupoderovmikhail.restapitest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Krupoderov Mikhail
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
