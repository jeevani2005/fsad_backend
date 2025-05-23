package klu.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import klu.model.Users;

@Service
public interface UsersRepository extends JpaRepository<Users, String>{
   @Query ("select count(U) from Users U where U.email=:email")
   public int validationEmail(@Param("email") String email);
   @Query("select count(U) from Users U where U.email=:email and U.password=:password")
   public int validateCredentials(@Param("email") String email, @Param("password") String password);
}
//