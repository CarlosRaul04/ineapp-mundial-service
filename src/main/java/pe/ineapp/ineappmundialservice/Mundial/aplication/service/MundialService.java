package pe.ineapp.ineappmundialservice.Mundial.aplication.service;

import pe.ineapp.ineappmundialservice.Mundial.infrastructure.request.JugadorRequest;
import pe.ineapp.ineappmundialservice.Mundial.infrastructure.response.*;

public interface MundialService {

    public MundialResponse getAll();

    public PaisResponse getPaises();

    public JugadorResponse getJugadores();

    public EstadioResponse getEstadios();

    public BasicResponse addJugador(JugadorRequest request);

}
