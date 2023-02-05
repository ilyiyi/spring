package com.wak.controller;

import com.wak.domain.Item;
import com.wak.resp.Code;
import com.wak.resp.ResultResp;
import com.wak.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wak
 */
@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResultResp save(@RequestBody Item item) {
        boolean res = itemService.save(item);
        return new ResultResp(res ? Code.SAVE_OK : Code.SAVE_FAIL, res);
    }

    @PutMapping
    public ResultResp update(@RequestBody Item item) {
        boolean res = itemService.update(item);
        return new ResultResp(res ? Code.UPDATE_OK : Code.UPDATE_FAIL, res);
    }

    @DeleteMapping("/{id}")
    public ResultResp delete(@PathVariable Long id) {
        boolean res = itemService.delete(id);
        return new ResultResp(res ? Code.DELETE_OK : Code.DELETE_FAIL, res);
    }

    @GetMapping("/{id}")
    public ResultResp getById(@PathVariable Long id) {
        Item item = itemService.getById(id);
        return ResultResp.success(item == null ? Code.GET_FAIL : Code.GET_OK, item);
    }

    @GetMapping
    public ResultResp getAll(@RequestParam String name) {
        List<Item> data = itemService.getAll(name);
        return new ResultResp(data == null ? Code.LIST_FAIL : Code.LIST_OK, data);
    }
}
