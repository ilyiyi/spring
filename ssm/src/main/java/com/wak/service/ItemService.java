package com.wak.service;

import com.wak.domain.Item;

import java.util.List;

/**
 * @author wak
 */
public interface ItemService {
    /**
     * 添加商品
     *
     * @param item 商品信息
     * @return 是否成功
     */
    boolean save(Item item);

    /**
     * 根据id删除商品
     *
     * @param id 商品id
     * @return 是否成功
     */
    boolean delete(Long id);

    /**
     * 更新商品
     *
     * @param item 商品信息
     * @return 是否成功
     */
    boolean update(Item item);

    /**
     * 根据商品id获取商品信息
     *
     * @param id 商品id
     * @return 商品信息
     */
    Item getById(Long id);

    /**
     * 查询所有商品
     *
     * @return 商品列表
     */
    List<Item> getAll(String name);
}
