package com.marshal.arts.backend.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marshal.arts.backend.bean.ActiveUser;


@Repository
public interface ActiveUserRepo extends MongoRepository<ActiveUser, String> {

}
