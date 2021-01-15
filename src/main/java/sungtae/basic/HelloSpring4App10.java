package sungtae.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sungtae.product.ProductService02;
import sungtae.product.ProductService02Impl;
import sungtae.product.ProductService03Impl;

public class HelloSpring4App10 {
    // 상품 등록 프로그램
    // HelloSpring4App10 -> ProductService02 -> ProductDAO02
    // Main 클래스에서 상품등록기능을 실행하기 위해
    // 스프링 컨테이너가 만들어준 객체를 이용함
    // 이때 setter 메서드를 이용해서 객체를 주입받음
    // bean 설정파일에는 property 라는 태그에 정의해 둠


    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("product.xml");

        ProductService02 ps = (ProductService03Impl) ctx.getBean("ps03");

        // ProductDAO03 pdao = new ProductDAO03Impl()
        // ps.setPdao(pdao);
        // ProductDAO03 에 대한 객체를 사용하려면 new 연산자로 해당 객체를 생성해야 하는데
        // 이러한 작업을 스프링 컨테이너에 의해 대신 처리함
        //단, bean.xml에 이러한 내용이 미리 선언되어 있어야 함

        ps.newProduct();
    }
}
