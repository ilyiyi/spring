package com.wak.service.impl;

import com.github.pagehelper.PageHelper;
import com.wak.domain.Product;
import com.wak.mapper.ProductMapper;
import com.wak.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wak
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> list(Integer currentPage, Integer pageSize, String name) {
        PageHelper.startPage(currentPage, pageSize);
        List<Product> list = productMapper.list(name);
        if (list != null) {
            return list;
        }
        return new ArrayList<>();
    }

    @Override
    public int insert(Product product) {
        return productMapper.insert(product);
    }

    @Override
    public int update(Product product) {
        return productMapper.updateByPrimaryKey(product);
    }

    @Override
    public int deleteOne(Long id) {
        return productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int batchDelete(List<Long> ids) {
        return productMapper.batchDelete(ids);
    }
}
