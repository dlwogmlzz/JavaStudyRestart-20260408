package review.ex;

public class ProductorderMain {
    public static void main(String[] args) {
        // 1. 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[2];
        // 2. 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
        ProductOrder order1 = new ProductOrder();
        order1.productName = "삼겹살";
        order1.price = 800;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "깻잎";
        order2.price = 300;
        order2.quantity = 3;
        orders[1] = order2;

        // 총가격
        int totalAmount = 0;

        // 3. 상품 주문 정보와 최종 금액 출력
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            totalAmount += order.price * order.quantity;
        }
        System.out.println("총 결제 금액 : " + totalAmount + "円");
    }
}
