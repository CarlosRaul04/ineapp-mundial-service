package pe.ineapp.ineappmundialservice.Mundial.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.ineapp.ineappmundialservice.Mundial.aplication.service.MundialService;
import pe.ineapp.ineappmundialservice.Mundial.infrastructure.request.JugadorRequest;
import pe.ineapp.ineappmundialservice.Mundial.infrastructure.response.*;

@RestController
@RequestMapping ("/v1")
public class MundialController {

    @Autowired
    private MundialService mundialService;



    @GetMapping
    @RequestMapping("/mundial")
    public MundialResponse getAll(){
        return mundialService.getAll();
    }

    @GetMapping
    @RequestMapping("/mundial/paises")
    public PaisResponse getPaises(){
        return mundialService.getPaises();
    }

    @GetMapping
    @RequestMapping("/mundial/jugadores")
    public JugadorResponse getJugadores(){
        return mundialService.getJugadores();
    }

    @GetMapping
    @RequestMapping("/mundial/estadios")
    public EstadioResponse getEstadios(){
        return mundialService.getEstadios();
    }

    @PostMapping
    @RequestMapping("/mundial/jugadores/add")
    public ResponseEntity<BasicResponse> addJugador(@RequestBody JugadorRequest request) {
        BasicResponse response = mundialService.addJugador(request);
        return ResponseEntity.status(response.getCode()).body(response);
    }

}
