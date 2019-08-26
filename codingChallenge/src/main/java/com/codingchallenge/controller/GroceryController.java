package com.codingchallenge.controller;

import org.springframework.web.bind.annotation.*;

@RestController("/grocery_lists")
@CrossOrigin(origins="*")
public class GroceryController {

	@GetMapping("/grocery_lists")
	public String groceryGetMapping() {
		System.out.println("Hit get");
		
		return "my test";
	}
	
	@PostMapping("/grocery_lists")
	public void groceryPostMapping(
			@RequestBody String listName) {
		System.out.println("Hit post");
	}
	
	@PostMapping("/grocery_lists/{id}/items/{itemId}")
	public void groceryPostItemsMapping(
			@PathVariable String id, 
			@PathVariable String itemId) {
		System.out.println("Hit post id:" + id + " itemId:" + itemId);
	}
	
	@DeleteMapping("grocery_lists")
	public void groceryDeleteMapping(
			@RequestBody String listName) {
		System.out.println("Hit delete");
	}
	
	@DeleteMapping("/grocery_lists/{id}/items/{itemId}")
	public void groceryDeleteListItemMapping(
			@PathVariable String id,
			@PathVariable String itemId) {
		System.out.println("Hit delete id:" + id + " itemId:" + itemId);
	}	
}
