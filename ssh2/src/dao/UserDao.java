package dao;

import entity.User;
import org.hibernate.SessionFactory;

import java.util.List;

public class UserDao {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void insert(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    public void delete(User user) {
        sessionFactory.getCurrentSession().delete(user);
    }

    public void update(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    public User selectByUserid(Integer userid) {
        return (User) sessionFactory.openSession().get(User.class, userid);
    }

    public List<User> selectByAny(String value) {
//        return sessionFactory.openSession().createQuery("from entity.User").list();
        return sessionFactory.openSession()
                .createQuery("from entity.User u where u.username like :name")
                .setString("name", "%" + value + "%")
                .list();
    }

}
