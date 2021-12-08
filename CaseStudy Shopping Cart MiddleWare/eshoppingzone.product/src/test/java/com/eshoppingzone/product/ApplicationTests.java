package com.eshoppingzone.product;

	import com.eshoppingzone.product.Entities.product;
	import com.eshoppingzone.product.Repository.ProductRepository;
	import com.eshoppingzone.product.Services.ProductRepositoryService;
	import com.eshoppingzone.product.controller.productcontroller;
	import org.apache.commons.math.stat.descriptive.summary.Product;
	import org.junit.jupiter.api.Test;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.boot.test.mock.mockito.MockBean;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;

	import static org.junit.Assert.assertEquals;
	import static org.mockito.Mockito.*;

	//@RunWith(SprimgRunner.class)
	@SpringBootTest
	class ApplicationTests {

		@Autowired
		private ProductRepositoryService service;

		@MockBean
		private ProductRepository repository;

		@MockBean
		private com.eshoppingzone.product.controller.productcontroller productcontroller;

		@Test
		void contextLoads() {
		}

		@Test
		public void getAllProductsTest() {
			when(repository.findAll()).thenReturn(Stream.of(new product(101, "Electronic", "phone",
					"electronic", 3, "best", "hn.png",
					109.9, "best to buy", "777GB ram")).collect(Collectors.toList()));
			assertEquals(1, service.getAllProducts().size());
		}

		@Test
		public void addproductTest() {
			product product1= new product(201, "clothes", "Shirt",
					"woolen", 2, "worst", "qwe.png",
					209.9, "best to buy", "pure woolen material");
			when(repository.save(product1)).thenReturn(product1);
			assertEquals(product1,repository.save(product1));
		}
//	@Test
//	public void  deleteproductTest()
//	{
//		product product1= new product(201, "clothes", "Shirt",
//				"woolen", 2, "worst", "qwe.png",
//				209.9, "best to buy", "pure woolen material");
//		productcontroller.deleteproduct(product1.getProductId());
//		verify(productcontroller,times(1));
//
//	}

}