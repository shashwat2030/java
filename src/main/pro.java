import org.springframework.boot;
import org.springframework.boot.autoconfig.";
import org.springframework.sterotype.*;
import org.springframework.web.bind.annotation;


@RestController
@EnableAutoConfiguration
public class EducaExample
{
@Request Mapping("/")
String sayHello()
{
return "helo";
}
 

