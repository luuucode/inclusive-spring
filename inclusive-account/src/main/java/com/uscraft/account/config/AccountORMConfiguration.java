package com.uscraft.account.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;



@Configuration
/**
 * 配置*Mapper.java扫描路径
 */
@MapperScan(value = {"com.uscraft.account.mapper"},sqlSessionFactoryRef = "sqlSessionFactory")
//@ConditionalOnProperty(name = "spring.datasource",matchIfMissing = false)
public class AccountORMConfiguration {

    @Bean(name = "datasource")
    @ConfigurationProperties(prefix = "spring.datasource.tomcat")
    public DataSource dataSource() throws SQLException {
        DataSource datasource = DataSourceBuilder.create().build();
        Class<? extends DataSource> aClass = datasource.getClass();
        System.out.println("datasource class: " + aClass);
        System.out.println("datasource toStr: " + datasource.toString());
        return datasource;
    }



    @Bean(name = "transactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("datasource") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "sqlSessionFactory")
    @ConditionalOnMissingBean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("datasource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(dataSource);
        //指定会话工厂获取*Mapper.xml的路径
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath*:account_mapper/*.xml"));
        return sqlSessionFactory.getObject();
    }


    @Bean(name = "sqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}
