package eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import eventmanagement.models.Events;
import eventmanagement.services.EventService;

@RestController
@RequestMapping("/events")
public class EventController {

  private final EventService eventService;

  @Autowired
  public EventController(EventService eventService) {
    this.eventService = eventService;
  }

  @GetMapping
  public List<Events> getAllEvents() {
    return eventService.getAllEvents();
  }

  @GetMapping("/{id}")
  public Optional<Events> getEventById(@PathVariable("id") long eventId) {
    return eventService.getEventById(eventId);
  }

  @PostMapping
  public Events addEvent(@RequestBody Events event) {
    return eventService.createEvent(event);
  }

  @PutMapping
  public Events updateEvent(@RequestBody Events event) {
    return eventService.updateEvent(event);
  }

  @DeleteMapping("/{id}")
  public void deleteEventById(@PathVariable("id") long eventId) {
    eventService.deleteEventById(eventId);
  }

}
