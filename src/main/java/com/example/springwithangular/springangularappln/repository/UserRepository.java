package com.example.springwithangular.springangularappln.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.springwithangular.springangularappln.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
