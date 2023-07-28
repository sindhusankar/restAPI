package appmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import catalog.CatalogItem;

@SpringBootApplication
public class Appilcation {
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext context
		=new AnnotationConfigApplicationContext(CatalogItemConfig.class);
		SpringApplication.run(Application.class, args);
		CatalogItem catalog
		=context.getBean("serviceBean",CatalogItem.class);
		catalog.test();
	}

}
