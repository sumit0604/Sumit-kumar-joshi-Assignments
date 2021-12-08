package com.capgemini.cartservice.cartController;

import java.util.List;

import com.capgemini.cartservice.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capgemini.cartservice.entity.Cart;

@RestController
public class CartController {

	@Autowired
	RestTemplate restTemplate;
	
	private CartService cartService;

	//autowiring constructor
	@Autowired
	public CartController(CartService cartService) {
		this.cartService = cartService;
	}

	//fetching data from mongodb

	@GetMapping("/cart")
	public ResponseEntity<List<Cart>> getAllCarts(){
		List<Cart> carts = this.cartService.getAllCarts();
		return new ResponseEntity<List<Cart>>(carts, HttpStatus.OK);
		
	}

	//adding ddata to mongodb

	@PostMapping("/addtocart")
	public ResponseEntity<?> addcart(@RequestBody Cart cart) {
		this.cartService.addCart(cart);
		return new ResponseEntity<Cart>(HttpStatus.CREATED);
	}

	//search data by Id

	@GetMapping("/cart/{cartId}")
	public ResponseEntity<Cart> getCart(@PathVariable("cartId") int cartId){
		Cart cart = this.cartService.getCartById(cartId);
		return new ResponseEntity<Cart>(cart, HttpStatus.OK);
	}

	//update data by Id

	@PutMapping("/update/{id}")
	public ResponseEntity<Cart> updateCart(@PathVariable("id") int cartId,@RequestBody Cart cart){
		this.cartService.updateCart(cartId,cart);
		return new ResponseEntity<Cart>(HttpStatus.CREATED);
	
	}
}
