package dagong.spring_boot_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration()
public class SpringBootApplicationController {
	
	/*@Value("${book.author}")
	private String bookAuthor;
	@Value("{book.name}")
	private String bookName;*/
	
	
	@RequestMapping("/home")
	String home(){
		/*System.out.println("bookAuthor:"+bookAuthor);
		System.out.println("bookName:"+bookName);*/
		return "Hello World";
	}
	
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootApplicationController.class, args);
	}

}
