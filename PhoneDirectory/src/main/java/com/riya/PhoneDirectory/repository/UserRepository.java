package com.riya.PhoneDirectory.repository;

import com.riya.PhoneDirectory.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer>
{
}
