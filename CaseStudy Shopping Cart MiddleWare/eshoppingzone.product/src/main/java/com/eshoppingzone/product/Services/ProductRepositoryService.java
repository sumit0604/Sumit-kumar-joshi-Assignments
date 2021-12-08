package com.eshoppingzone.product.Services;


import com.eshoppingzone.product.Entities.product;
import com.eshoppingzone.product.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductRepositoryService {

    @Autowired
    private ProductRepository productRepository;



    //get all products
    public List<product> getAllProducts(){
        return productRepository.findAll();
    }



    //adding product
    public void addproducts(@RequestBody product product)
    {
        productRepository.save(product);
    }


    //Update product..........
    public void updateproduct(int productId,product product){

        product product1= productRepository.findByproductId(productId);
        product1.setProductId(product.getProductId());
        product1.setProductName(product.getProductName());
        product1.setProductType(product.getProductType());
        product1.setCategory(product.getCategory());
        product1.setDescription(product.getDescription());
        product1.setPrice(product.getPrice());
        product1.setImage(product.getImage());
        product1.setRating(product.getRating());
        product1.setReview(product.getReview());
        product1.setSpecification(product.getSpecification());
        productRepository.save(product1);
    }

    //get product BY ID
    public product getByproductId(int productId)
    {
        return productRepository.findByproductId(productId);
    }

    //update product
    public  product updateProduct(product product)
    {
        Integer id = product.getProductId();
        product prd = productRepository.findByproductId(id);
        prd.setProductId(product.getProductId());
        prd.setProductType(product.getProductType());
        prd.setProductName(product.getProductName());
        prd.setCategory(product.getCategory());
        prd.setRating(product.getRating());
        prd.setReview(product.getReview());
        prd.setImage(prd.getImage());
        prd.setPrice(product.getPrice());
        prd.setDescription(product.getDescription());
        prd.setDescription(product.getDescription());
        return  productRepository.save(prd);
    }

    /*
    public product getByProductId(int productId)
    {
        return null;
    }

    //Update products..........
    public void updateproduct(int productId,product product){

        product product1= productRepository.findByProductId(productId);
        product1.setProductId(product.getProductId());
        product1.setProductName(product.getProductName());
        product1.setProductType(product.getProductType());
        product1.setCategory(product.getCategory());
        product1.setDescription(product.getDescription());
        product1.setPrice(product.getPrice());
        product1.setImage(product.getImage());
        product1.setRating(product.getRating());
        product1.setReview(product.getReview());
        product1.setSpecification(product.getSpecification());
        productRepository.save(product1);
    }


    public product getBycategory(String category)
    {
        return null;
    }
//    public product getByProductByType(String productType)
//    {
//        return productRepository.getProductType(productType);
//    }
    public product findByProductName(String productName)
    {
        return  null;
    }
    public product deleteProduct(int productId)
    {
        return null;
    }

     */


//    public product deleteProduct(int productId)
//    {
//        return productRepository.deleteByprofileId(productId);
//
//    }
}
