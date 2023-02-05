package com.wak.mapper;

import com.wak.domain.Item;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wak
 */
@Repository
public interface ItemMapper {

    @Insert("insert into item(type, name, remark) value(#{type}, #{name}, #{remark})")
    int save(Item item);

    @Delete("delete from item where id = #{id}")
    int delete(Long id);

    @Update("update item set type = #{type}, name = #{name}, remark = #{remark} where id = #{id}")
    int update(Item item);

    @Select("select * from item where id = #{id}")
    Item getById(Long id);

    @Select("select * from item where name like concat('%',#{name},'%')")
    List<Item> getAll(String name);

    @Select("select * from item")
    List<Item> get();

}
