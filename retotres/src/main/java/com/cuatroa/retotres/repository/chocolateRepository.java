package com.cuatroa.retotres.repository;

import com.cuatroa.retotres.model.chocolate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.retotres.repository.crud.chocolateCrudRepository;

/**
 *
 * @author desaextremo
 */
@Repository
public class chocolateRepository {
    @Autowired
    private chocolateCrudRepository accesoryCrudRepository;

    public List<chocolate> getAll() {
        return accesoryCrudRepository.findAll();
    }

    public Optional<chocolate> getAccesory(String reference) {
        return accesoryCrudRepository.findById(reference);
    }
    
    public chocolate create(chocolate accesory) {
        return accesoryCrudRepository.save(accesory);
    }

    public void update(chocolate accesory) {
        accesoryCrudRepository.save(accesory);
    }
    
    public void delete(chocolate accesory) {
        accesoryCrudRepository.delete(accesory);
    }
}
