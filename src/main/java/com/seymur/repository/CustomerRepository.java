package com.seymur.repository;

import com.seymur.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Seymur on 8/5/2018.
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {

}
