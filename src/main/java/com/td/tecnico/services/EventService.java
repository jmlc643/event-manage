package com.td.tecnico.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.td.tecnico.repos.EventRepository;

import java.util.List;
import java.util.Date;

import com.td.tecnico.models.Event;
import com.td.tecnico.exceptions.ResourceNotExistsException;

@Service
public class EventService {
    @Autowired private EventRepository eventRepository;

    // READ
    public List<Event> listEvents(Pageable pageable) {
        return eventRepository.findAll(pageable).getContent();
    }

    // Get Event By Title Or Date
    public List<Event> getEventByTitleOrDate(String title, Date eventDate, Pageable pageable) {
        return eventRepository.findByTitleOrEventDate(title, eventDate, pageable).orElseThrow(() -> new ResourceNotExistsException("No se encuentra eventos con esas características"));
    }

    // CREATE
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    // UPDATE
    public Event updateEvent(Event event) {
        return eventRepository.save(event);
    }

    // DELETE
    public void deleteEvent(Integer id) {
        eventRepository.deleteById(id);
    }

    // Get EVent
    public Event getEvent(Integer id) {
        return eventRepository.findById(id).orElseThrow(() -> new ResourceNotExistsException("Event not found"));
    }
}