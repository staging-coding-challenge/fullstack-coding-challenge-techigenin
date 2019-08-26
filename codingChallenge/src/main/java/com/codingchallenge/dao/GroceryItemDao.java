package com.codingchallenge.dao;

import java.util.List;

import com.codingchallenge.pojo.GroceryItem;

public interface GroceryItemDao {

	public GroceryItem readGroceryList(String id);
	public void createGroceryList(GroceryItem gl);
	public void updateGroceryList(GroceryItem gl);
	public void deleteGroceryList(GroceryItem gl);
	public List<GroceryItem> getAllGroceryLists();
	
}
