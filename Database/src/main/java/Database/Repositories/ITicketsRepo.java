package Database.Repositories;

import Database.DatabaseModel.TicketsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITicketsRepo extends JpaRepository<TicketsEntity, Long>, IRepository {
}
