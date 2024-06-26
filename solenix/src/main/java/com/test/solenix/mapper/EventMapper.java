package com.test.solenix.mapper;


import com.test.solenix.dto.EventDto;
import com.test.solenix.entity.Event;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventMapper {

    EventDto toDTO(Event event);

    Event toEntity(EventDto eventDto);


    List<EventDto> toDtoList(List<Event> entities);

    List<Event> toEntityList(List<EventDto> eventDtos);

}
