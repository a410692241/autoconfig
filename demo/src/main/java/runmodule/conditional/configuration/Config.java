package runmodule.conditional.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import runmodule.conditional.LinuxConditional;
import runmodule.conditional.WindowsConditional;
import runmodule.conditional.bo.Person;

@Configuration

public class Config {
    @Conditional({WindowsConditional.class})
    @Bean(name = "hu")
    public Person getPerson1() {
        return new Person("hu",1);
    }

    @Conditional({LinuxConditional.class})
    @Bean(name = "wei")
    public Person getPerson2() {
        return new Person("wei",2);
    }
}
