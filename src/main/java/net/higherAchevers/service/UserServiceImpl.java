package net.higherAchevers.service;

import net.higherAchevers.UserRepository;
import net.higherAchevers.dto.UserRequest;
import net.higherAchevers.entity.User;
import net.higherAchevers.exception.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;


    @Override
    public User saveUser(UserRequest userRequest) {
        User user = User.
                build(0, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(),
                        userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
        return repository.save(user);
    }

    @Override
    public List<User> getALlUsers() {
        return repository.findAll();
    }

    @Override
    public User getUser(int id) throws UserNotFoundException {
        User user= repository.findByUserId(id);
        if(user != null){
            return user;
        }else{
            throw new UserNotFoundException("user not found with id : " + id);
        }
    }

}