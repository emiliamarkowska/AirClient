package DatabaseModel;

import Consts.TableNames;
import Helpers.IEntity;
import Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
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

    public void addOrEditEntity(TableNames tableName, IEntity entity) {
        JpaRepository repo = getRepository(tableName);
        repo.save(entity);
    }

    public void removeEntity(TableNames tableName, int entityId) {
        JpaRepository repository = getRepository(tableName);
        repository.deleteById((long)entityId);
    }

    public IEntity getEntity(TableNames tableName, int entityId) {
        JpaRepository repo = getRepository(tableName);
        return (IEntity)repo.findById((long) entityId).get();
    }

    public JpaRepository getRepository(TableNames tableName) {
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
