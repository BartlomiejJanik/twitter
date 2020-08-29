package pl.sda.twitter.persistance.dao;


import org.hibernate.Session;
import org.hibernate.query.Query;
import pl.sda.twitter.persistance.HibernateUtil;
import pl.sda.twitter.persistance.entiities.TbUser;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

//DAO=data access object
public class UserDao {
    public TbUser getUserByLogin(String login) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query query = session.createQuery("select e from " + TbUser.class.getName() + " e where e.login =:username");
            query.setParameter("username", login);
            session.beginTransaction();
            TbUser singleResult = (TbUser) query.getSingleResult();
            session.getTransaction().commit();
            return singleResult;
        } catch (NoResultException e) {
            return null;
        } catch (NonUniqueResultException e) {
            return null;
        }
    }
}
