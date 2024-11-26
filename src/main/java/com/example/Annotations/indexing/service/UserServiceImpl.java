package com.example.Annotations.indexing.service;

import com.example.Annotations.indexing.entity.Users;
import com.example.Annotations.indexing.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl { //index will create one more column and will sort particular field for easier search

    @Autowired
    private UserRepository userRepository;

//    @PostConstruct
//    @Transactional
    public void populateDatabase(){  //Calling save() in a loop for each record can be slow because each call results in a separate transaction, adding significant overhead.

        List<Users> listUsers= new ArrayList<>();
        for(int i=1;i<=20000;i++){
            Users users=new Users();
            users.setUsername("User"+i);
            listUsers.add(users);

            if(i%1000==0) {
                userRepository.saveAll(listUsers);
                listUsers.clear();
            }
        }
    }

    public void testByUserName(String username){   //search largest number so it will take so much time i.e.User98000

        long startTime = System.currentTimeMillis();

        Users user = userRepository.findByUsername(username);
        System.out.println("entity:-"+ user);

        long endTime = System.currentTimeMillis();

        long totalTimeTaken= endTime-startTime;
        System.out.println("total time to search :- "+ totalTimeTaken);
    }

//    without indexing results:-->  avg time :-"11ms"  //-->but by using index annotation ; avg time:- only "3ms"
//entity:-Users(id=19877, username=User19877)
//total time to search :- 12
//Hibernate: select u1_0.id,u1_0.username from users u1_0 where u1_0.username=?
//entity:-Users(id=17999, username=User17999)
//total time to search :- 10
//Hibernate: select u1_0.id,u1_0.username from users u1_0 where u1_0.username=?
//entity:-Users(id=15444, username=User15444)
//total time to search :- 11
//Hibernate: select u1_0.id,u1_0.username from users u1_0 where u1_0.username=?
//entity:-Users(id=19999, username=User19999)
//total time to search :- 11

}
