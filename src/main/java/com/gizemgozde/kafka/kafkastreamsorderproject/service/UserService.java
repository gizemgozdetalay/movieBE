package com.gizemgozde.kafka.kafkastreamsorderproject.service;

import com.gizemgozde.kafka.kafkastreamsorderproject.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author gizem
 */
@Service
@Slf4j
public class UserService {
  public User createUser(User user) {
    return user;
  }
}
