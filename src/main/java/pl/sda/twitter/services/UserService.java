package pl.sda.twitter.services;

import pl.sda.twitter.persistance.entiities.TbUser;

public class UserService {

    public TbUser getUser(String userName, String userPassword) {
        if (userName.equals("admin") && userPassword.equals("password")) {
            return TbUser.builder().login(userName).password(userPassword).build();
        }
        return null;
    }
}
