package hu.me.iit.szakdolgozat.Controller;

import hu.me.iit.szakdolgozat.Service.SzakdolgozatService;
import hu.me.iit.szakdolgozat.Service.SzakdolgozatServiceDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/szakdolgozat")
public class Controller {
    private final SzakdolgozatService szakdolgozatService;

    public Controller(SzakdolgozatService szakdolgozatService) {
        this.szakdolgozatService = szakdolgozatService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ControllerDTO createSzakdolgozat(@RequestBody @Valid CreateSzakdolgozatDTO createSzakdolgozatDTO){
        return new ControllerDTO(szakdolgozatService.createSzakdolgozat(createSzakdolgozatDTO.toService()));
    }

    @GetMapping
    public List<ControllerDTO> findAllSzakdolgozat(){
        List<ControllerDTO> szakdolgozatLista=new ArrayList<>();
        for(SzakdolgozatServiceDTO szakdolgozatServiceDTO : szakdolgozatService.findAllSzakdolgozat()){
            szakdolgozatLista.add(new ControllerDTO(szakdolgozatServiceDTO));
        }
        return szakdolgozatLista;
    }

    @DeleteMapping("/{id}")
    public void deleteByIdSzakdolgozat(@PathVariable Long id){
        szakdolgozatService.deleteByIdSzakdolgozat(id);
    }

    @PutMapping
    public void updateSzakdolgozat(@RequestBody @Valid ControllerDTO controllerDTO){
        szakdolgozatService.updateSzakdolgozat(controllerDTO.toService());
    }

    @GetMapping("/cimek")
    public List<ControllerDTO> findByCimEquals(@RequestParam String cim){
        List<ControllerDTO> szakdolgozatlista=new ArrayList<>();
        for(SzakdolgozatServiceDTO szakdolgozatServiceDTO : szakdolgozatService.findByCimEquals(cim)){
            szakdolgozatlista.add(new ControllerDTO(szakdolgozatServiceDTO));
        }
        return szakdolgozatlista;
    }

}
