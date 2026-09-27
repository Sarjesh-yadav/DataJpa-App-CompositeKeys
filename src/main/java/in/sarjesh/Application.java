package in.sarjesh;

import in.sarjesh.entity.Account;
import in.sarjesh.service.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
     ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		AccountService accountService = context.getBean(AccountService.class);

		 accountService.saveData();

		//accountService.getDataUsingPK();
		context.close();


	}

}
