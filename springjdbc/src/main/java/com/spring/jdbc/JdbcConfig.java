package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages ={"com.spring.jdbc.dao"})
public class JdbcConfig {
	@Bean(name= {"ds"})
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/db_name");
		ds.setUsername("USER_NAME");
		ds.setPassword("USER_PASSWORD");
		return ds;
	}
	
	@Bean(name= {"jdbcTemplate"})
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}
	
//	@Bean(name= {"studentDao"})
//	public StudentDao getStudentDao() {
//		StudentDaoImpl st = new StudentDaoImpl();
//		st.setJdbcTemplate(getTemplate());
//		return st;
//	}

}
