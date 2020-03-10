package com.matej.multidatasource.datasource;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import com.matej.multidatasource.config.DBConfig2;
import com.mysql.jdbc.jdbc2.optional.MysqlXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.matej.multidatasource.repository.db2", sqlSessionTemplateRef = "test2SqlSessionTemplate")
public class DataSourceConfig2 {

    @Bean(name = "test2DataSource")
    public DataSource test2DataSource(DBConfig2 dbConfig2) {
        MysqlXADataSource dataSource = new MysqlXADataSource();
        dataSource.setUrl(dbConfig2.getUrl());
        dataSource.setUser(dbConfig2.getUsername());
        dataSource.setPassword(dbConfig2.getPassword());
        dataSource.setPinGlobalTxToPhysicalConnection(true);

        AtomikosDataSourceBean atomikosDataSourceBean = new AtomikosDataSourceBean();
        atomikosDataSourceBean.setXaDataSource(dataSource);
        atomikosDataSourceBean.setUniqueResourceName("test2DataSource");
        return atomikosDataSourceBean;
    }

    @Bean(name = "test2SqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("test2DataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/db2/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "test2SqlSessionTemplate")
    public SqlSessionTemplate setSqlSessionTemplate(@Qualifier("test2SqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
