package sungtae.product;

public class ProductService01 {

    // 상품등록 기능을 수행하는 메서드
    public void newProduct() {
        System.out.println("새로운 상품을 등록합니다.");

        ProductVO pvo = new ProductVO();
        pvo.setPname("수지로션");
        pvo.setPrice(35000);

        ProductDAO01 pdao = new ProductDAO01();
        pdao.insertProduct(pvo);

        System.out.println("\n새로운 상품이 등록되었습니다!");
    }
}
