import org.springframework.context.support.GenericXmlApplicationContext;

import com.pk.controller.SampleController;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = 
			new GenericXmlApplicationContext(
				"classpath:applicationContext.xml");
		
		SampleController controller = 
			context.getBean(SampleController.class);
		System.out.println(controller.test());
		
		context.close();

	}

}
