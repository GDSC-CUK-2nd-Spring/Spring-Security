package com.example.myservice.domain.user.service;

import com.example.myservice.domain.user.repository.UserRepository;
import com.example.myservice.global.jwt.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

}
