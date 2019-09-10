package com.shakeel;

import com.shakeel.model.Product;
import org.springframework.data.repository.CrudRepository;

public class repository {
    /**
     * Created by Rafael L Silva 03/09/2019.
     */
    public interface ProductRepository extends CrudRepository<Product, Long> {

    }



}
