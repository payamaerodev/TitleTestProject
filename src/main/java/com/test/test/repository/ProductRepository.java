package com.test.test.repository;

import com.test.test.model.Basic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Basic,Long> {
//    @Query(value = "CALL GetAllProducts();", nativeQuery = true)
//    List<Basic> getProductsByStoredProcedure();
}
