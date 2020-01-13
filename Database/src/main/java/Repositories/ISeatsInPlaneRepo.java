package Repositories;

import DatabaseModel.SeatsInPlaneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISeatsInPlaneRepo extends JpaRepository<SeatsInPlaneEntity, Long>, IRepository {
}
