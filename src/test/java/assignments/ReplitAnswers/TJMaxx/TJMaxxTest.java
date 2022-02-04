package assignments.ReplitAnswers.TJMaxx;

public class TJMaxxTest {
	public static void main(String[] args) {
		
		Item item1 = new Item("green apple", 5, 221, 0.99);
        Item item2 = new Item("orange",2, 102, 1.99);
        Item item3 = new Item("pineapple",3, 103, 2.99);
        Item item4 = new Item("pear",4, 104, 3.99);
        Item item5 = new Item("red apple",4, 101, 3.99);
        
        OnSaleItem saleItem10 = new OnSaleItem("red apple",2,101, 1, 5);
        OnSaleItem saleItem11 = new OnSaleItem("broccoli",1, 105, 2, 10);
        OnSaleItem saleItem12 = new OnSaleItem("carrot",3, 106, 4, 25);
        OnSaleItem saleItem13 = new OnSaleItem("melon",5, 107, 5, 40);
        OnSaleItem saleItem14 = new OnSaleItem("grape",6, 108, 6, 20);

        TJMaxx list1 = new TJMaxx();

        list1.addRegularItem(item1);
        list1.addRegularItem(item2);
        list1.addRegularItem(item3);
        list1.addRegularItem(item4);
        list1.addRegularItem(item5);

        list1.addOnSaleItem(saleItem10);
        list1.addOnSaleItem(saleItem11);
        list1.addOnSaleItem(saleItem12);
        list1.addOnSaleItem(saleItem13);
        list1.addOnSaleItem(saleItem14);

        item1.setPrice(1.49);
        item1.setQuantity(3);
        item1.setCatalogNumber(99);
        item1.setName("Apple");
        System.out.println(item1.toString());

        System.out.println(saleItem14.toString());

        System.out.println("Total product on sale: " + list1.onSaleItemsCount());

        System.out.println("All items remained: "+list1.getAllItemNames());

        System.out.println("The price of catalogNumber 105: " + list1.getItemPrice(105));

        System.out.println("isRedAppleOnSale: " + list1.getOnSaleItem("red apple"));
        
        System.out.println("isGreenAppleOnSale: " + list1.getOnSaleItem("green apple"));

        System.out.println("isBananaOnSale: " + list1.getOnSaleItem("banana"));

        System.out.println("isPearOnSale: " + list1.getOnSaleItem("pear"));

        list1.removeItem(101);
        list1.removeItem(104);

        System.out.println("All items after [red apple] and [pear] were removed "+list1.getAllItemNames());

        list1.buyItem(105);
        System.out.println("Amount of broccoli after sale: "+saleItem11.getQuantity());
        list1.buyItem(108);
        System.out.println("Amount of grape after sale: "+saleItem14.getQuantity());
        list1.buyItem(108, 6);
        System.out.println("Amount of grape after sale: "+saleItem14.getQuantity());
        list1.buyItem(108, 4);
        System.out.println("Amount of grape after sale: "+saleItem14.getQuantity());
        list1.buyItem(108);
        list1.buyItem(102,6);
        System.out.println("Amount of orange after sale: "+item2.getQuantity());

        System.out.println("All items remained: "+list1.getAllItemNames());

	}

}
