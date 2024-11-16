package com.example.Library.Controller;

import com.example.Library.Entities.Fine;
import com.example.Library.Service.FineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
public class FineController {

    private FineService fineService;

    @Autowired
    public FineController(FineService fineService) {
        this.fineService = fineService;
    }

    @GetMapping(path = "/fine")
    public List<Fine> getAllFines(){
        return fineService.getAllFines();
    }

    @GetMapping(path = "/fine/{fineId}")
    public Optional<Fine> getFineById(@PathVariable(name = "fineId") int fineId){
        return fineService.getFineById(fineId);
    }

    @PostMapping(path = "/fine")
    public HttpStatus postNewFine(@RequestBody Fine fine){
        fineService.saveNewFine(fine);
        return HttpStatus.CREATED;
    }

    @DeleteMapping(path = "/fine/{fineId}")
    public HttpStatus deleteFine(@PathVariable(name = "fineId") int fineId){
        fineService.deleteFineById(fineId);
        return HttpStatus.OK;
    }

    @PutMapping(path = "/fine")
    public HttpStatus updateFine(@RequestBody Fine fine){
        fineService.updateFineInfo(fine);
        return HttpStatus.CREATED;
    }

}
