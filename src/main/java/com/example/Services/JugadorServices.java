package com.example.Services;

import com.example.Model.Jugador;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by jhipster on 8/10/15.
 */
@Service
@Transactional
public class JugadorServices {


    @Autowired
    private JugadorRepository jugadorRepository;



    public void addJugador(){

        Calendar date = GregorianCalendar.getInstance();
        date.set(1980, 9, 13);

        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Diego");
        jugador1.setFechadenacimiento(date.getTime());
        jugador1.setCanastast(8);
        jugador1.setAsistenciast(10);
        jugador1.setRebotest(7);
        jugador1.setPosicion("Pivot");
        jugadorRepository.save(jugador1);

        date.set(1990, 5, 2);

        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Natan");
        jugador2.setFechadenacimiento(date.getTime());
        jugador2.setCanastast(11);
        jugador2.setAsistenciast(4);
        jugador2.setRebotest(6);
        jugador2.setPosicion("Alero");
        jugadorRepository.save(jugador2);

        date.set(1984, 7, 8);

        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Victor");
        jugador3.setFechadenacimiento(date.getTime());
        jugador3.setCanastast(4);
        jugador3.setAsistenciast(1);
        jugador3.setRebotest(9);
        jugador3.setPosicion("Base");
        jugadorRepository.save(jugador3);

        date.set(1988, 11, 11);

        Jugador jugador4 = new Jugador();
        jugador4.setNombre("Huto");
        jugador4.setFechadenacimiento(date.getTime());
        jugador4.setCanastast(9);
        jugador4.setAsistenciast(10);
        jugador4.setRebotest(1);
        jugador4.setPosicion("Pivot");
        jugadorRepository.save(jugador4);

        date.set(1991, 12, 5);

        Jugador jugador5 = new Jugador();
        jugador5.setNombre("Jaime");
        jugador5.setFechadenacimiento(date.getTime());
        jugador5.setCanastast(13);
        jugador5.setAsistenciast(6);
        jugador5.setRebotest(5);
        jugador5.setPosicion("Alero");
        jugadorRepository.save(jugador5);

        System.out.println("A ");
        System.out.println(jugadorRepository.findByNombreContaining("ie")); //a
        System.out.println("B");
        System.out.println(jugadorRepository.findByCanastastGreaterThanEqual(10));//b
        System.out.println("C");
        System.out.println(jugadorRepository.findByAsistenciastBetween(5, 10));//c
        System.out.println("D");
        System.out.println(jugadorRepository.findByPosicionIs("Base"));//d
        date.set(1990, 1, 1);
        System.out.println("E");
        System.out.println(jugadorRepository.findByFechadenacimientoBefore(date.getTime()));//e
        System.out.println("F");
        System.out.println(jugadorRepository.findByCanastastGreaterThanEqualAndFechadenacimientoBefore(10, date.getTime()));//f



    }

}
