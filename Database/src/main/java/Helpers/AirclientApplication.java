package Helpers;

import Consts.TableNames;
import DatabaseModel.CountriesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "DatabaseModel")
@SpringBootApplication
public class AirclientApplication implements CommandLineRunner {

	@Autowired
	DatabaseContext databaseContext;

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SpringApplication.run(AirclientApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("tekst");
		IEntity ent = databaseContext.getEntity(TableNames.Countries, 12);
		System.out.println(((CountriesEntity)ent).getCountryName());
	}

}
