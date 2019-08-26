package com.codingchallenge.dao;

import java.util.List;

import com.codingchallenge.pojo.GroceryListItem;

public interface GroceryListItemDao {
	
	public GroceryListItem readGroceryList(int i);
	public void createGroceryListItem(GroceryListItem gl);
	public void updateGroceryListItem(GroceryListItem gl);
	public void deleteGroceryListItem(GroceryListItem gl);
	public List<GroceryListItem> readAllGroceryListItems();
	
}
