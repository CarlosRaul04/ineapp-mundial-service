package pe.ineapp.ineappmundialservice.Mundial.aplication.service;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.ineapp.ineappmundialservice.Mundial.domain.entity.Estadio;
import pe.ineapp.ineappmundialservice.Mundial.domain.entity.Jugador;
import pe.ineapp.ineappmundialservice.Mundial.domain.entity.Pais;
import pe.ineapp.ineappmundialservice.Mundial.infrastructure.repository.EstadioRepository;
import pe.ineapp.ineappmundialservice.Mundial.infrastructure.repository.JugadorRepository;
import pe.ineapp.ineappmundialservice.Mundial.infrastructure.repository.PaisRepository;
import pe.ineapp.ineappmundialservice.Mundial.infrastructure.request.JugadorRequest;
import pe.ineapp.ineappmundialservice.Mundial.infrastructure.response.*;

import java.util.List;

@Log4j2
@Service
public class MundialServiceImpl implements MundialService {
    @Autowired
    private EstadioRepository estadioRepository;
    @Autowired
    private PaisRepository paisRepository;
    @Autowired
    private JugadorRepository jugadorRepository;

    @Override
    public MundialResponse getAll() {
        List<Pais> paisList = paisRepository.findAll();
        List<Jugador> jugadorList = jugadorRepository.findAll();
        List<Estadio>  estadioList = estadioRepository.findAll();

        if (paisList.isEmpty() && jugadorList.isEmpty() && estadioList.isEmpty()) {
            return MundialResponse.builder()
                    .Paises(null)
                    .Jugadores(null)
                    .Estadios(null)
                    .basicResponse(BasicResponse.whenNoDataFound("Paises"))
                    .build();
        }
        return MundialResponse.builder()
                .Paises(paisList)
                .Jugadores(jugadorList)
                .Estadios(estadioList)
                .basicResponse(BasicResponse.whenSuccess())
                .build();

    }

    @Override
    public PaisResponse getPaises() {
        List<Pais> paisList = paisRepository.findAll();

        if (paisList.isEmpty()) {
            return PaisResponse.builder()
                    .Paises(null)
                    .basicResponse(BasicResponse.whenNoDataFound("Jugadores"))
                    .build();
        }
        return PaisResponse.builder()
                .Paises(paisList)
                .basicResponse(BasicResponse.whenSuccess())
                .build();

    }

    @Override
    public JugadorResponse getJugadores() {
        List<Jugador> jugadorList = jugadorRepository.findAll();

        if (jugadorList.isEmpty()) {
            return JugadorResponse.builder()
                    .Jugadores(null)
                    .basicResponse(BasicResponse.whenNoDataFound("Jugadores"))
                    .build();
        }
        return JugadorResponse.builder()
                .Jugadores(jugadorList)
                .basicResponse(BasicResponse.whenSuccess())
                .build();


    }

    @Override
    public EstadioResponse getEstadios() {

        List<Estadio> estadioList = estadioRepository.findAll();

        if (estadioList.isEmpty()) {
            return EstadioResponse.builder()
                    .Estadios(null)
                    .basicResponse(BasicResponse.whenNoDataFound("Estadios"))
                    .build();
        }
        return EstadioResponse.builder()
                .Estadios(estadioList)
                .basicResponse(BasicResponse.whenSuccess())
                .build();


    }

    @Override
    public BasicResponse addJugador(JugadorRequest request) {
        try {

            jugadorRepository.save(this.buildJugadorFromRequest(request));
            return BasicResponse.whenSuccess();

        }catch (Exception ex){
            return BasicResponse.whenError(ex.getMessage());
        }
    }


    public Jugador buildJugadorFromRequest(JugadorRequest request){

        return Jugador.builder()
                .jugador(request.getJugador())
                .pais(request.getPais())
                .edad(request.getEdad())
                .build();

    }


}
