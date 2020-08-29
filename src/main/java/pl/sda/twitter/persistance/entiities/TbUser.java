package pl.sda.twitter.persistance.entiities;

import lombok.Builder;

@Builder
public class TbUser {
    private int id;
    private String login;
    private String password;
}
