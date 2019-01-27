package com.webservice.queue.components;

import com.webservice.queue.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SheduledTask {

    @Autowired
    private ItemService itemService;
    private static  int startTest = 1;
    private static int stopTest = 0;

    @Scheduled(fixedRate = 5000)
    public void demoMethod(){
        stopTest++;
        if (stopTest < 23) {
            itemService.demoMethod(startTest);
            startTest++;
        }
    }
}
