package eventmanagement.services;

import java.util.List;
import java.util.Optional;

import eventmanagement.models.Events;

public interface EventService {
  List<Events> getAllEvents();
  Optional<Events> getEventById(long eventId);
  Events createEvent(Events event);
  Events updateEvent(Events event);
  void deleteEventById(long eventId);
}
