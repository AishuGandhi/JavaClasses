package com.user.crud.usercrudopertions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.user.crud.usercrudopertions.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
