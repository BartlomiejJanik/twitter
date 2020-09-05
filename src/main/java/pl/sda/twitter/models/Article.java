package pl.sda.twitter.models;

import com.google.gson.annotations.Expose;
import lombok.Builder;
import lombok.Data;
import pl.sda.twitter.persistance.entities.TbUser;

@Builder
@Data
public class Article {

    @Expose
    private int id;
    @Expose
    private TbUser user;
    @Expose
    private String content;
    @Expose
    private boolean isOwner;
}
