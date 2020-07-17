package com.mongo.spmongoprg2.repository;

import com.mongo.spmongoprg2.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,String> {


}
