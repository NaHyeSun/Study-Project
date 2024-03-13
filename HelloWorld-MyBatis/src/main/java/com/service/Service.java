package com.service;

import com.common.Template;
import com.model.dao.PersonDAO;
import com.model.dao.RideDAO;
import com.model.dto.PersonDTO;
import com.model.dto.RideDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.common.Template.getSqlSession;

public class Service {
    private PersonDAO personDAO;
    private RideDAO rideDAO;
    public boolean insertPerson(PersonDTO person) {

        SqlSession sqlSession = getSqlSession();
        personDAO = sqlSession.getMapper(PersonDAO.class);

        int result = personDAO.insertPerson(person);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }

    public List<PersonDTO> selectAllPerson() {

        SqlSession sqlSession = getSqlSession();
        personDAO = sqlSession.getMapper(PersonDAO.class);
        List<PersonDTO> personList = personDAO.selectAllPerson();

        sqlSession.close();

        return personList;
    }

    public boolean lineUpRide(RideDTO ride) {

        SqlSession sqlSession = getSqlSession();

        rideDAO = sqlSession.getMapper(RideDAO.class);
        int result = rideDAO.lineUpRide(ride);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true :false;
    }
}
