package pl.sda.twitter.services;

import pl.sda.twitter.persistance.dao.UserDao;
import pl.sda.twitter.persistance.entities.TbUser;

public class UserService {

    private UserDao userDao = new UserDao();

    public TbUser getUser(String userName, String userPassword) {
        TbUser user = userDao.getUserByLogin(userName);
        if (user == null || !user.getPassword().equals(userPassword)){
            return null;
        }
        return user;
    }
}
