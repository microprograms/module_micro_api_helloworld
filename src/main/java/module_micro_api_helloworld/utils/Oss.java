package module_micro_api_helloworld.utils;

import java.sql.SQLException;

import javax.sql.DataSource;

import com.github.microprograms.micro_oss_core.MicroOssConfig;
import com.github.microprograms.micro_oss_core.MicroOssProvider;
import com.github.microprograms.micro_oss_mysql.MysqlMicroOssProvider;

import module_micro_api_helloworld.Config;

public class Oss {
	private static DataSource dataSource;
	private static boolean inited = false;
	private static MicroOssProvider provider;

	public static synchronized void init(Config config) throws SQLException {
		if (inited) {
			return;
		}

		dataSource = DataSources.build(config);
		MicroOssConfig microOssConfig = new MicroOssConfig();
		microOssConfig.setTablePrefix(config.getTablePrefix());
		provider = new MysqlMicroOssProvider(dataSource, microOssConfig);

		inited = true;
	}

	public static MicroOssProvider get() {
		return provider;
	}
}
