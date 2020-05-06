import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;



public class Test {

	
	public static void main(String[] args) {

		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		JdbcTemplate template=(JdbcTemplate) context.getBean("jdbcTemplate");
		
		String query="SELECT * FROM EMPLOYEE WHERE EMPID=?";
		
		Map result=template.queryForMap(query,new Object[]{"11"});
		
		System.out.println(result.toString());
		
	}

}
