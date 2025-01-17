class CartItem {
    // Attributes 
    private String itemName;
    private int itemPrice;
    private int quantity;

    // Constructor
    CartItem(String itemName, int itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    // Getters & setters 
    public String getItemName() {
        return itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }
}

class ShoppingCart {
    // Attributes 
    private CartItem items[];
    private int cartSize;
    private int itemCount;
    
    // Constructor 
    ShoppingCart(int cartSize) {
        this.cartSize = cartSize;
        items = new CartItem[cartSize];
        itemCount = 0;
    }

    // Methods-
    // Method to add an item to the cart 
    public void addItemToCart(CartItem item) {
        // Checking if the cart is full 
        if (itemCount == cartSize) {
            System.out.println("Cart is already full.");
            return;
        }
        
        // If the cart is empty 
        items[itemCount] = item;
        itemCount++;
        System.out.println("Item added to the cart");
    }

    // Method to display the total cost of the items in the cart 
    public void displayTotalCost() {
        // Calculating the total cost of the items present in the cart 
        int totalCost = 0; //initializing it with zero
        for (int i = 0; i < itemCount; i++) {
            totalCost += items[i].getItemPrice();
        }

        // printing the result 
        System.out.println("The total cost is " + totalCost);
    }

    // Method to remove an item from the cart 
    public void removeFromCart(String itemName) {
        // Finding the item in the cart 
        int itemLocation = 0;
        for (int i = 0; i < itemCount; i++) {
            if (items[i].getItemName() == itemName) {
                itemLocation = i;
                break;
            }
        }
        // Checking if the item is at last 
        if (itemLocation == itemCount-1) {
            itemCount--; //Removing the item from the cart
            System.out.println("Item successfully removed.");
            return;
        }

        // Left shifting from the item location 
        for (int i = itemLocation; i < itemCount-1; i++) {
            items[i] = items[i+1];
        }
        itemCount--;

        System.out.println("Item removed successfully.");
    }
    
    public static void main(String[] args) {
        // Defining a sample cart to test shopping cart 
        ShoppingCart sampleCart = new ShoppingCart(3);

        // Defining sample items for sampleCart
        CartItem item1 = new CartItem("item-1", 200, 50);
        CartItem item2 = new CartItem("item-2", 200, 50);
        CartItem item3 = new CartItem("item-3", 200, 50);
        

        // Adding items to cart 
        sampleCart.addItemToCart(item1);
        sampleCart.addItemToCart(item2);
        sampleCart.addItemToCart(item3);

        // Removing item3 
        sampleCart.removeFromCart("item-2");

        // Calculating the total cost 
        sampleCart.displayTotalCost();
    }
}