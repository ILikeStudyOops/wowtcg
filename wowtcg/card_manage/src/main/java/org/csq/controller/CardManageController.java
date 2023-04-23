package org.csq.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.csq.entity.Result;
import org.csq.entity.Version;
import org.csq.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "卡牌管理")
@RestController
@RequestMapping("/card")
public class CardManageController {

    @Autowired
    private VersionService versionService;

    @ApiOperation("获取卡牌版本列表")
    @GetMapping("/versionList")
    public Result getCardDetail(){
        List<Version> list = versionService.test();
        return new Result().back(200,"success",true,list);
    }
}
