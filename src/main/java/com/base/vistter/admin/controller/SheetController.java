package com.base.vistter.admin.controller;

import com.base.vistter.admin.service.SheetService;
import com.base.vistter.common.bean.Result;
import org.apache.commons.collections.MapUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sheet")
public class SheetController {

    private static final Logger logger = LogManager.getLogger(SheetController.class);

    @Resource(name = "sheetServiceImpl")
    private SheetService sheetService;

    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result list(@RequestBody Map paramMap){
        try {
            List result = sheetService.findList(paramMap);
            return Result.generJson(result);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result save(@RequestBody Map paramMap){
        try {
            sheetService.save(paramMap);
            return Result.generJson(null);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result deleteById(@RequestBody Map paramMap){
        try {
            sheetService.deleteById(MapUtils.getString(paramMap , "ID"));
            return Result.generJson(null);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/sortPage", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result sortPage(@RequestBody Map paramMap){
        try {
            sheetService.sortPage(paramMap);
            return Result.generJson(null);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
}
