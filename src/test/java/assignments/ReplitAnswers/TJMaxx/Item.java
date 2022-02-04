package assignments.ReplitAnswers.TJMaxx;

public class Item {

	//private instance variables
    private String name;
    private int catalogNumber;
    private int quantity;
    private double price;

    /**
     * public constructor with:
     * @param name
     * @param quantity
     * @param catalogNumber
     * @param price
     *
     * assigns to values to instance variables
     */
    public Item(String name,int quantity,int catalogNumber, double price) {
      setName(name);
      setQuantity(quantity);
      setCatalogNumber(catalogNumber);
      setPrice(price);
    }

    /**
     * setter for name instance variable
     * @param name
     */
    public void setName(String name) {
       if(!name.isEmpty()) {
           this.name = name;
       }
    }

    /**
     * setter for private price
     * @param price
     */
    public void setPrice(double price) {
        if(price>0) {
            this.price = price;
        }
    }

    /**
     * getter for price
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     * getter for name
     * @return
     */
    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;

    }
    public void setQuantity(int quantity){
        if(quantity>=0) {
            this.quantity = quantity;
        }
    }

    public int getCatalogNumber(){
        return catalogNumber;
    }

    public void setCatalogNumber(int catalogNumber) {
        if(catalogNumber>0) {
            this.catalogNumber = catalogNumber;
        }
    }

    /**
     * Override toString:
     * @returns Object description in this format:
     * "Regular Item{name='Item name', catalogNumber=1234, quantity=5, price=9.99}"
     */

	@Override
	public String toString() {
		return "Regular Item {name='" + name + "', catalogNumber=" + catalogNumber + ", quantity=" + quantity
                + ", price=" + price + "}";
	}
  
}