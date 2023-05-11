package com.example.March8Spring;//gradle-custom build tool
// - Gradle is a build automation tool for multi-language software development.
// It controls the development process in the tasks of compilation and packaging to testing, deployment, and publishing.
// Supported languages include Java, C/C++, and JavaScript.
//snapshot-use in development /stable
//when deploy change in version like release
//starter dependencies -
//web dependencies - restful app,apache tomcat default/embedded project/dependencies/
//  spring boot - avoid manual configuration
//mavenCentral- third party
//application properties-db connection configuration
//http - protocol
//ioc-inversion of control - create object manage and destroy  its a component
//di-dependency injection -  class a object inject in class b
//type 3 -1.
//single design pattern
//factory design pattern
//Spring container is a predefined programs it basically minus object life cycle and add dependency injection with that we have ready to use objects
//ApplicationContext - it represent ioc container
//3 types implementation of ApplicationContext   1.AnnotationConfigApplicationContext - it search bean
//				           						2.FileSystemXMLApplicationContext - it search configFile in FileSystem
//						   						3.ClasspathXMLApplicationContext - it search XMLApplication in Classpath

//scope
//singleton- object created in only once same as static
//prototype -
//di types
//1.@Autowired
//2.
//3.
//						               JPA(interface)

//Hibernate    framework             Ibatis  framework                       Mybatis framework










import com.example.March8Spring.di.Student1;
import com.example.March8Spring.ioc.Jio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class March8SpringApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(March8SpringApplication.class, args);

		Student1 st = context.getBean(Student1.class);
		st.callSubject();
		Student1 st1 = context.getBean(Student1.class);
		st1.callSubject();
		Jio jio = context.getBean(Jio.class);
		jio.calling();
		jio.msg();
	}
	@GetMapping("hii")
	public String msg(){
		return "hello";
	}

}
