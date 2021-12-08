package com.eshoppingzone.product.Services;

import com.eshoppingzone.product.Entities.product;

public interface ProductServices {

//    public void updateproduct(int productId, product product);
      public product getByproductId(int productId);
      public product updateProduct(product product);
//    public product deleteProduct(int productId);


}
