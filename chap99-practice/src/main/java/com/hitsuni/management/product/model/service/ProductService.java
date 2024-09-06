package com.hitsuni.management.product.model.service;

import com.hitsuni.common.SearchCondition;
import com.hitsuni.management.product.model.dao.ProductDAO;
import com.hitsuni.management.product.model.dto.ProductDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.hitsuni.common.Template.getSqlSession;

public class ProductService {
    SqlSession sqlSession = getSqlSession();

    ProductDAO dao = sqlSession.getMapper(ProductDAO.class);

    public List<ProductDTO> selectAllProductList() {
        List<ProductDTO> searchProductList = dao.selectAllProductList();
        if(searchProductList != null && !searchProductList.isEmpty())
            return searchProductList;
        else
            return null;
    }

    public List<ProductDTO> selectProductByCondition(SearchCondition searchCondition) {

        // 3. 조건에 따른 제품 목록을 조회하는 로직을 작성하세요.
        // 　　아래 작성된 return null 은 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        List<ProductDTO> searchProductList = dao.selectProductByCondition(searchCondition);
        if(searchProductList != null && !searchProductList.isEmpty())
            return searchProductList;
        else
            return null;
    }

    public boolean registNewProduct(ProductDTO product) {

        // 4. 제품 정보를 등록하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        return false;

    }

    public boolean modifyProductInfo(ProductDTO product) {

        // 5. 제품 정보를 수정하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        return false;

    }

    public boolean deleteProduct(Map<String, String> parameter) {

        // 6. 제품 정보를 삭제하는 로직을 작성하세요.
        // 　　아래 작성된 return false 과제 툴 오류를 제거하고자 임의 작성하였으니 지우고 로직을 작성하세요.
        return false;

    }
}