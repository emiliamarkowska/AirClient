package DatabaseModel;

import Consts.TableNames;
import DatabaseModel.TicketsEntity;
import Helpers.IEntity;
import Helpers.SearchParameter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDatabaseContext {
    void addOrEditEntity(TableNames tableName, IEntity entity);

    void removeEntity(TableNames tableName, int entityId);

    IEntity getEntity(TableNames tableName, int entityId);
    JpaRepository getRepository(TableNames tableName);
}
