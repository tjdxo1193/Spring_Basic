package sungtae.bean.anno;

import org.springframework.stereotype.Component;
import sungtae.bean.HelloSpring4Bean04;

@Component("eng")
public class HelloSpring4Bean04Eng implements HelloSpring4Bean04 {

    @Override
    public void sayHello(String msg){
        System.out.println("Hello, " + msg);
    }

}
