package com.webservice.queue.services;

import com.webservice.queue.dto.PredictionDataUserDTO;
import com.webservice.queue.models.Item;
import com.webservice.queue.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public PredictionDataUserDTO getAllUsersWithDepNumAnd(int departmentCode, String operationIndex, int codeStatus, int queueNo) {
        PredictionDataUserDTO dataUserDTO = new PredictionDataUserDTO();

        List<Item> items = itemRepository
                .findByDepartmentCodeAndOperationIndexAndCodeStatusOrderByQueueNo(departmentCode, operationIndex, codeStatus);
        Item itemWithSpecQueueNumber = items
                .stream()
                .filter(s -> s.getQueueNo() == queueNo)
                .findFirst().get();

        //404

        dataUserDTO.setInFront(items
                .stream()
                .filter(s-> s.getQueueNo() < queueNo)
                .collect(Collectors.toList()).size());
        dataUserDTO.setJoinTime(itemWithSpecQueueNumber.getJoinTime());
        dataUserDTO.setAverageTime(itemWithSpecQueueNumber.getAverageTimeout().getAverageTime());
        dataUserDTO.setTalonCode(itemWithSpecQueueNumber.getOperationIndex());
        dataUserDTO.setTalonNumber(itemWithSpecQueueNumber.getQueueNo());

        return dataUserDTO;
    }
}
