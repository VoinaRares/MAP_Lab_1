package Ex4;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<ShopItem> items;

    public Shop(){
        items = new ArrayList<ShopItem>();
    }

    public Shop(List<ShopItem> items) {
        this.items = items;
    }

    public List<ShopItem> getItems() {
        return items;
    }

    public void setItems(List<ShopItem> items) {
        this.items = items;
    }

    public Keyboard getCheapestKeyboard() {
        Keyboard cheapestKeyboard = new Keyboard();
        for(ShopItem item : items) {
            if (item instanceof Keyboard && item.getPrice() < cheapestKeyboard.getPrice()) {
                cheapestKeyboard = (Keyboard) item;
            }
        }
        return cheapestKeyboard;
    }

    public ShopItem getMostExpensiveItem() {
        ShopItem mostExpensiveItem = null;

        for(ShopItem item : items) {
            if(mostExpensiveItem == null){
                mostExpensiveItem = item;
            } else if (item.getPrice() > mostExpensiveItem.getPrice() && mostExpensiveItem.getPrice() != Integer.MAX_VALUE) {
                mostExpensiveItem = item;
            }
        }

        return mostExpensiveItem;
    }

    public USBDrive getMostExpensiveUSBDriveOnBudget(int budget) {
        USBDrive mostExpensiveUSBDrive = new USBDrive(0);

        for(ShopItem item : items) {
            if(item instanceof USBDrive && item.getPrice() <= budget && item.getPrice() > mostExpensiveUSBDrive.getPrice() && mostExpensiveUSBDrive.getPrice() != Integer.MAX_VALUE) {
                mostExpensiveUSBDrive = (USBDrive) item;
            }
        }

        return mostExpensiveUSBDrive;
    }

    public int getKeyboardAndUSBUnderBudget(int budget) {
        int maxSum = -1;
        for(ShopItem keyboard : items) {
            if(keyboard instanceof Keyboard){
                for(ShopItem usb : items){
                    if (usb instanceof USBDrive) {
                        if(usb.getPrice() + keyboard.getPrice() <= budget) {
                            if(maxSum < usb.getPrice() + keyboard.getPrice()) {
                                maxSum = usb.getPrice() + keyboard.getPrice();
                            }
                        }
                    }
                }
            }
        }
        return maxSum;
    }

}
