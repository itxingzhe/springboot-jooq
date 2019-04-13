package cn.personal.jooq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ServletComponentScan
@ImportResource(locations = { "classpath:druid-bean.xml" })
public class SpringbootJooqApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootJooqApplication.class, args);
  }

}
