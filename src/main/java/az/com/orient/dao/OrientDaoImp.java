package az.com.orient.dao;

import az.com.orient.entity.EntityPerson;
import az.com.orient.model.PersonModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class OrientDaoImp implements OrientDao {
    @Override
    public void add(PersonModel personModel) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("root");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        EntityPerson entityPerson = new EntityPerson(personModel);

        entityManager.persist(entityPerson);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<PersonModel> getAllPersonModels() {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("root");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<PersonModel>personModels = new ArrayList<>();
        List <EntityPerson> entityPersonList = entityManager.createQuery("from EntityPerson ").getResultList();

        for (EntityPerson person : entityPersonList) {
            personModels.add(new PersonModel(person));
        }


        return personModels;
    }

    @Override
    public PersonModel getPersonModelById( Integer id ) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("root");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityPerson entityPerson = entityManager.find(EntityPerson.class,id);

        return new PersonModel(entityPerson);
    }


    // modify
    //remove


}
