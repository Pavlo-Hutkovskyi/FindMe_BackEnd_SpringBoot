package com.findme.backend.security;

import com.findme.backend.entity.Advert;
import com.findme.backend.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class RepositoryConfig {
    @Bean
    public Class<Advert> advertEntityClass() {
        return Advert.class;
    }

    @Bean
    @Primary
    public Class<User> userEntityClass() {
        return User.class;
    }
}

