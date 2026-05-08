package extends1.ex;

public class Item {

    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    // 상품명: JAVA 가격: 10000
    public void print() {
        System.out.println("상품명:" + name + ", 가격:" + price);
    }
}
