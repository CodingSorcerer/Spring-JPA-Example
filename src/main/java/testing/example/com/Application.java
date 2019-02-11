package testing.example.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "net.lonewolfcode.opensource.springutilities")
public class Application
{
    public static void main(String[] Args)
    {
        SpringApplication.run(Application.class,Args);
    }
}
