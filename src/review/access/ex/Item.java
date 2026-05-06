package review.access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // item이름 반환을 위해서.
    public String getName() {
        return name;
    }

    // 합계
    public int getTotalPrice() {    // 속성과 기능이 근처에 있는 것이 좋다.
        return price * quantity;
    }
}
