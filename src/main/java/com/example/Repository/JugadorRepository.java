package com.example.Repository;

import com.example.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by jhipster on 8/10/15.
 */
public interface JugadorRepository extends PagingAndSortingRepository<Jugador,Long>{

    List<Jugador> findByNombreContaining(String nom); //a
    List<Jugador> findByCanastastGreaterThanEqual(Integer num); //b
    List<Jugador> findByAsistenciastBetween(Integer num1,Integer num2); //c
    List<Jugador> findByPosicionIs(String pos);//d
    List<Jugador> findByFechadenacimientoBefore(Date fecha);//e
    List<Jugador> findByCanastastGreaterThanEqualAndFechadenacimientoBefore(Integer num, Date fecha);

}
