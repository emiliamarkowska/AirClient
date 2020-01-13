package Repositories;

import DatabaseModel.FlightsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFlightsRepo extends JpaRepository<FlightsEntity, Long>, IRepository {
}
