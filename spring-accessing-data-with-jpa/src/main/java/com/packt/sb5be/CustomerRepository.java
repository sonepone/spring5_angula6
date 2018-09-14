package com.packt.sb5be;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Topic, Long> {
    List<Topic> findByDescriptionLikeIgnoreCase(String searchString);

}