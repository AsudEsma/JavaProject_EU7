package assignments.Assignment_OOP_Concepts.Q14.TJMaxx;

import java.util.ArrayList;
import java.util.List;

/**
 * represents TJMaxx store class.
 * https://tjmaxx.com/
 */
public class TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
    	regularItems = new ArrayList<>();
        onSaleItems = new ArrayList<>();
    }

    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {
       
    	for(Item each: regularItems) {
    		
    		if(each.getName().equalsIgnoreCase(item.getName())) {
    			
    			each.setQuantity(each.getQuantity()+item.getQuantity());
    			
    			return;
    		}
    	}
    	regularItems.add(item);
    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        
    	for(OnSaleItem each: onSaleItems) {
    		
    		if(each.getName().equalsIgnoreCase(item.getName())) {
    			
    			each.setQuantity(each.getQuantity()+item.getQuantity());
    			
    			return;
    		}
    	}
    	onSaleItems.add(item);
    }

    /**
     * getter for regularItems
     * @return
     */
    public List<Item> getRegularItems() {
        return regularItems;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {
        return onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
        return regularItems.size();
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public List<String> getAllItemNames() {
       
       List<String> names = new ArrayList<>();
       
       for(Item each : regularItems) {
    	   
    	   names.add(each.getName());
       }
       
       for(OnSaleItem each : onSaleItems) {
    	   
    	   names.add(each.getName());
       }
       return names;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalogNumber
     */
    public double getItemPrice(int catalogNumber) {
       	double price = 0;

    	for(Item each : regularItems) {
    		if(each.getCatalogNumber()==catalogNumber) {
    			price = each.getPrice();
    		}
    	}
    	for(OnSaleItem each : onSaleItems) {
    		if(each.getCatalogNumber()==catalogNumber) {
    			price = each.getPrice();
    		}
    	}
        return price;
    }

    /**
     * accepts a name then searches
     * among onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name) {
        
    	for(OnSaleItem each : onSaleItems) {
    		
    		if(each.getName().equalsIgnoreCase(name)) {
    			return each;
    		}
    	}
        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        
    	for(int i=0; i<regularItems.size(); i++) {
    		
    		if(regularItems.get(i).getCatalogNumber()==catalogNumber) {
    			regularItems.remove(i);
				System.out.println("The regular item " + catalogNumber + " is removed.");
    		}
    	}
    	
    	for(int i=0; i<onSaleItems.size(); i++) {
    		
    		if(onSaleItems.get(i).getCatalogNumber()==catalogNumber) {
    			onSaleItems.remove(i);
				System.out.println("The on sale item " + catalogNumber + " is removed.");
    		}
    	}
    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {
       
    	for(int i=0; i<regularItems.size(); i++) {
    		
    		if(regularItems.get(i).getCatalogNumber()==catalogNumber) {
				regularItems.get(i).setQuantity(regularItems.get(i).getQuantity() - 1);

    			if(regularItems.get(i).getQuantity()==0) {
    				removeItem(catalogNumber);
    			}
    		}
    	}
    	
    	for(int i=0; i<onSaleItems.size(); i++) {
    		
    		if(onSaleItems.get(i).getCatalogNumber()==catalogNumber) {
				onSaleItems.get(i).setQuantity(onSaleItems.get(i).getQuantity() - 1);

    			if(onSaleItems.get(i).getQuantity()==0) {
    				removeItem(catalogNumber);
    			}
    		}
    	}
    }

	public void buyItem(int catalogNumber, int quantity) {

		for(int i=0; i<regularItems.size(); i++) {

			if(regularItems.get(i).getCatalogNumber()==catalogNumber) {
				if(regularItems.get(i).getQuantity() >= quantity) {
					regularItems.get(i).setQuantity(regularItems.get(i).getQuantity() - quantity);
				} else {
					System.out.println("The amount exceeds the stocks.");
				}
				if(regularItems.get(i).getQuantity()==0) {
					removeItem(catalogNumber);
				}
			}
		}

		for(int i=0; i<onSaleItems.size(); i++) {

			if(onSaleItems.get(i).getCatalogNumber()==catalogNumber) {
				if(onSaleItems.get(i).getQuantity() >= quantity) {
					onSaleItems.get(i).setQuantity(onSaleItems.get(i).getQuantity() - quantity);
				} else {
					System.out.println("The amount exceeds the stocks.");
				}
				if(onSaleItems.get(i).getQuantity()==0) {
					removeItem(catalogNumber);
				}
			}
		}
	}

}

