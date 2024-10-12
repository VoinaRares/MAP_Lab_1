package Ex4;

public class Keyboard implements ShopItem{
    private int price;
    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public Keyboard(int price){
        this.price = price;
    }
    public Keyboard(){
        this.price = Integer.MAX_VALUE;
    }
}
