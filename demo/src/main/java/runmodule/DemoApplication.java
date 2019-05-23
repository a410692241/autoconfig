package runmodule;

import com.google.gson.Gson;
import com.wei.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.OrderUtils;
import runmodule.conditional.bo.Encoding;
import runmodule.conditional.bo.Person;

/*
 * @Description: 通过配置spring.factories达到导入包的同时自动引入该jar包中的bean到spring容器
 * @Author: Awake-Hu
 * @Date: 2019/5/22 15:22
 */
@SpringBootApplication
public class DemoApplication {
    @Autowired
    private Gson gson;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        System.out.println(context.getBean("user"));
        System.out.println("操作系统是:" + context.getEnvironment().getProperty("os.name"));
        System.out.println(context.getBeansOfType(Person.class));
        System.out.println("编码方式为GBK的bean:" + context.getBean("getEncoding"));
    }

}
