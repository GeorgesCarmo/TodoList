package br.com.georgescarmo.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserRepository extends JpaRepository<UserModel, UUID>{

    UserModel findByUsername(String username);

}
