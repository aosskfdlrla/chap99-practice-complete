package com.hitsuni.management.product.model.dao;

import com.hitsuni.common.SearchCondition;
import com.hitsuni.management.product.model.dto.ProductDTO;

import java.util.List;

public interface ProductDAO {
    List<ProductDTO> selectAllProductList();
    List<ProductDTO> selectProductByCondition(SearchCondition condition);
}