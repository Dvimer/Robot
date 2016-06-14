package ru.javabegin.training.spring.main;


		import javafx.application.Application;
		import org.springframework.beans.factory.annotation.Value;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.context.ApplicationContext;
		import org.springframework.context.ConfigurableApplicationContext;
		import org.springframework.context.support.ClassPathXmlApplicationContext;
		import org.springframework.scheduling.annotation.EnableScheduling;
		import ru.javabegin.training.spring.impls.robot.ModelT1000;

@SpringBootApplication
@EnableScheduling
public class Start {
//	@Value("${stage}")
//	String stage;
//
//	public static void main(String[] args) {
//		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
//		System.out.println("STAGE: " + ctx.getBean(Application.class).stage);
//	}
//
//	public boolean xor(boolean x, boolean y) {
//		return x ^ y;
//	}
//
//	public boolean xnor(boolean x, boolean y) {
//		return !xor(x, y);
//	}
//}


	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
		t1000.action();
		t1000.dance();

		ModelT1000 sony = (ModelT1000) context.getBean("sonyRobot");
		sony.action();
		sony.dance();
	}
}
