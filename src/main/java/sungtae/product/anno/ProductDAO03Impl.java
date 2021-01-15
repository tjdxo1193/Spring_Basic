package sungtae.product.anno;

import org.springframework.stereotype.Component;
import sungtae.product.ProductVO;

@Component("pdao")
public class ProductDAO03Impl {
    public void insertProduct(ProductVO pvo) {
        System.out.printf("입력하신 %s가 성공적으로 저장되었습니다", pvo.getPname());

    }
}
