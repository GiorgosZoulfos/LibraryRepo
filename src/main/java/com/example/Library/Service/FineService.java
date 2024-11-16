package com.example.Library.Service;

import com.example.Library.Entities.Fine;
import com.example.Library.Repository.FineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FineService {

    private FineRepository fineRepository;

    @Autowired
    public FineService(FineRepository fineRepository){
        this.fineRepository = fineRepository;
    }

    public List<Fine> getAllFines(){
        return fineRepository.findAll();
    }

    public Optional<Fine> getFineById(int fineId){
        return fineRepository.findById(fineId);
    }

    public void saveNewFine(Fine fine){
        fineRepository.save(fine);
    }

    public void updateFineInfo(Fine fine){
        fineRepository.save(fine);
    }

    public void deleteFineById(int fineId){
        fineRepository.deleteById(fineId);
    }


}
