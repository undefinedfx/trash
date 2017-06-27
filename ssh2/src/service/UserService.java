package service;

import dao.UserDao;
import entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public void add(User user) {
        userDao.insert(user);
    }

    @Transactional
    public void remove(User user) {
        userDao.delete(user);
    }

    @Transactional
    public void save(User user) {
        userDao.update(user);
    }

    public User findByUserid(Integer userid) {
        return userDao.selectByUserid(userid);
    }

    public List<User> findByAny(String value) {
        return userDao.selectByAny(value);
    }

}
