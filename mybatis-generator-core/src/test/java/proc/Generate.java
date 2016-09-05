package proc;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class Generate {
	private static final Logger logger = Logger.getLogger(Generate.class);

	public static void main(String[] args) {
		Generate test = new Generate();
		test.main1("generateConfiguration.xml");
	}

	public void main1(String fileName) {
		try {
			List<String> warnings = new ArrayList<String>();
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp
					.parseConfiguration(this.getClass().getClassLoader().getResourceAsStream(fileName));

			DefaultShellCallback shellCallback = new DefaultShellCallback(true);

			MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
			myBatisGenerator.generate(null);
		} catch (Exception e) {
			logger.error("Exception:", e);
		}
	}

}
