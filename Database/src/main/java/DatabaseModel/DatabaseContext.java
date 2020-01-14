package DatabaseModel;

import Consts.TableNames;
import Helpers.IEntity;
import Helpers.SearchParameter;
import Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabaseContext implements IDatabaseContext {

    @Autowired
    private CountriesRepo countriesRepo;
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

    public void addOrEditEntity(TableNames tableName, IEntity entity) {
        JpaRepository repo = getRepo(tableName);
        repo.save(entity);
    }

    public void removeEntity(TableNames tableName, int entityId) {
        JpaRepository repository = getRepo(tableName);
        repository.deleteById((long)entityId);
    }

    public IEntity getEntity(TableNames tableName, int entityId) {
        JpaRepository repo = getRepo(tableName);
        return (IEntity)repo.findById((long) entityId).get();
    }

    public <T> List<IEntity> searchEntities(TableNames tableName, List<SearchParameter<T>> searchParameters) {
//        JpaRepository repository = getRepo(tableName);
//        repository.findAll();
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
