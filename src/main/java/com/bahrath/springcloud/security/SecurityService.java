package com.bahrath.springcloud.security;

public interface SecurityService {
    boolean login(String username, String password);
}
