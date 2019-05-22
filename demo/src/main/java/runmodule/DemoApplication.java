package runmodule;

import com.wei.config.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/* 
 * @Description: 通过配置spring.factories达到导入包的同时自动引入该jar包中的bean到spring容器
 * @Author: Awake-Hu 
 * @Date: 2019/5/22 15:22
 */ 
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        System.out.println(context.getBeansOfType(UserConfig.class));
    }

}
