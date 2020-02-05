package az.com.orient.dao;

import az.com.orient.model.PersonModel;

import java.util.List;

public interface OrientDao {

    void add  (PersonModel personModel);
    List <PersonModel> getAllPersonModels();
    PersonModel getPersonModelById(Integer id);

}
