package sungtae.basic;

import sungtae.product.ProductService02;
import sungtae.product.ProductService02Impl;

public class HelloSpring4App09 {
    // 상품 등록 프로그램 v2

    // HelloSpring4App09 -> ProductService02 -> ProductDAO02
    // Main 클래스에서 상품등록기능을 실행하기 위해
    // New 연산자를 이용해서 ProductService02의 객체를 만들고
    // 그 객체를 통해서 newProduct()를 호출함
    // 인터페이스 기반으로 코드 재작성


    public static void main(String[] args) {
        ProductService02 ps = new ProductService02Impl();
        ps.newProduct();
    }
}
