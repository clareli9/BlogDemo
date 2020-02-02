package com.clareli.demo.service;

import com.clareli.demo.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeService {

    // Add
    Type saveType(Type type);

    // Search
    Type getType(Long id);

    Type getTypeByName(String name);

    // Page search
    Page<Type> listType(Pageable pageable);

    List<Type> listType();

    // Update/Modify
    Type updateType(Long id, Type type);

    // Delete
    void deleteType(Long id);
}
