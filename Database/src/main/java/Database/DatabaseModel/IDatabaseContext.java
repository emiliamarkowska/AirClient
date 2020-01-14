package Database.DatabaseModel;

import Database.Consts.TableNames;
import Database.Helpers.IEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDatabaseContext {
    void addOrEditEntity(TableNames tableName, IEntity entity);

    void removeEntity(TableNames tableName, int entityId);

    IEntity getEntity(TableNames tableName, int entityId);

    JpaRepository getRepository(TableNames tableName);
}
