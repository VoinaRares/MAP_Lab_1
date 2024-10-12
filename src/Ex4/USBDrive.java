package Ex4;

public class USBDrive implements ShopItem{

    private int price;

    public USBDrive(int price){
        this.price = price;
    }

    public USBDrive(){
        this.price = 0;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }


}
