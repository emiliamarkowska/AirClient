package Repositories;

import DatabaseModel.CountriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICountriesRepo extends JpaRepository<CountriesEntity, Long>, IRepository {

    @Query("SELECT country FROM CountriesEntity country  WHERE country.countryName LIKE %:containValue%")
    List<CountriesEntity> searchWithNameContaining(@Param("containValue") String containValue);
}
