package com.codingchallenge.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.codingchallenge.pojo.GroceryItem;
import com.codingchallenge.util.SessionFactoryUtil;

public class GroceryItemDaoImpl implements GroceryItemDao {

	SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	@Override
	public GroceryItem readGroceryList(String id) {
		Session sess = sf.openSession();
		GroceryItem gi = (GroceryItem)sess.get(GroceryItem.class,  id);
	
		sess.close();
		return gi;
	}
	
	@Override
	public void createGroceryList(GroceryItem gl) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.save(gl);
		tx.commit();
		sess.close();
	}

	@Override
	public void updateGroceryList(GroceryItem gl) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.update(gl);
		tx.commit();
		sess.close();
	}

	@Override
	public void deleteGroceryList(GroceryItem gl) {
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		sess.delete(gl);
		tx.commit();
		sess.close();
	}

	@Override
	public List<GroceryItem> getAllGroceryLists() {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(GroceryItem.class);
				
		ArrayList<GroceryItem> gl = new ArrayList<>();
		
		for (Object o : crit.list()) {
			if (o instanceof GroceryItem)
				gl.add((GroceryItem)o);
		}
		
		// Dumb hacky solution
		for (GroceryItem g : gl) System.out.println(g);
		
		sess.close();
		
		return gl;
	}
}
