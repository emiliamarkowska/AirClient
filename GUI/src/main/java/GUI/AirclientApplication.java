package GUI;

import Database.Consts.TableNames;
import Database.DatabaseModel.CountriesEntity;
import Database.DatabaseModel.IDatabaseContext;
import Database.Repositories.ICountriesRepo;
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
@ComponentScan("Database.DatabaseModel")
@EntityScan("Database/DatabaseModel")
@EnableJpaRepositories("Database.Repositories")
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
//		country.setCountryName("Exemplary Country");
//
//		databaseContext.addOrEditEntity(TableNames.Countries, country);
//
//		String name =((CountriesEntity)databaseContext
//				.getEntity(TableNames.Countries, 12)).getCountryName();
//		System.out.println(name);
//
//
//		List<CountriesEntity> countriesWithPo = ((ICountriesRepo)databaseContext
//				.getRepository(TableNames.Countries))
//				.searchWithNameContaining("Po");
//
//		for (CountriesEntity x : countriesWithPo) {
//			System.out.println(x.getCountryName());
//		}
	}

}
