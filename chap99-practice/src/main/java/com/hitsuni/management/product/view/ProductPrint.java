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
        System.out.println("설정한 검색옵션 : " + searchCondition.getSearchOption() + ", 검색 값 : " + searchCondition.getSearchValue());
        for(ProductDTO product : productList)
            System.out.println(product);
    }

    public void printSuccessMessage(String successCode) {
        System.out.println("======= Success =======");
        switch(successCode) {
            case "insertSuccess" :
                System.out.println("제품이 등록되었습니다.");
                break;

            case "updateSuccess" :
                System.out.println("제품 정보가 업데이트 되었습니다.");
                break;

            case "deleteSuccess" :
                System.out.println("제품이 삭제되었습니다.");
                break;
        }

    }

    public void printErrorMessage(String errorCode) {
        System.out.println("======= Error =======");
        switch(errorCode) {
            case "noSearch" :
                System.out.println("결과를 조회할 수 없습니다.");
                break;

            case "noSearchCondition" :
                System.out.println("조건에 부합하는 조회 결과가 없습니다.");
                break;

            case "notInsert" :
                System.out.println("제품이 등록되지 않았습니다. 다시 등록해주십시오.");
                break;

            case "updateFail" :
                System.out.println("제품 정보를 업데이트 하는데 실패했습니다.");
                break;
        }


    }

}
