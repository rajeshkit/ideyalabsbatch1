package org.ideyalabs.pms.repository;

import org.ideyalabs.pms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    public User getUserByUsername(String username);
}
