package az.com.orient.dao;

import az.com.orient.entity.EntityPerson;
import az.com.orient.model.PersonModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class OrientDaoImp implements OrientDao {
    @Override
    public void save() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("root");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        EntityPerson entityPerson = new EntityPerson("ilham","ibrahimlee","23994@inbox.ru","user");

        entityManager.persist(entityPerson);
        entityManager.getTransaction().commit();
    }
}
