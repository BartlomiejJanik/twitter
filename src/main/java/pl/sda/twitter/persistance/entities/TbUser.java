package pl.sda.twitter.persistance.entities;

import com.google.gson.annotations.Expose;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_USER")
public class TbUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "US_ID", unique = true, nullable = false)
    @Expose
    private int id;
    @Column(name = "US_USER_NAME", unique = true, nullable = false, length = 25)
    @Expose
    private String login;
    @Column(name = "US_PASSWORD", nullable = false, length = 25)
    private String password;
}
