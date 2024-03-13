package com.service;

import com.common.Template;
import com.model.dao.PersonDAO;
import com.model.dao.RideDAO;
import com.model.dao.TicketDAO;
import com.model.dto.PersonDTO;
import com.model.dto.RideDTO;
import com.model.dto.TicketDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Service {
    private PersonDAO personDAO;
    private RideDAO rideDAO;
    private TicketDAO ticketDAO;
    public boolean insertPerson(PersonDTO person) {

        SqlSession sqlSession = Template.getSqlSession();
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

        SqlSession sqlSession = Template.getSqlSession();
        personDAO = sqlSession.getMapper(PersonDAO.class);
        List<PersonDTO> personList = personDAO.selectAllPerson();

        sqlSession.close();

        return personList;
    }

    public boolean lineUpRide(RideDTO rideDTO) {

        SqlSession sqlSession = Template.getSqlSession();
        rideDAO = sqlSession.getMapper(RideDAO.class);

        int result = rideDAO.lineUpRide(rideDTO);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }

    public boolean changeWaitingTime(RideDTO rideDTO) {

        SqlSession sqlSession = Template.getSqlSession();
        rideDAO = sqlSession.getMapper(RideDAO.class);

        int result = rideDAO.changeWaitingTime(rideDTO);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }

    public List<RideDTO> selectAllRide() {

        SqlSession sqlSession = Template.getSqlSession();
        rideDAO = sqlSession.getMapper(RideDAO.class);

        List<RideDTO> rideList = rideDAO.selectAllRide();
        sqlSession.close();

        return rideList;
    }

    public boolean goHomePerson(PersonDTO personDTO) {

        SqlSession sqlSession = Template.getSqlSession();
        personDAO = sqlSession.getMapper(PersonDAO.class);

        int result = personDAO.goHomePerson(personDTO);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0? true : false;
    }

    public List<TicketDTO> selectAllTicket() {
        SqlSession sqlSession = Template.getSqlSession();
        ticketDAO = sqlSession.getMapper(TicketDAO.class);
        List<TicketDTO> ticketList = ticketDAO.selectAllTicket();

        sqlSession.close();

        return ticketList;
    }
}
