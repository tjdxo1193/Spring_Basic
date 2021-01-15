package sungtae.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import sungtae.bean.HelloSpring4Bean04;

public class HelloSpring4App06 {
    //스프링 프레임워크를 사용하는 첫번째 사례
    // 이전 예제에서는 factory 패턴을 이용해서
    // 객체를 생성하는 코드를 작성했었음
    // 하지만, 스프링 프레임워크를 사용하면 이러한 과정은 x

    //스프링 프레임 워크
    //DI, IoC, AOP를 적용한 콘솔/GUI/웹 응용프로그램 개발에
    // 사용하는 오픈소스 프레임 워크
    // 복잡한 절차를 요구하고 비용이 많이드는 EJB에 비해
    // 사용이 간단하고, 무료 서블릿 컨테이너에도 무난히 실행됨


    //스프링 프레임워크를 이용한 개발의 필수요건은
    // 인터페이스 기반 설계임!

    // 라이브러리
    // spring - beans(repo.spring.io)
    // spring - core
    // commons - logging()

    // 실행원리
    // 예제에서 보듯 객체 생성시 new 연산자를 사용하지 않고
    // 스프링이 대신 객체를 생성하고 프로그램에서는 DI를 통해 사용함
    // 1. bean.xml에 스프링 컨테이너가 미리 생성해둬야할 객체와 이름을 정의해 둠
    // 2. 프로그램이 시작되면 bean06.xml에 작성한 객체 정보를 스프링 컨테이너가 읽어서 객체를 만들어 둠
    // 3. BeanFactory에서 getBean 메서드로 해당객체를 가져와서 HelloSpring4Bean04 타입의 변수에 주입함
    // 4. 주입된 변수를 통해 sayHello 메서드를 호출하면 인삿말이 출력됨


    // 스프링 컨테이너 (정의 찾기) :
    // 스프링 프레임워크에서 제공하는 컨테이너는 2가지
    // BeanFactory
    // ApplicationContext

    public static void main(String[] args) {
        // 스프링 컨테이너의 관리를 받는 객체들이 정의된 설정파일 읽기
        BeanFactory bf = new XmlBeanFactory(
                new FileSystemResource("src/main/java/bean06.xml"));

        // 스프링 컨테이너를 통해 지정한 객체를 주입 받음
        HelloSpring4Bean04 bean = (HelloSpring4Bean04) bf.getBean("kor");
        bean.sayHello("스프링4");

        bean = (HelloSpring4Bean04) bf.getBean("jpn");
        bean.sayHello("スプリング4");

        bean = (HelloSpring4Bean04) bf.getBean("eng");
        bean.sayHello("Spring04");
    }
}
