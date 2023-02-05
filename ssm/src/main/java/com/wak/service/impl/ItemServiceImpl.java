package com.wak.service.impl;

import com.wak.domain.Item;
import com.wak.mapper.ItemMapper;
import com.wak.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author wak
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public boolean save(Item item) {
        int i = itemMapper.save(item);
        return i > 0;
    }

    @Override
    public boolean delete(Long id) {
        int i = itemMapper.delete(id);
        return i > 0;
    }

    @Override
    public boolean update(Item item) {
        int i = itemMapper.update(item);
        return i > 0;
    }

    @Override
    public Item getById(Long id) {
        return itemMapper.getById(id);
    }

    @Override
    public List<Item> getAll(String name) {
        if (name != null && !"".equals(name.trim())) {
            return itemMapper.getAll(name);
        } else {
            return itemMapper.get();
        }
    }
}
