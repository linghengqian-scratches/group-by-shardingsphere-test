package com.lingh.groupbyshardingspheretest;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
@MapperScan("com.lingh.groupbyshardingspheretest")
public class GroupByShardingsphereTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(GroupByShardingsphereTestApplication.class, args);
    }
}

record TOrderPO(
        String idString,
        LocalDateTime createTime
) {
}

@Mapper
interface TOrderMapper {
    @Select("""
            select `id_string`,`create_time`
            from t_order
            where `create_time` between '2022-11-24 00:00:00.000' and '2022-11-25 00:00:00.000'
            group by (unix_timestamp(`create_time`) / 3600)
            order by `create_time`
            limit 30
            """)
    List<TOrderPO> findGroupByLogicTable();

    @Select("""
            select `id_string`,`create_time`
            from t_order
            where `create_time` between '2022-11-24 00:00:00.000' and '2022-11-25 00:00:00.000'
            limit 30
            """)
    List<TOrderPO> findByLogicTable();

    @Select("""
            select `id_string`,`create_time`
            from t_order_20221125
            where `create_time` between '2022-11-24 00:00:00.000' and '2022-11-25 00:00:00.000'
            group by (unix_timestamp(`create_time`) / 3600)
            order by `create_time`
            limit 30
            """)
    List<TOrderPO> findByActualTable();
}
