package az.com.orient.controller;


import az.com.orient.dao.OrientDao;
import az.com.orient.dao.OrientDaoImp;
import az.com.orient.model.Car;
import az.com.orient.model.PersonModel;

;
import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/data")
public class Controller {

    @Path("/hello")
    @GET
    public void helloWorld(){
        System.out.println("hello world");
    }

    @Path("/cars")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Car> getAllCars(){

        return Arrays.asList(new Car(1,"kia","rio",2000),
                             new Car(2,"lada","2107",2000));
    }

    @Path("/car")
    @GET
    public Car getCarById(@QueryParam("id") Integer id){
        return new Car (id,"lada","2106",1995);
    }

    @Path("/car")
    @PUT
    public Car updateCar (Car car){
        return  new Car (car.getId(),car.getMarka(), car.getModel(),car.getYear());
    }

    @Path("/car/{id}")
    @DELETE
    public  void  removeCar(@PathParam("id") Integer id){
        System.out.println("silindi");
    }

    @Path("/index")
    @GET
    public List<PersonModel> getAllPersons (){

        return  null;
    }


    @Path("/test")
    @GET
    public  void test() {
        System.out.println("bashladi");

        OrientDao o = new OrientDaoImp();
        o.save();
        System.out.println("basha catdi");

    }
}
