package com.jhsystems.colosseum.repository;

import com.jhsystems.colosseum.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by LeeJangHyeop on 2017. 7. 19..
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
