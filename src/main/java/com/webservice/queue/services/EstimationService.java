package com.webservice.queue.services;

import com.webservice.queue.dto.EmployeeEstimationDTO;
import com.webservice.queue.models.Estimation;
import com.webservice.queue.repository.EstimationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstimationService {
    @Autowired
    private EstimationRepository estimationRepository;

    public EmployeeEstimationDTO getEmployeeEstimation(int id) {
        EmployeeEstimationDTO dto = new EmployeeEstimationDTO();

        Estimation estimation = estimationRepository.getOne(id);

        dto.setFirstName(estimation.getFirstName());
        dto.setMiddleName(estimation.getMiddleName());
        dto.setLastName(estimation.getLastName());

        int numberGoodEstimation = estimation.getNumberGoodEstimation();
        int numberMiddleEstimation = estimation.getNumberMiddleEstimation();
        int numberBadEstimation = estimation.getNumberBadEstimation();

        double averageEstimation = (double)(numberBadEstimation + numberGoodEstimation + numberMiddleEstimation)/3.0;

        dto.setAverageEstimation(averageEstimation);

        return  dto;
    }

    public void increaseGoodEstimation(int id) {
        Estimation estimation = estimationRepository.getOne(id);
        estimation.setNumberGoodEstimation(estimation.getNumberGoodEstimation() + 1);
        estimationRepository.save(estimation);
    }

    public void increaseMiddleEstimation(int id) {
        Estimation estimation = estimationRepository.getOne(id);
        estimation.setNumberMiddleEstimation(estimation.getNumberMiddleEstimation() + 1);
        estimationRepository.save(estimation);
    }

    public void increaseBadEstimation(int id) {
        Estimation estimation = estimationRepository.getOne(id);
        estimation.setNumberBadEstimation(estimation.getNumberBadEstimation() + 1);
        estimationRepository.save(estimation);
    }
}
