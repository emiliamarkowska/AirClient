package Helpers;

import Consts.TableNames;
import DatabaseModel.TicketsEntity;

import java.util.List;

public interface IDatabaseContext {
    void addEntity(TableNames tableName, IEntity entity);
    void removeEntity(TableNames tableName, int entityId);
    void editEntity(TableNames tableName, IEntity entity);
    IEntity getEntity(TableNames tableName, int entityId);
    <T> List<IEntity> searchEntities(TableNames tableName, List<SearchParameter<T>> searchParameterList);
    List<TicketsEntity> getUserTickets(int userId);
    boolean establishConnection();
    boolean executeQuery(String query);
}
