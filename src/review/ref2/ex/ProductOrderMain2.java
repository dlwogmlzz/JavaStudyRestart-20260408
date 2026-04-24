package review.ref2.ex;

// 리펙토링!!!!
public class ProductOrderMain2  {
    public static void main(String[] args) {
        // 1. 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[3];

        // 2. 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
        orders[0] = CreateOrder("삼겹살", 1000, 2);
        orders[1] = CreateOrder("깻잎", 300, 3);
        orders[2] = CreateOrder("쌈장", 600, 1);

        // 출력 메서드 호출
        printOrders(orders);
        // 총 결제 금액 메서드 호출
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액 : " + totalAmount + "円");
    }

    static ProductOrder CreateOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order; // return 변수명
    }

    // 출력만, 반환 필요없음.
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
