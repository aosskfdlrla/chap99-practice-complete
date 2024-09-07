package com.hitsuni.management.product.controller;

import com.hitsuni.common.SearchCondition;
import com.hitsuni.management.product.model.dto.ProductDTO;
import com.hitsuni.management.product.model.service.ProductService;
import com.hitsuni.management.product.view.ProductPrint;

import java.util.List;
import java.util.Map;

public class ProductController {

    // * 주석을 지우고 Controller 역할에 해당하는 내용을 작성하세요.

    // 1. 자주 사용할 Service와 Print 객체를 선언하고, Controller 객체 생성 시 생성되도록 작성하세요.
    ProductService productService = new ProductService();
    ProductPrint productPrint = new ProductPrint();

    public void selectAllProductList() {
        List<ProductDTO> productList = productService.selectAllProductList();
        if(productList != null && !productList.isEmpty()) {
            productPrint.printAllProductList(productList);
        } else {
            productPrint.printErrorMessage("noSearch");
        }
    }

    public void selectProductByCondition(SearchCondition searchCondition) {
        List<ProductDTO> productList = productService.selectProductByCondition(searchCondition);
        if(productList != null && !productList.isEmpty()) {
            productPrint.printProductList(productList, searchCondition);
        } else {
            productPrint.printErrorMessage("noSearchCondition");
        }
    }

    public void registerNewProduct(ProductDTO product) {
       boolean result = productService.registerNewProduct(product);
       if(result)
           productPrint.printSuccessMessage("insertSuccess");
       else
           productPrint.printErrorMessage("notInsert");
    }

    public void modifyProductInfo(ProductDTO product) {
        boolean result = productService.modifyProductInfo(product);
        if(result)
            productPrint.printSuccessMessage("updateSuccess");
        else
            productPrint.printErrorMessage("updateFail");
    }

    public void deleteProduct(Map<String, String> parameter) {
        boolean result = productService.deleteProduct(parameter);
        if(result)
            productPrint.printSuccessMessage("deleteSuccess");
        else
            productPrint.printErrorMessage("deleteFail");
    }
}
