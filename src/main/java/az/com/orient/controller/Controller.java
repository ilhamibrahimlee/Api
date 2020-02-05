package az.com.orient.controller;


import az.com.orient.dao.OrientDao;
import az.com.orient.dao.OrientDaoImp;
import az.com.orient.model.PersonModel;
import javax.ws.rs.*;
import java.util.List;

@Path("/data")
public class Controller {

    @Path("/persons")
    @GET
    public List <PersonModel> getAllPersonModels(){
        OrientDao o = new OrientDaoImp();
        return  o.getAllPersonModels();
    }

    @Path("/persons/{id}")
    @GET
    public PersonModel getPersonModelById(@PathParam("id") Integer id){
        OrientDao o = new OrientDaoImp();

        return o.getPersonModelById(id);
    }

    @Path("/persons")
    @POST
    public void addPersonModel(PersonModel personModel){
        OrientDao o = new OrientDaoImp();
        o.add(personModel);
    }
}
