package com.codingchallenge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.codingchallenge.pojo.GroceryItem;
import com.codingchallenge.pojo.GroceryListItem;
import com.codingchallenge.util.SessionFactoryUtil;

public class GroceryListItemDaoImpl implements GroceryListItemDao {

	SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	@Override
	public GroceryListItem readGroceryList(int i) {
		Session sess = sf.openSession();
		GroceryListItem gl = (GroceryListItem)sess.get(GroceryItem.class, i);
		
		sess.close();
		return gl;
	}

	@Override
	public void createGroceryListItem(GroceryListItem gl) {
		
	}

	@Override
	public void updateGroceryListItem(GroceryListItem gl) {
		
	}

	@Override
	public void deleteGroceryListItem(GroceryListItem gl) {
		
	}

	@Override
	public List<GroceryListItem> readAllGroceryListItems() {
		return null;
	}

}
