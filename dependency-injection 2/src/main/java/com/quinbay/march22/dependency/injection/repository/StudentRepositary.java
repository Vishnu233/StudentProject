package com.quinbay.march22.dependency.injection.repository;

import com.quinbay.march22.dependency.injection.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepositary extends CrudRepository<StudentEntity,Integer> {

}
