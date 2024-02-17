package eventmanagement.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "events")
public class Events {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "event_id")
  private long eventId;

  @Column(name = "event_name")
  private String eventName;

  @Column(name = "description")
  private String description;

  @Column(name = "event_start_date")
  private Date eventStartDate;

  @Column(name = "event_end_date")
  private Date eventEndDate;

  @Column(name = "organizer_id")
  private int organizerId;

  @Column(name = "status")
  private String status;

  @Column(name = "total_capacity")
  private int totalCapacity;

  @Column(name = "available_capacity")
  private int availableCapacity;

  @Column(name = "event_fees")
  private int eventFees;

  @Column(name = "event_category")
  private int eventCategory;

  public Events() {
  }

  public Events(String eventName, String description, Date eventStartDate, Date eventEndDate, int organizerId, String status, int totalCapacity, int availableCapacity, int eventFees, int eventCategory) {
    this.eventName = eventName;
    this.description = description;
    this.eventStartDate = eventStartDate;
    this.eventEndDate = eventEndDate;
    this.organizerId = organizerId;
    this.status = status;
    this.totalCapacity = totalCapacity;
    this.availableCapacity = availableCapacity;
    this.eventFees = eventFees;
    this.eventCategory = eventCategory;
  }

  public long getEventId() {
    return eventId;
  }

  public void setEventId(long eventId) {
    this.eventId = eventId;
  }

  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getEventStartDate() {
    return eventStartDate;
  }

  public void setEventStartDate(Date eventStartDate) {
    this.eventStartDate = eventStartDate;
  }

  public Date getEventEndDate() {
    return eventEndDate;
  }

  public void setEventEndDate(Date eventEndDate) {
    this.eventEndDate = eventEndDate;
  }

  public int getOrganizerId() {
    return organizerId;
  }

  public void setOrganizerId(int organizerId) {
    this.organizerId = organizerId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public int getTotalCapacity() {
    return totalCapacity;
  }

  public void setTotalCapacity(int totalCapacity) {
    this.totalCapacity = totalCapacity;
  }

  public int getAvailableCapacity() {
    return availableCapacity;
  }

  public void setAvailableCapacity(int availableCapacity) {
    this.availableCapacity = availableCapacity;
  }

  public int getEventFees() {
    return eventFees;
  }

  public void setEventFees(int eventFees) {
    this.eventFees = eventFees;
  }

  public int getEventCategory() {
    return eventCategory;
  }

  public void setEventCategory(int eventCategory) {
    this.eventCategory = eventCategory;
  }
}
