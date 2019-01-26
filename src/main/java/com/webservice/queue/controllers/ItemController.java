package com.webservice.queue.controllers;

import com.webservice.queue.dto.PredictionDataUserDTO;
import com.webservice.queue.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;
    private static final int CODE_STATUS_IN_QUEUE = 1;

    @RequestMapping(value = "/dep={departmentCode}&op={operationIndex}&n={queueNo}", method = RequestMethod.GET)
    public PredictionDataUserDTO getPredictionDataUserDTO(@PathVariable("departmentCode") int departmentCode,
                                                          @PathVariable("operationIndex") String operationIndex,
                                                          @PathVariable("queueNo") int queueNo) {
        return itemService.getAllUsersWithDepNumAnd(departmentCode, operationIndex, CODE_STATUS_IN_QUEUE, queueNo);
    }

}
