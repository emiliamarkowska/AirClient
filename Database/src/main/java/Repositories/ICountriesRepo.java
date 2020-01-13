package Repositories;

import DatabaseModel.CountriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountriesRepo extends JpaRepository<CountriesEntity, Long>, IRepository {
}
