//package com.example.app;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import com.example.app.user.User;
//import com.example.app.user.UserRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.annotation.Rollback;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
//@Rollback(false)
//public class UserRepositoryTests {
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Autowired
//    private UserRepository repo;
//
//    @Test
//
//    public void testCreateUser(){
//        User user = new User();
//        user.setEmail("example2@gmail.com");
//        user.setPassword("321654");
//        user.setFirstName("John");
//        user.setLastName("Smith");
//
//        User savedUser = repo.save(user);
//
//        User existUser = entityManager.find(User.class, savedUser.getId());
//        assertThat(existUser.getEmail()).isEqualTo(user.getEmail());
//    }
//
//    @Test
//    public void testFindUserByEmail(){
//        String email = "example@gmail.com";
//
//        User user = repo.findByEmail(email);
//
//        assertThat(user).isNotNull();
//    }
//}
