package eventmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import eventmanagement.models.Events;

public interface EventRepo extends JpaRepository<Events, Long> {
}
