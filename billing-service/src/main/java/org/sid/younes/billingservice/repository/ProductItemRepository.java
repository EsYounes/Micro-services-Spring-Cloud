package org.sid.younes.billingservice.repository;

import org.sid.younes.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductItemRepository extends JpaRepository<ProductItem,Long>
{
}
