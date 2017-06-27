package action;

import com.opensymphony.xwork2.ActionSupport;
import entity.User;
import service.UserService;

import java.util.List;

public class UserAction extends ActionSupport {

    private String value;
    private User user;
    private List<User> users;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    private UserService userService;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String insert() {
        userService.add(user);
        return "success";
    }

    public String delete() {
        userService.remove(user);
        return "success";
    }

    public String update() {
        userService.save(user);
        return "success";
    }

    public String findByUserid() {
        user = userService.findByUserid(user.getUserid());
        return "detail";
    }

    public String findByAny() {
        users = userService.findByAny(value);
        return "success";
    }


}
