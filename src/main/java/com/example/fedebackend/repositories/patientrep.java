package com.example.fedebackend.repositories;

import com.example.fedebackend.model.patient;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface patientrep extends CrudRepository<patient, Long> {

}
