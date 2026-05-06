package review.oop2.ex;

public class Rectangle {

    // 넓이와 높이
    int width;
    int height;

    // 넓이 구하기
    int calculateArea() {
        return width * height;
    }

    // 둘레 구하기
    int calculatePerimeter() {
        return (width + height) * 2;
    }

    // 정사각형 여부
    boolean isSquare() {
        return width == height;
    }
}
