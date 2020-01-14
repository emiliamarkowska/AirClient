package DatabaseModel;

import Consts.TableNames;
import DatabaseModel.TicketsEntity;
import Helpers.IEntity;
import Helpers.SearchParameter;

import java.util.List;

public interface IDatabaseContext {
    void addOrEditEntity(TableNames tableName, IEntity entity);
    void removeEntity(TableNames tableName, int entityId);
    IEntity getEntity(TableNames tableName, int entityId);
    <T> List<IEntity> searchEntities(TableNames tableName, List<SearchParameter<T>> searchParameterList);
    List<TicketsEntity> getUserTickets(int userId);
    boolean executeQuery(String query);
}
