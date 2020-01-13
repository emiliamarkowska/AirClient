package Repositories;

import DatabaseModel.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsersRepo extends JpaRepository<UsersEntity, Long>, IRepository {
}
