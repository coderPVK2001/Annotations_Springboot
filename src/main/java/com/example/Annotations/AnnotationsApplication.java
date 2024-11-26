package com.example.Annotations;

import com.example.Annotations.conditionalonproperty.ConditionalConfig;
import com.example.Annotations.conditionalonproperty.Property;
import com.example.Annotations.config.PvkConfig2;
import com.example.Annotations.entitylisteners.Items;
import com.example.Annotations.entitylisteners.ItemsRepository;
import com.example.Annotations.propertysource.PropertySourceConfig;
import com.example.Annotations.qualifierservice.MainService;
import com.example.Annotations.qualifierservice.PaymentService;
import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.PropertySource;
import package2.config.PvkConfig;
import com.example.Annotations.service.ConsumerService;
import com.example.Annotations.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@ComponentScan("package2")
//@ComponentScan(basePackages = {"package2","package3"})
//@EnableAutoConfiguration(exclude = MainService.class)
public class AnnotationsApplication implements CommandLineRunner {

	@Autowired
	@Qualifier(value = "debit")
	private PaymentService paymentService;

	@Autowired
	private PropertySourceConfig propertySourceConfig;   //cannot directly call in static method bcoz we need an object of this class as this is non static(private PropertySourceConfig) know

	@Autowired
	private ConditionalConfig config;

	@Autowired
	private ItemsRepository itemsRepository;


	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(AnnotationsApplication.class, args);

//		PvkConfig bean2 = run.getBean(PvkConfig.class);
////		System.out.println(bean2);
////		bean2.pp();
////
////		ProductService bean = run.getBean(ProductService.class);
////		System.out.println(bean);
////		bean.king();
////
////		ConsumerService bean1 = run.getBean(ConsumerService.class);
////		System.out.println(bean1);

		//qualifier ---->
//		MainService bean3 = run.getBean(MainService.class);
//		bean3.test();

	}

	@Override
	public void run(String... args) throws Exception {

//		paymentService.processPayment();

		//PropertySource annotation  --------------->
//		System.out.println("Account sid:- "+propertySourceConfig.getAccountSid());
//		System.out.println("token:-       "+propertySourceConfig.getAuthToken());
//		System.out.println("trial number:-"+propertySourceConfig.getTrialNumber());


		//ConditionalOnProperty annotation ---------->
//		Property pp = config.testingbean();
//		System.out.println(pp);
//		pp.testingproperty();

		//entitylisteners       -------------------->
//		Items i1=new Items();
//		i1.setItemname("mango");
//		i1.setPrice(300);
//		itemsRepository.save(i1);


	}
}
