package com.online.store.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableMethodSecurity
public class SpringSecurityConfiguration {
	@Bean
	public InMemoryUserDetailsManager createUserDetailManager() {
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
		UserDetails userDetails = User.builder().passwordEncoder(passwordEncoder).username("admin")
				.password("Admin@123").roles("ADMIN").build();
		UserDetails userDetails1 = User.builder().passwordEncoder(passwordEncoder).username("user")
				.password("User@123").roles("USER").build();

		return new InMemoryUserDetailsManager(userDetails, userDetails1);

	}

	@Bean
	public PasswordEncoder passwordEncoder() {

		return new BCryptPasswordEncoder();
	}

}
