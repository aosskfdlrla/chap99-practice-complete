package com.hitsuni.management.product.model.dao;

import com.hitsuni.common.SearchCondition;
import com.hitsuni.management.product.model.dto.ProductDTO;

import java.util.List;
import java.util.Map;

public interface ProductDAO {
    List<ProductDTO> selectAllProductList();
    List<ProductDTO> selectProductByCondition(SearchCondition condition);
    int insertProduct(ProductDTO product);
    int updateProduct(ProductDTO product);
    int deleteProduct(Map<String, String> parameter);
}