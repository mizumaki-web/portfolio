package com.example.demo_jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

  @Autowired
  private JdbcTemplate jdbcTemplate;

  public String select(int no) {
    String sql = "SELECT name FROM student WHERE no = ?";
    try {
      return jdbcTemplate.queryForObject(sql, String.class, no);
    } catch (EmptyResultDataAccessException e) {
      return null;
    }
  }
}
