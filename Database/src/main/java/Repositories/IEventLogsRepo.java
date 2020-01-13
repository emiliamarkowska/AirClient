package Repositories;

import DatabaseModel.EventsLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventLogsRepo extends JpaRepository<EventsLogEntity, Long>, IRepository {
}
