package pl.sda.twitter.persistance.entiities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_ARTICLE")
public class TbArticle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AR_ID", unique = true, nullable = false)
    private int id;
    @JoinColumn(name = "AR_USER_ID", nullable = false)
    @ManyToOne
    private TbUser user;
    @Column(name = "AR_CONTENT", length = 1000)
    private String content;
}
