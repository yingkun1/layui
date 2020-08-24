package online.luffyk.springboot24restfulcrud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("online.luffyk.springboot24restfulcrud.dao")
@SpringBootApplication
public class Springboot24restfulcrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot24restfulcrudApplication.class, args);
    }

}
