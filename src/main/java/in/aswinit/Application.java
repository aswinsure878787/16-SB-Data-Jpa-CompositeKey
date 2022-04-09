package in.aswinit;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.aswinit.entity.Account;
import in.aswinit.entity.AccountPK;
import in.aswinit.repository.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		AccountRepository repository=context.getBean(AccountRepository.class);
		/*Account obj=new Account();
		obj.setAccId(12);
		obj.setHolderName("def");
		obj.setAccType("savings");
		obj.setBranchName("hyd");
		obj.setMinBal(5000.0);
		repository.save(obj);*/
		/*Iterable<Account> obj=repository.findAll();
		obj.forEach(a->System.out.println(a));*/
		AccountPK obj=new AccountPK();
		obj.setAccId(11);
		obj.setHolderName("abc");
		obj.setAccType("savings");
		Optional<Account> findById=repository.findById(obj);
		if(findById.isPresent())
		{
			Account userEntity=findById.get();
			System.out.println(userEntity);
		}
	}
}