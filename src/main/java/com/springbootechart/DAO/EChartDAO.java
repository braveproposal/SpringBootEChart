package com.springbootechart.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EChartDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> listPUnit() {
        StringBuffer sql = new StringBuffer();
        sql.append("select PUnitName from PoliceUnit where Sort > 0 order by Sort");
        return jdbcTemplate.queryForList(sql.toString(), String.class);
    }

    public List<Integer> listAll() {
        StringBuffer sql = new StringBuffer();
        sql.append("select count(CaseNo) from CaseRec a, PoliceUnit b ");
        sql.append("where a.OccurPoliceUnit = b.PUnitId ");
        sql.append("and a.OccurTime between '1100101' and '1100131' ");
        sql.append("group by b.Sort order by b.Sort");
        return jdbcTemplate.queryForList(sql.toString(), Integer.class);
    }

    public List<Integer> listDead() {
        StringBuffer sql = new StringBuffer();
        sql.append("select sum(DieNum) * 100 from CaseRec a, PoliceUnit b ");
        sql.append("where a.OccurPoliceUnit = b.PUnitId ");
        sql.append("and a.OccurTime between '1100101' and '1100131' ");
        sql.append("group by b.Sort order by b.Sort");
        return jdbcTemplate.queryForList(sql.toString(), Integer.class);
    }

    public List<Integer> listHurt() {
        StringBuffer sql = new StringBuffer();
        sql.append("select sum(HurtNum) from CaseRec a, PoliceUnit b ");
        sql.append("where a.OccurPoliceUnit = b.PUnitId ");
        sql.append("and a.OccurTime between '1100101' and '1100131' ");
        sql.append("group by b.Sort order by b.Sort");
        return jdbcTemplate.queryForList(sql.toString(), Integer.class);
    }
}
