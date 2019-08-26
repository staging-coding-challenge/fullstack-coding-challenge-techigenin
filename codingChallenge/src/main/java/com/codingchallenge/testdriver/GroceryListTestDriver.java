package com.codingchallenge.testdriver;

import com.codingchallenge.dao.GroceryListDaoImpl;
import com.codingchallenge.dao.GroceryListDao;

public class GroceryListTestDriver {

	public static void main(String[] args) {
		
		GroceryListDao gld = new GroceryListDaoImpl();
		
		gld.getAllGroceryLists();
		
	}

}
