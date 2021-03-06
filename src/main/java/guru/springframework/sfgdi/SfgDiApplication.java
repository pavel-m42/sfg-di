package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx= SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18n = ctx.getBean(I18nController.class);
		System.out.println(i18n.sayHello());

		MyController myController = ctx.getBean(MyController.class);
		System.out.println(myController.sayHello());

		PropertyInjectedController myController1 = ctx.getBean(PropertyInjectedController.class);
		System.out.println(myController1.getGreeting());
		SetterInjectedController myController2 = ctx.getBean(SetterInjectedController.class);
		System.out.println(myController2.getGreeting());
		ConstructorInjectedController myController3 = ctx.getBean(ConstructorInjectedController.class);
		System.out.println(myController3.getGreeting());
	}

}
