package com.revature.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.PartLookUp;

@Repository
public interface IPartLookUpRepo extends CrudRepository<PartLookUp, Integer>{

}
