package Repositories;

import DatabaseModel.AirportsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAirportsRepo extends JpaRepository<AirportsEntity, Long>, IRepository {
}
