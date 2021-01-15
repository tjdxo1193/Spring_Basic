package sungtae.bean.anno;

import org.springframework.stereotype.Component;
import sungtae.bean.HelloSpring4Bean04;


@Component("jpn")
public class HelloSpring4Bean04Jpn implements HelloSpring4Bean04 {

    @Override
    public void sayHello(String msg){
        System.out.println("こんにちは, " + msg);
    }

}
