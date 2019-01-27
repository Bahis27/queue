package com.webservice.queue.controllers;
import com.webservice.queue.dto.PredictionDataUserDTO;
import com.webservice.queue.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;
    private static final int CODE_STATUS_IN_QUEUE = 1;

    @RequestMapping(value = "/{departmentCode}/{operationIndex}/{queueNo}", method = RequestMethod.GET)
    public ModelAndView getPredictionDataUserDTO(@PathVariable("departmentCode") int departmentCode,
                                                          @PathVariable("operationIndex") String operationIndex,
                                                          @PathVariable("queueNo") int queueNo) {
        PredictionDataUserDTO dto = itemService.getAllUsersWithDepNumAnd(departmentCode, operationIndex, CODE_STATUS_IN_QUEUE, queueNo);
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("dto", dto);
        return mv;
    }

    @RequestMapping(value = "/feedback")
    public ModelAndView showFeedBack() {
        ModelAndView mv = new ModelAndView("feedback");
        return mv;
    }

}
