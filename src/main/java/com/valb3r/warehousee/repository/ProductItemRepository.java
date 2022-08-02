package com.valb3r.warehousee.repository;

import com.valb3r.warehousee.domain.Product;
import com.valb3r.warehousee.domain.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(excerptProjection = ProductItemRepository.ProductItemExcerpt.class)
public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {

    @Projection(name = "productItemExcerpt", types = ProductItemExcerpt.class)
    interface ProductItemExcerpt {
        int getQuantity();

        Product getProduct();
    }
}
