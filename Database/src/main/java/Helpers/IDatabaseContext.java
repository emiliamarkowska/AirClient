package Helpers;

import DatabaseModel.Ticket;

import java.util.List;

public interface IDatabaseContext {
    void addEntity(String tableName, IEntity entity);
    void removeEntity(String tableName, int entityId);
    void editENtity(String tableName, IEntity entity);
    IEntity getEntity(String tableName, int entityId);
    <T> List<IEntity> searchEntities(String tableName, List<SearchParameter<T>> searchParameterList);
    List<Ticket> getUserTickets(int userId);
    boolean establishConnection();
    boolean executeQuery(String query);
}
