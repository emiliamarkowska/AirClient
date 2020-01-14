package Repositories;

import DatabaseModel.CountriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepo extends JpaRepository<CountriesEntity, Long>, IRepository {
}
