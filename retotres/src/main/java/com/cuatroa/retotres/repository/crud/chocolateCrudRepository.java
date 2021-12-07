package com.cuatroa.retotres.repository.crud;

import com.cuatroa.retotres.model.chocolate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author desaextremo
 */
public interface chocolateCrudRepository extends MongoRepository<chocolate, String> {
    
}
