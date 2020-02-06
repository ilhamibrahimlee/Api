package az.com.orient.controller;


import az.com.orient.dao.OrientDao;
import az.com.orient.dao.OrientDaoImp;
import az.com.orient.model.PersonModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/data")
public class Controller {

    // success
    @Path("/hello")
    @GET
    public void hello(){
        System.out.println("hello");
    }


    //  status code 500 Internal server error (Postman)
    //  The RuntimeException could not be mapped to a response, re-throwing to the HTTP container
    //  Error calling Driver#connect
    //  Could not create connection to database server.
    @Path("/persons")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List <PersonModel> getAllPersonModels(){
        System.out.println("get person ");
        OrientDao o = new OrientDaoImp();
        return  o.getAllPersonModels();
    }

    //  status code 500 Internal server error (Postman)
    //  The RuntimeException could not be mapped to a response, re-throwing to the HTTP container
    //  Error calling Driver#connect
    //  Could not create connection to database server.
    @Path("/persons/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public PersonModel getPersonModelById(@PathParam("id") Integer id){

        OrientDao o = new OrientDaoImp();
        return o.getPersonModelById(id);
    }


    // 400 bad reguest
    @Path("/persons")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addPersonModel(PersonModel personModel){
        System.out.println("add person model");
        OrientDao o = new OrientDaoImp();
        o.add(personModel);
    }

    // Status 500
    @Path("/test")
    @GET
    public void get (){
        System.out.println("test ");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("root");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println(entityManager.createQuery("from EntityPerson ").getResultList().size());
    }
}
