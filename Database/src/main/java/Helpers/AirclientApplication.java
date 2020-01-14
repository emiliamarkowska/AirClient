package Helpers;

import Consts.TableNames;
import DatabaseModel.CountriesEntity;
import DatabaseModel.IDatabaseContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("DatabaseModel")
@EntityScan("DatabaseModel")
@EnableJpaRepositories("Repositories")
@SpringBootApplication
public class AirclientApplication implements CommandLineRunner {

	@Autowired
	IDatabaseContext databaseContext;

	public static void main(String[] args) {
		SpringApplication.run(AirclientApplication.class, args);
	}

	@Override
	public void run(String... args) {

		CountriesEntity country = new CountriesEntity();
		country.setCountryName("Wojtkolandia");

		databaseContext.addOrEditEntity(TableNames.Countries, country);
	}

}
