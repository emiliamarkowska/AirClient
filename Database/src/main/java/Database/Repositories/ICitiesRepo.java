package Database.Repositories;

import Database.DatabaseModel.CitiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICitiesRepo extends JpaRepository<CitiesEntity, Long>, IRepository {
}
