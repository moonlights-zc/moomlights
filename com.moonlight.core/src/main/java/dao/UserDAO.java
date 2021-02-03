package dao;


import domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
    @Select("select account,password from moon_tools_user where account = #{account}")
    public User selectOne(User user);


}
