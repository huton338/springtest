package service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.UserEntity;

@Service
public class SampleService {

    @Autowired
    private UserEntity userEntity;


    public UserEntity userAdd(String name, int number,Date birthday){
        userEntity.setName(name);
        userEntity.setNumber(number);
        userEntity.setBirthday(birthday);
        return userEntity;
    }


    public void userReference(){

    }



}
