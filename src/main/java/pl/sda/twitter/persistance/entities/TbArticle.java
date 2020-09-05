package pl.sda.twitter.persistance.entities;

import com.google.gson.annotations.Expose;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_ARTICLE")
public class TbArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AR_ID", unique = true, nullable = false)
    @Expose
    private int id;
    @JoinColumn(name = "AR_USER_ID", nullable = false)
    @ManyToOne
    @Expose
    private TbUser user;
    @Column(name = "AR_CONTENT", length = 1000)
    @Expose
    private String content;
    @Column(name = "AR_STATUS", length = 5, nullable = false)
    private String status;
}
