package com.adrianpoplesanu.matchday.MatchDay.service;

import com.adrianpoplesanu.matchday.MatchDay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void processOAuth2PostLogin(String email) {
        System.out.println(email);
    }

}
