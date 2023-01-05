package com.todoapp.TodoApp.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    @Mappings({
            @Mapping(source = "", target = "")
    })
}
