package runmodule;

import com.wei.config.UserConfig;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import runmodule.conditional.bo.Encoding;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import javax.naming.Name;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Resource(name = "user")
    private UserConfig userConfig;

    @Test
    public void contextLoads() {
        System.out.println(userConfig);
    }

}
