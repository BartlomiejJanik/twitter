package pl.sda.twitter.persistance.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import pl.sda.twitter.constans.ArticleStatus;
import pl.sda.twitter.persistance.HibernateUtil;
import pl.sda.twitter.persistance.entities.TbArticle;
import pl.sda.twitter.persistance.entities.TbUser;

import java.util.List;

public class ArticleDao {
    public List getArticles() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            final Query q = session.createQuery("select o from " + TbArticle.class.getName() + " o");
            session.getTransaction().commit();
            return q.getResultList();
        }
    }

    public void addNewArticle(TbUser tbUser, String content) {
        try (final Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();

            final TbArticle tbArticle = new TbArticle();
            tbArticle.setContent(content);
            tbArticle.setUser(tbUser);
            session.save(tbArticle);
            session.getTransaction().commit();
        }
    }

    public List<TbArticle> getArticles(ArticleStatus status) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            final Query q = session.createQuery("select o from " + TbArticle.class.getName() + " o where o.status=:articleStatus");
            q.setParameter("articleStatus", status.name());
            session.getTransaction().commit();
            return q.getResultList();
        }
    }

    public TbArticle getArticleById(Integer articleId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            final Query q = session.createQuery("select o from " + TbArticle.class.getName() + " o where o.id =:id");
            q.setParameter("id", articleId);
            session.getTransaction().commit();
            return (TbArticle) q.getSingleResult();
        }
    }
}
