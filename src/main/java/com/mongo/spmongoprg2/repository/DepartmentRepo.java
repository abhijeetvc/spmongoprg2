package com.mongo.spmongoprg2.repository;

import com.mongo.spmongoprg2.model.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepo extends MongoRepository<Department,String> {
}
