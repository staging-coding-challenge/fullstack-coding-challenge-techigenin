package com.codingchallenge.dao;

import java.util.List;

import com.codingchallenge.pojo.GroceryListItem;

public interface GroceryListDao {
	
	List<GroceryListItem> getGroceryList(int listId);
	List<List<GroceryListItem>> getAllGroceryLists();
}
