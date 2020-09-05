package pl.sda.twitter.services;

import pl.sda.twitter.persistance.dao.ArticleDao;
import pl.sda.twitter.persistance.entities.TbArticle;
import pl.sda.twitter.persistance.entities.TbUser;

import java.util.Comparator;
import java.util.List;

public class ArticleService {

    private final ArticleDao articleDao = new ArticleDao();

    public List<TbArticle> getArticles(){
        return articleDao.getArticles();
    }

    public void addArticle(TbUser tbUser, String content) {
        articleDao.addNewArticle(tbUser, content);
    }
}
