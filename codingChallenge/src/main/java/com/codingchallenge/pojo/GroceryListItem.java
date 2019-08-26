package com.codingchallenge.pojo;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Table(name="grocery_list_items")
@Component
public class GroceryListItem {

	@Id
	@Column(name="item_id")
	private String itemId;
	
	@Column(name="list_num")
	private Integer listNum;
	
	@ManyToOne
	@JoinColumn(name="item_num", referencedColumnName="num")
	private GroceryItem item;
	
	@Column(name="count")
	private Integer count;

	public GroceryListItem(String itemId, Integer listNum, GroceryItem itemNum, Integer count) {
		super();
		this.itemId = itemId;
		this.listNum = listNum;
		this.item = itemNum;
		this.count = count;
	}

	public GroceryListItem() {
		super();
	}

	@Override
	public String toString() {
		return "GroceryListItem [itemId=" + itemId + ", listNum=" + listNum + ", itemNum=" + item + ", count=" + count
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((listNum == null) ? 0 : listNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryListItem other = (GroceryListItem) obj;
		if (count == null) {
			if (other.count != null)
				return false;
		} else if (!count.equals(other.count))
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (listNum == null) {
			if (other.listNum != null)
				return false;
		} else if (!listNum.equals(other.listNum))
			return false;
		return true;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Integer getListNum() {
		return listNum;
	}

	public void setListNum(Integer listNum) {
		this.listNum = listNum;
	}

	public GroceryItem getItemNum() {
		return item;
	}

	public void setItemNum(GroceryItem item) {
		this.item = item;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}