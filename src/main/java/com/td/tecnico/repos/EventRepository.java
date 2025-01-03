package com.td.tecnico.repos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.td.tecnico.models.Event;

import java.util.Date;
import java.util.Optional;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    Page<Event> findAll(Pageable pageable);
    Optional<List<Event>> findByTitleOrEventDate(String title, Date eventDate, Pageable pageable);
}