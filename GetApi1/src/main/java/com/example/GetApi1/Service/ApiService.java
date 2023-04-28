package com.example.GetApi1.Service;

import com.example.GetApi1.Entity.ApiEntity;
import com.example.GetApi1.Repository.ApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {

    @Autowired
    ApiRepository apiRepository;



    public  List<ApiEntity> getEmployerData()
    {
        return apiRepository.findAll();
    }
}
