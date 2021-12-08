package com.eshoppingzone.product.controller;


import com.eshoppingzone.product.Entities.product;
import com.eshoppingzone.product.Exceptions.InvalidInputException;
import com.eshoppingzone.product.Exceptions.ProductNotFoundException;
import com.eshoppingzone.product.Repository.ProductRepository;
import com.eshoppingzone.product.Services.ProductRepositoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@Slf4j
@RestController
@CrossOrigin(allowedHeaders = "*",origins = "*")
@RequestMapping("/products")
public class productcontroller {


    @Autowired
    private ProductRepositoryService productRepositoryService;

    @Autowired
    private ProductRepository productRepository;

    //Fetching whole data from Middileware

    @GetMapping("/fetchproducts")
    public List<product> fetcheddata() throws ProductNotFoundException {
        try{
            if (productRepository.findAll().equals(0))
            {
                log.info("Error is throwing. ProductNotFoundException");
                throw new ProductNotFoundException("Opes! Product Not Found !!");
            }

        }
        catch (ProductNotFoundException e)
        {
            e.printStackTrace();
        }
        return productRepositoryService.getAllProducts();

    }

    //adding products one by one

    @PostMapping("/addproducts")
    public void addproducts(@RequestBody product product)
    {
        log.info("Adding product to the Database");
        productRepositoryService.addproducts(product);
    }

    //update products using productId

    @PutMapping("/update")
    public void updateProduct(@RequestBody product product)
    {
        log.info("Update is running.");
        this.productRepositoryService.updateProduct(product);
    }

    //get products by Id

    @GetMapping("/{id}")
    public ResponseEntity<product> getprofileId(@PathVariable("id") int id) {
        ResponseEntity<product> response = null;
        product productobj = null;
        try {
            if (id == 0 ) {
                log.info("Id is 0 ..please enter valid ID");
                throw new InvalidInputException("Product Id is not valid");
            }
            productobj = productRepositoryService.getByproductId(id);
            response = new ResponseEntity<product>(productobj, HttpStatus.OK);
        } catch (InvalidInputException e) {
            e.printStackTrace();
            response = new ResponseEntity<product>(productobj, HttpStatus.BAD_REQUEST);
        }
        return response;
    }

    //Delete the product.........

    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> deleteproduct(@PathVariable("id") int id) {

            return productRepository.findById(id)
                    .map(product -> {
                        productRepository.deleteById(id);
                        return ResponseEntity.ok().build();
                    }).orElse(ResponseEntity.notFound().build());


    }

    /*        @GetMapping("/fetchproducts")
    @CrossOrigin("http://localhost:4200")
    public List<product> getAllProducts(){
        return productRepository.findAll();
    }
    @PostMapping("/addproducts")
    public void addproducts(@RequestBody product product)
    {
            productRepository.save(product);
    }
*/





}