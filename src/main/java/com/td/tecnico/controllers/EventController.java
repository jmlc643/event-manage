package com.td.tecnico.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.td.tecnico.models.Event;
import com.td.tecnico.services.EventService;

import java.util.List;

@RestController
@RequestMapping("event")
public class EventController {
    @Autowired EventService eventService;

    // READ
    @GetMapping("/list/")
    public ResponseEntity<List<Event>> listEvents(@RequestParam Integer page) {
        return ResponseEntity.ok(eventService.listEvents(PageRequest.of(page, 20)));
    }

    @PostMapping("/create/")
    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
        return ResponseEntity.status(HttpStatus.CREATED).body(eventService.createEvent(event));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Event> getEvent(@PathVariable Integer id) {
        return ResponseEntity.ok(eventService.getEvent(id));
    }
}