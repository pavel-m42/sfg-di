package guru.springframework.sfgdi;

import guru.springframework.sfgdi.config.ConstructorConfig;
import guru.springframework.sfgdi.config.SfgConfiguration;
import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.services.PrototypeBean;
import guru.springframework.sfgdi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"guru.springframework.sfgdi", "com.springframework.pets"})
@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor" );
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		SingletonBean sb1 = ctx.getBean(SingletonBean.class);
		SingletonBean sb2 = ctx.getBean(SingletonBean.class);
		System.out.println(sb1.getMyScope());
		System.out.println(sb2.getMyScope());

		PrototypeBean pb1 = ctx.getBean(PrototypeBean.class);
		PrototypeBean pb2 = ctx.getBean(PrototypeBean.class);

		System.out.println(pb1.getMyScope());
		System.out.println(pb2.getMyScope());

		FakeDataSource fd = ctx.getBean(FakeDataSource.class);
		System.out.println("Username: " + fd.getUsername());

		SfgConfiguration sc = ctx.getBean(SfgConfiguration.class);
		System.out.println("Username: " + sc.getUsername());

		ConstructorConfig cc = ctx.getBean(ConstructorConfig.class);
		System.out.println("Username: " + cc.getUsername());
	}

}
