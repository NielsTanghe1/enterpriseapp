package nt.ehb.nielstanghe.models.DAOs;

import nt.ehb.nielstanghe.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface EventDAO extends CrudRepository<Event, Integer> {


}
