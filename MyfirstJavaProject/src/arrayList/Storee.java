package arrayList;
import java.util.ArrayList;
import constructorsClassTascs.Item;
public class Storee {
	
	String name;
	String address;
	ArrayList<Item> storeItems = new ArrayList<>();
	int numOfItems;
	double totalSales;
	
	//Store myStore = new Store("Walmart" , "300. N. Wabash");
	//myStore.refund(Item myItem);
	//myStore.sell("Bike");
	
	
	public Storee(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void refund(Item item) {
		System.out.println("Refund transaction");
		addItem(item);
		totalSales -= item.price;
	}
	
	public void sell(String itemName) {
//		for(Item item: storeItems) {
//			if(item.name.equals(itemName)) {
//				System.out.println(itemName + " is sold for " + item.price);
//				numOfItems--;
//				totalSales += item.price;
//				storeItems.remove(item);
//				break; 
//			}
//		}
		for(int i = 0; i < storeItems.size(); i++) {
			if(storeItems.get(i).name.equals(itemName)) {
				System.out.println(itemName + " is sold for " + storeItems.get(i).price);
				numOfItems--;
				totalSales += storeItems.get(i).price;
				storeItems.remove(i);
				break; 
			}
		}
	}
	
	
	
	public void addItem(Item item) {
		storeItems.add(item);
		numOfItems++;
	}
	
//	[ele1, ele2, ]
	
	public void seeInventory() {
		// Using traditional for loop
//		for(int i = 0; i < storeItems.size(); i++) {
//			storeItems.get(i).info();
//		}
		// Using foreach loop
		for(Item i: storeItems) {
			i.info();
		}
	}
}