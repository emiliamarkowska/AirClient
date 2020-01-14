package Helpers;

import Consts.TableNames;
import DatabaseModel.CountriesEntity;
import DatabaseModel.IDatabaseContext;
import Repositories.ICountriesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

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

//		CountriesEntity country = new CountriesEntity();
//		country.setCountryName("Wojtkolandia Powraca z większą miłością!");
//		country.setCountryId(23L);
//
//		databaseContext.addOrEditEntity(TableNames.Countries, country);

		List<CountriesEntity> countriesWithPo = ((ICountriesRepo)databaseContext.getRepository(TableNames.Countries)).searchWithNameContaining("Po");
		for (CountriesEntity x : countriesWithPo) {
			System.out.println(x.getCountryName());
		}
	}

}
