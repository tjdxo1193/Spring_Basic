package sungtae.product;

public class ProductService03Impl implements ProductService02 {
    private ProductDAO02 pdao;

    public void setPdao(ProductDAO02 pdao) {
        this.pdao = pdao;
    }
    // 상품등록 기능을 수행하는 메서드
    public void newProduct(){
        System.out.println("새로운 상품등록 합니다!");
        ProductVO pvo = new ProductVO();
        pvo.setPname("수지로션");
        pvo.setPrice(35000);

        // 입력받은 상품 정보에 영속성을 부여하기 위해 DAP호출
        // 마찬가지로 new 연산자로 해당 객체를 생성하고
        //

        pdao.insertProduct(pvo);
        System.out.println("\n 새로운 상품이 등록되었습니다.");
    }


}
