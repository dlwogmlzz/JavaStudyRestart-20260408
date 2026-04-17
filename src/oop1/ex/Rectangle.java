package oop1.ex;

import org.w3c.dom.ls.LSOutput;

public class Rectangle {
    // 속성(변수)
    int width;
    int height;


    // 기능(메서드)
    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width * height);
    }

    boolean isSquare() {
        return width == height;
    }
}
