package com.example.mapper;


import com.example.entity.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BorrowMapper {

    @Select("select * from db_borrow where uid = #{uid}")
    List<Borrow> getBorrowByUid(int uid);

}
