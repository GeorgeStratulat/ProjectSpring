package project.models;

import org.springframework.data.repository.CrudRepository;
import project.models.Event;

import java.util.*;

/**
 * Created by George Stratulat on 14/05/2018.
 */
public interface EventRepository extends CrudRepository<Event, Long> {
    List<Event> findAll();
    Event save(Event event);
    void delete(Event event);



    @org.springframework.data.jpa.repository.Query("select b from Event b " +
            "where b.start between ?1 and ?2 and b.end between ?1 and ?2")
    List<Event> findByDatesBetween(java.util.Date start, java.util.Date end);
}