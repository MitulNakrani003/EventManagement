package eventmanagement.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import eventmanagement.models.Events;
import eventmanagement.repository.EventRepo;
import eventmanagement.services.EventService;

@Service
public class EventServiceImpl implements EventService {

  private final EventRepo eventRepo;

  @Autowired
  public EventServiceImpl(EventRepo eventRepo) {
    this.eventRepo = eventRepo;
  }

  @Override
  public List<Events> getAllEvents() {
    return eventRepo.findAll();
  }

  @Override
  public Optional<Events> getEventById(long eventId) {
    return eventRepo.findById(eventId);
  }

  @Override
  public Events createEvent(Events event) {
    return eventRepo.save(event);
  }

  @Override
  public Events updateEvent(Events event) {
    return eventRepo.save(event);
  }

  @Override
  public void deleteEventById(long eventId) {
    eventRepo.deleteById(eventId);
  }
}
