package com.matej.multidatasource.datasource;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.matej.multidatasource.config.DBConfig1;
import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.matej.multidatasource.repository.db1", sqlSessionTemplateRef = "test1SqlSessionTemplate")
public class DataSourceConfig1 {

    @Primary
    @Bean(name = "test1DataSource")
    public DataSource test1DataSource(DBConfig1 dbConfig1) {
        MysqlXADataSource dataSource = new MysqlXADataSource();
        dataSource.setUrl(dbConfig1.getUrl());
        dataSource.setUser(dbConfig1.getUsername());
        dataSource.setPassword(dbConfig1.getPassword());
        dataSource.setPinGlobalTxToPhysicalConnection(true);

        AtomikosDataSourceBean atomikosDataSourceBean = new AtomikosDataSourceBean();
        atomikosDataSourceBean.setXaDataSource(dataSource);
        atomikosDataSourceBean.setUniqueResourceName("test1DataSource");
        return atomikosDataSourceBean;
    }

    @Bean(name = "test1SqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("test1DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/db1/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "test1SqlSessionTemplate")
    public SqlSessionTemplate setSqlSessionTemplate(@Qualifier("test1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
