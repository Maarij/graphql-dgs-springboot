package com.course.graphql.datasource.problemz.repository;

import com.course.graphql.datasource.problemz.entity.Userz;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserzRepository extends CrudRepository<Userz, UUID> {

}
