package com.codingchallenge.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.codingchallenge.pojo.GroceryListItem;
import com.codingchallenge.util.SessionFactoryUtil;

public class GroceryListDaoImpl implements GroceryListDao {

	SessionFactory sf = SessionFactoryUtil.getSessionFactory();
	
	@Override
	public List<GroceryListItem> getGroceryList(int listNum) {
		Session sess = sf.openSession();
		Criteria crit = sess.createCriteria(GroceryListItem.class);
		crit.add(Restrictions.eq("listNum", listNum));
		
		List<GroceryListItem> gli = new ArrayList<>();
		
		for (Object o : crit.list())
			if (o instanceof GroceryListItem) 
				gli.add((GroceryListItem)o);
		
		for (GroceryListItem g : gli) System.out.println(g);
		
		sess.close();
		return gli;
	}

	@Override
	public List<List<GroceryListItem>> getAllGroceryLists() {
		Session sess = sf.openSession();
		Query query = sess.createQuery("select listNum from GroceryListItem");
		
		// First get all available list numbers
		Set<Integer> listNums = new HashSet();
		listNums.addAll(query.list());
		
		for (Integer i : listNums) {
			
		}
		
		
		return null;
		// Then itereate over the list numbers, build new lists, add, and return
	}

}
