package com.model.dao;

import com.model.dto.PersonDTO;

import java.util.List;

public interface PersonDAO {
    int insertPerson(PersonDTO person);

    List<PersonDTO> selectAllPerson();


}
