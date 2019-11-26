package module_micro_api_helloworld;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Config {
	private static final Logger log = LoggerFactory.getLogger(Config.class);

	private static final String property_key_jdbc_url = "module_micro_api_helloworld.jdbc_url";
	private static final String property_key_jdbc_user = "module_micro_api_helloworld.jdbc_user";
	private static final String property_key_jdbc_password = "module_micro_api_helloworld.jdbc_password";
	private static final String property_key_table_prefix = "module_micro_api_helloworld.table_prefix";

	private String jdbcUrl;
	private String jdbcUser;
	private String jdbcPassword;
	private String tablePrefix;

	public synchronized static Config load(BundleContext context) {
		Config config = new Config();

		String jdbcUrl = context.getProperty(property_key_jdbc_url);
		log.info("BundleContext Property {} = {}", property_key_jdbc_url, jdbcUrl);
		config.setJdbcUrl(jdbcUrl);

		String jdbcUser = context.getProperty(property_key_jdbc_user);
		log.info("BundleContext Property {} = {}", property_key_jdbc_user, jdbcUser);
		config.setJdbcUser(jdbcUser);

		String jdbcPassword = context.getProperty(property_key_jdbc_password);
		log.info("BundleContext Property {} = {}", property_key_jdbc_password, jdbcPassword);
		config.setJdbcPassword(jdbcPassword);

		String tablePrefix = context.getProperty(property_key_table_prefix);
		log.info("BundleContext Property {} = {}", property_key_table_prefix, tablePrefix);
		config.setTablePrefix(tablePrefix);

		return config;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public String getJdbcUser() {
		return jdbcUser;
	}

	public void setJdbcUser(String jdbcUser) {
		this.jdbcUser = jdbcUser;
	}

	public String getJdbcPassword() {
		return jdbcPassword;
	}

	public void setJdbcPassword(String jdbcPassword) {
		this.jdbcPassword = jdbcPassword;
	}

	public String getTablePrefix() {
		return tablePrefix;
	}

	public void setTablePrefix(String tablePrefix) {
		this.tablePrefix = tablePrefix;
	}

}
