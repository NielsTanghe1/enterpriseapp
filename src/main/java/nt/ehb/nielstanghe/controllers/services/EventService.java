package nt.ehb.nielstanghe.controllers.services;

import nt.ehb.nielstanghe.models.Event;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventService {
        List<Event> listAllEvents();
}
