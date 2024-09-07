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
        List<ProductDTO> searchProductList = dao.selectProductByCondition(searchCondition);
        if(searchProductList != null && !searchProductList.isEmpty())
            return searchProductList;
        else
            return null;
    }

    public boolean registerNewProduct(ProductDTO product) {
        int res = dao.insertProduct(product);
       if(res == 1) {
           sqlSession.commit();
           return true;
       } else {
           sqlSession.rollback();
           return false;
       }
    }

    public boolean modifyProductInfo(ProductDTO product) {
        int res = dao.updateProduct(product);
        if(res == 1) {
            sqlSession.commit();
            return true;
        } else {
            sqlSession.rollback();
            return false;
        }
    }

    public boolean deleteProduct(Map<String, String> parameter) {
        int res = dao.deleteProduct(parameter);
        if(res == 1) {
            sqlSession.commit();
            return true;
        } else {
            sqlSession.rollback();
            return false;
        }
    }
}