package Helpers;

import Consts.TableNames;
import DatabaseModel.TicketsEntity;
import Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.Repository;

import java.util.List;

@Configuration
@EntityScan(basePackages = "DatabaseModel")
@EnableJpaRepositories(basePackages="Repositories", entityManagerFactoryRef="")
public class DatabaseContext implements IDatabaseContext {

    @Autowired
    private ICountriesRepo countriesRepo;
    @Autowired
    private ICitiesRepo citiesRepo;
    @Autowired
    private IAirportsRepo airportsRepo;
    @Autowired
    private IEventLogsRepo eventLogsRepo;
    @Autowired
    private IFlightsRepo flightsRepo;
    @Autowired
    private ISeatsInPlaneRepo seatsInPlaneRepo;
    @Autowired
    private ITicketsRepo ticketsRepo;
    @Autowired
    private IUsersRepo usersRepo;

    DatabaseContext() {}

    public void addEntity(TableNames tableName, IEntity entity) {

    }

    public void removeEntity(TableNames tableName, int entityId) {

    }

    public void editEntity(TableNames tableName, IEntity entity) {

    }

    public IEntity getEntity(TableNames tableName, int entityId) {
        JpaRepository repo = getRepo(tableName);
        return (IEntity)repo.findById(entityId).get();
    }

    public <T> List<IEntity> searchEntities(TableNames tableName, List<SearchParameter<T>> searchParameters) {
        return null;
    }

    public List<TicketsEntity> getUserTickets(int userId) {
        return null;
    }

    public boolean establishConnection() {
        return false;
    }

    public boolean executeQuery(String query) {
        return false;
    }

    private JpaRepository getRepo(TableNames tableName) {
        switch(tableName) {
            case Airports:
                return airportsRepo;
            case Users:
                return usersRepo;
            case Cities:
                return citiesRepo;
            case Flights:
                return flightsRepo;
            case Tickets:
                return ticketsRepo;
            case Countries:
                return countriesRepo;
            case EventLogs:
                return eventLogsRepo;
            case SeatsInPlane:
                return seatsInPlaneRepo;
            default:
                return usersRepo;

        }
    }
}
