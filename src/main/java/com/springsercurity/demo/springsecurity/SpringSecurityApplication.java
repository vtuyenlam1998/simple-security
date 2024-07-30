package com.springsercurity.demo.springsecurity;

import com.springsercurity.demo.springsecurity.entity.User;
import com.springsercurity.demo.springsecurity.repository.UserRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringSecurityApplication implements CommandLineRunner {

    public static Logger logger = LoggerFactory.getLogger(SpringSecurityApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) {
//        try {
//            User user = new User();
//            user.setUsername("Annie");
//            try {
//                user.setPassword(passwordEncoder.encode("Annie@1234"));
//            }
//            catch (Exception e){
//                logger.error("Lỗi mã hoá mật khẩu: ", e);
//            }
//            userRepository.save(user);
//            logger.info("User saved: {}", user);
//        }
//        catch (Exception e){
//            logger.error("Lỗi trong quá trình tạo user: ", e);
//        }
    }
}
