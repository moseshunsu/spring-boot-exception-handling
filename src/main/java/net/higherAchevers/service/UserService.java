package net.higherAchevers.service;

import net.higherAchevers.dto.UserRequest;
import net.higherAchevers.entity.User;
import net.higherAchevers.exception.UserNotFoundException;

import java.util.List;

public interface UserService {
    User saveUser(UserRequest userRequest);

    List<User> getALlUsers();

    User getUser(int id) throws UserNotFoundException;
}
