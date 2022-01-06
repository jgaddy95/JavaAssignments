package com.gaddy.app.rest.Repo;

import com.gaddy.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Long> {
}
