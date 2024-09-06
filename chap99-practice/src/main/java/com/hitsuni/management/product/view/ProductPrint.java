package com.hitsuni.management.product.view;

import com.hitsuni.common.SearchCondition;
import com.hitsuni.management.product.model.dto.ProductDTO;

import java.util.List;

public class ProductPrint {
    public void printAllProductList(List<ProductDTO> allProductList) {
        for(ProductDTO product : allProductList)
            System.out.println(product);
    }

    public void printProductList(List<ProductDTO> productList, SearchCondition searchCondition) {

        // 2. 조건에 따라 조회한 목록을 출력하는 메소드
        //    (조건 1) SearchCondition 객체로 검색 조건이 무엇인지 출력하세요.
        //    (조건 2) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.
        System.out.println("설정한 검색옵션 : " + searchCondition.getSearchOption() + ", 검색 값 : " + searchCondition.getSearchValue());
        for(ProductDTO product : productList)
            System.out.println(product);
    }

    public void printSuccessMessage(String successCode) {

        // 3. 성공메시지를 출력하는 메소드
        //    (조건) 성공코드를 전달받아 성공을 알리는 메시지를 출력하세요.

    }

    public void printErrorMessage(String errorCode) {

        // 4. 에러메시지를 출력하는 메소드
        //    (조건) 에러코드를 전달받아 에러를 알리는 메시지를 출력하세요.
        System.out.println("======= Error =======");
        switch(errorCode) {
            case "noSearch" :
                System.out.println("결과를 조회할 수 없습니다.");
                break;

            case "noSearchCondition" :
                System.out.println("조건에 부합하는 조회 결과가 없습니다.");
                break;
        }


    }

}
