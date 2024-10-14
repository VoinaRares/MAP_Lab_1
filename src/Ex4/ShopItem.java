package Ex4;

public class ShopItem {

    protected int price;

    public ShopItem() {
        this.price = Integer.MAX_VALUE;
    }

    public ShopItem(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}
