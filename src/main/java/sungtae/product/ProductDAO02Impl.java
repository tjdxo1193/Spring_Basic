package sungtae.product;

public class ProductDAO02Impl implements ProductDAO02 {
    public void insertProduct(ProductVO pvo) {
        System.out.printf("입력하신 %s가 성공적으로 저장되었습니다", pvo.getPname());

    }
}
