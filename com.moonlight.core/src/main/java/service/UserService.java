package service;

import Util.Utils;
import dao.UserDAO;
import domain.User;
import org.springframework.stereotype.Service;


@Service("userService")
public class UserService {
    private UserDAO dao = Utils.getMapper(UserDAO.class);


    public Boolean login (User user){
        User realUser = dao.selectOne(user);
        System.out.println(realUser+"==="+user);
        return user.equals(realUser);
    }


}
