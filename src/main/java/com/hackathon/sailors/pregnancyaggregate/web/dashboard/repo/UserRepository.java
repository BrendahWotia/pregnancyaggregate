package com.hackathon.sailors.pregnancyaggregate.web.dashboard.repo;

import com.hackathon.sailors.pregnancyaggregate.models.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
