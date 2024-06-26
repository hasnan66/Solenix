package com.test.solenix.service.impl;

import com.test.solenix.dto.EventDto;
import com.test.solenix.entity.Event;
import com.test.solenix.mapper.EventMapper;
import com.test.solenix.repository.EventRepository;
import com.test.solenix.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventMapper eventMapper;

    @Override
    public Event createEvent(EventDto eventDto) {
        Event event = eventMapper.toEntity(eventDto);
        return eventRepository.save(event);
    }

    @Override
    public List<EventDto> getAllEvents() {
        List<Event> entities = eventRepository.findAll();
        return eventMapper.toDtoList(entities);
    }

    @Override
    public List<EventDto> getEventsBySatellite(String satelliteName) {
        List<Event> entities = eventRepository.findBySatelliteName(satelliteName);
        return eventMapper.toDtoList(entities);
    }
}
