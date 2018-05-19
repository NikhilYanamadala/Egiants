package Egiants;

import java.util.Objects;

public class Item {
private int itemId;
private String name;
private int price;
static Item it;
public Item(int i, String string, int d) {
	// TODO Auto-generated constructor stub
	this.itemId=i;
	this.name=string;
	this.price=d;
}
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public int hashCode() {
	return itemId+name.hashCode()+price;
}
@Override
public boolean equals(Object obj) {
	Item i= (Item)obj;
	if(this.itemId==i.itemId && this.name.equals(i.name) && this.price==i.price) 
		return true;
	
return false;
}
public static void main(String[] args) {
	Item it1 = new Item(101,"Apple",10);
	Item it2 = new Item(101,"Apple",10);
	System.out.println(it1.hashCode());
	System.out.println(it2.hashCode());
}


}
