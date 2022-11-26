package com.lingh.groupbyshardingspheretest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.UncategorizedSQLException;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class GroupByShardingsphereTestApplicationTests {

    @Autowired
    TOrderMapper tOrderMapper;

    @Test
    void testLogicTableWithGroup() {
        assertThrows(UncategorizedSQLException.class, () -> tOrderMapper.findByLogicTable());
        tOrderMapper.findGroupByLogicTable();
    }

    @Test
    void testLogicTableWithoutGroup() {
        List<TOrderPO> tOrderPOS = List.of(
                new TOrderPO("114515", LocalDateTime.of(2022, 11, 24, 0, 0, 0)),
                new TOrderPO("114516", LocalDateTime.of(2022, 11, 25, 0, 0, 0))
        );
        assertThat(tOrderMapper.findByLogicTable()).isEqualTo(tOrderPOS);
    }

    @Test
    void testActualTable() {
        assertThat(tOrderMapper.findByActualTable())
                .isEqualTo(List.of(new TOrderPO("114516", LocalDateTime.of(2022, 11, 25, 0, 0, 0))));
    }

}
