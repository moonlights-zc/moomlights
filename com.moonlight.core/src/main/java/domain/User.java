package domain;

import java.util.Objects;

public class User {

//创建表时的SQL语句
//    create table moon_tools_user(
    //    name varchar(20),
    //    account int(20),
    //    password varchar(20),
    //    child_account int(20),
    //    account_type varchar(10),
    //    parent_account int(20),
    //    retain_module1 varchar(20),
    //    retain_module2 varchar(20),
    //    retain_module3 varchar(20)
//    )


    String name;
    Integer account;



    String password;
    Integer child_account;
    String account_type;
    Integer parent_account;
    String retain_module1;
    String retain_module2;
    String retain_module3;


    public User() { }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", account=" + account +
                ", password='" + password + '\'' +
                '}';
    }

    //注册构造方法
    public User(String name, Integer account, String password, Integer child_account, String account_type, Integer parent_account) {
        this.name = name;
        this.account = account;
        this.password = password;
        this.child_account = child_account;
        this.account_type = account_type;
        this.parent_account = parent_account;
    }
    //登陆构造方法
    public User(Integer account, String password) {
        this.account = account;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAccount() {
        return account;
    }
    public void setAccount(Integer account) {
        this.account = account;
    }
    public Integer getChild_account() {
        return child_account;
    }
    public void setChild_account(Integer child_account) {
        this.child_account = child_account;
    }
    public String getAccount_type() {
        return account_type;
    }
    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }
    public Integer getParent_account() {
        return parent_account;
    }
    public void setParent_account(Integer parent_account) {
        this.parent_account = parent_account;
    }
    public String getRetain_module1() {
        return retain_module1;
    }
    public void setRetain_module1(String retain_module1) {
        this.retain_module1 = retain_module1;
    }
    public String getRetain_module2() {
        return retain_module2;
    }
    public void setRetain_module2(String retain_module2) {
        this.retain_module2 = retain_module2;
    }
    public String getRetain_module3() {
        return retain_module3;
    }
    public void setRetain_module3(String retain_module3) {
        this.retain_module3 = retain_module3;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
