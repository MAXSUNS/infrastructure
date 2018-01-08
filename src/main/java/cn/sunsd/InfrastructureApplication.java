package cn.sunsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InfrastructureApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfrastructureApplication.class, args);
	}


//	@Bean
//	public EmbeddedServletContainerFactory servletContainer() {
//		JettyEmbeddedServletContainerFactory factory =
//				new JettyEmbeddedServletContainerFactory();
//		return factory;
//	}

}
