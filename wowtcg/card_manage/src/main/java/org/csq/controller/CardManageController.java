package org.csq.controller;

import org.csq.entity.Result;
import org.csq.entity.Version;
import org.csq.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/card")
public class CardManageController {

    @Autowired
    private VersionService versionService;

    @GetMapping("/detail")
    public Result getCardDetail(){
        List<Version> list = versionService.test();
        return new Result().back(200,"success",true,list);
    }
}
