package com.eshoppingzone.product.Repository;


import com.eshoppingzone.product.Entities.product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<product, Integer> {

//    public product getcategory(String category);
    public product findByproductId(int productId);
//    public product deleteByprofileId(int productId);
//    public product getProductType(String productType);
//    public product findProductName(String productName);
}