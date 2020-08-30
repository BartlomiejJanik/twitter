package pl.sda.twitter.persistance.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import pl.sda.twitter.persistance.HibernateUtil;
import pl.sda.twitter.persistance.entiities.TbArticle;

import java.util.List;

public class ArticleDao {
    public List getArticles(){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            final Query q = session.createQuery("select o from " + TbArticle.class.getName() + " o");
            session.getTransaction().commit();
            return q.getResultList();
        }
    }
}
