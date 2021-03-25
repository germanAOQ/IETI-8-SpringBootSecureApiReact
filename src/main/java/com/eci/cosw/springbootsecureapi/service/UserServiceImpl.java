package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
@Service
public class UserServiceImpl
    implements UserService
{

    private List<User> users = new ArrayList<>();


    @Autowired
    public UserServiceImpl()
    {
    }

    @PostConstruct
    private void populateSampleData()
    {
        //users.add( new User( "test@mail.com", "password", "Andres", "Perez" ) );
        User userIETI = new User();
        userIETI.setEmail("userIETI@mail.com");
        userIETI.setUsername("userIETI");
        userIETI.setFirstname("user");
        userIETI.setLastname("IETI");
        userIETI.setPassword("passwordIETI");
        users.add(userIETI);
    }


    @Override
    public List<User> getUsers()
    {
        return users;
    }

    @Override
    public User getUser( Long id )
    {
        User res = null;
        for(User user: users){
            if(user.getId()==id){
                res = user;
            }
        }
        return res;
    }

    @Override
    public User createUser( User user )
    {
        users.add(user);
        return user;
    }

    @Override
    public User findUserByEmail( String email )
    {
        User res = null;
        for(User user: users){
            if(user.getEmail().equals(email)){
                res = user;
            }
        }
        return res;
    }

    @Override
    public User findUserByEmailAndPassword( String email, String password )
    {
        User res = null;
        for(User user: users){
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                res = user;
            }
        }
        return res;
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
        User res = null;
        System.out.println("entreeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        System.out.println(users);
        for(User user: users){
            if(user.getUsername().equals(username) && user.getPassword().equals(password)){
                System.out.println("Siiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
                res = user;
            }
        }
        return res;
    }

}
