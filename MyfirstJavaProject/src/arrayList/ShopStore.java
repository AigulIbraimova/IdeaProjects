package arrayList;

import constructorsClassTascs.Item;

public class ShopStore {

	public static void main(String[] args) {

		Storee myStore = new Storee("Cool Books", "600 N Michigan ave, Chicago IL");

		Item book1 = new Item("100$ startup", 14.99);
		myStore.addItem(book1);
		Item mouse = new Item("Computer mouse", 44.99);
		Item pen = new Item("Mount Bla Bla", 120);
		myStore.addItem(mouse);

		myStore.addItem(pen);
		myStore.seeInventory();
		System.out.println("\nSelling something");
		myStore.sell("Computer mouse");
		myStore.seeInventory();
		System.out.println(myStore.totalSales);


	}

}
