package module_micro_api_helloworld.utils;

import java.sql.SQLException;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;

import module_micro_api_helloworld.Config;

public class DataSources {

	public static DataSource build(Config config) throws SQLException {
		DruidDataSource dataSource = new DruidDataSource();

		dataSource.setUrl(config.getJdbcUrl());
		dataSource.setUsername(config.getJdbcUser());
		dataSource.setPassword(config.getJdbcPassword());

		dataSource.setFilters("stat");

		dataSource.setMaxActive(20);
		dataSource.setInitialSize(1);
		dataSource.setMaxWait(60000);
		dataSource.setMinIdle(1);

		dataSource.setTimeBetweenEvictionRunsMillis(60000);
		dataSource.setMinEvictableIdleTimeMillis(300000);

		dataSource.setTestWhileIdle(true);
		dataSource.setTestOnBorrow(false);
		dataSource.setTestOnReturn(false);

		dataSource.setPoolPreparedStatements(true);
		dataSource.setMaxOpenPreparedStatements(20);

		dataSource.setAsyncInit(true);

		return dataSource;
	}
}
