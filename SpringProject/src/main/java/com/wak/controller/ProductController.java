package com.wak.controller;

import com.github.pagehelper.PageInfo;
import com.wak.domain.Product;
import com.wak.domain.User;
import com.wak.repsonse.ResultResponse;
import com.wak.service.ProductService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author wak
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResultResponse addProduct(@RequestBody Product product, HttpSession session) {
        ResultResponse resp;
        try {
            User user = (User) session.getAttribute("user");
            product.setCreateTime(new Date());
            product.setCreateId(user.getId());
            int i = productService.insert(product);
            resp = new ResultResponse().put(i > 0);
        } catch (Exception e) {
            e.printStackTrace();
            resp = new ResultResponse(e.getClass().getSimpleName(), e.getMessage());
        }
        return resp;
    }

    @GetMapping
    public ResultResponse list(Integer currentPage, Integer pageSize, String name) {
        ResultResponse resp;
        try {
            List<Product> list = productService.list(currentPage, pageSize, name);
            PageInfo<Product> pageInfo = new PageInfo<>(list);
            resp = new ResultResponse().put(pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            resp = new ResultResponse(e.getClass().getSimpleName(), e.getMessage());
        }
        return resp;
    }

    @PutMapping
    public ResultResponse updateProduct(@RequestBody Product product, HttpSession session) {
        ResultResponse resp;
        try {
            User user = (User) session.getAttribute("user");
            product.setUpdateId(user.getId());
            product.setUpdateTime(new Date());
            int i = productService.update(product);
            resp = new ResultResponse().put(i > 0);
        } catch (Exception e) {
            e.printStackTrace();
            resp = new ResultResponse(e.getClass().getSimpleName(), e.getMessage());
        }
        return resp;
    }

    @DeleteMapping("/{id}")
    public ResultResponse deleteProduct(@PathVariable("id") Long id) {
        ResultResponse resp;
        try {
            int i = productService.deleteOne(id);
            resp = new ResultResponse().put(i > 0);
        } catch (Exception e) {
            e.printStackTrace();
            resp = new ResultResponse(e.getClass().getSimpleName(), e.getMessage());
        }
        return resp;
    }

    @DeleteMapping
    public ResultResponse batchDelete(@RequestBody List<Long> ids) {
        ResultResponse resp;
        try {
            int i = productService.batchDelete(ids);
            resp = new ResultResponse().put(i > 0);
        } catch (Exception e) {
            e.printStackTrace();
            resp = new ResultResponse(e.getClass().getSimpleName(), e.getMessage());
        }
        return resp;
    }
}
