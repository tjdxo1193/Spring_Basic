package sungtae.product;

public class ProductService02Impl implements ProductService02 {

    public void newProduct(){
        System.out.println("새로운 상품을 등록합니다!");

        ProductVO pvo = new ProductVO();
        pvo.setPname("수지로션");
        pvo.setPrice(35000);

        //입력받은 상품 정보에 영속성을 부여하기 위해 DAO호출
        //마찬가지로 new 연산자로 해당 객체를 생성하고
        //insertProduct 메서드 호출함

        ProductDAO02 pdao = new ProductDAO02Impl();
        pdao.insertProduct(pvo);

        System.out.println("\n새로운 상품이 등록되었습니다!");
    }


}
