package com.quinbay.march22.dependency.injection.repository;

import com.quinbay.march22.dependency.injection.entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentMongoRepository extends MongoRepository<StudentEntity,Integer> {
}
