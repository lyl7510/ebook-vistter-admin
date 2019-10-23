package com.base.vistter.admin.controller;

import com.base.vistter.admin.service.SheetTypeService;
import com.base.vistter.common.bean.Pager;
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
@RequestMapping("/sheetType")
public class SheetTypeController {

    private static final Logger logger = LogManager.getLogger(SheetTypeController.class);

    @Resource(name = "sheetTypeServiceImpl")
    private SheetTypeService sheetTypeService;

    @RequestMapping(value = "/findPager", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result findPager(@RequestBody Map paramMap){
        try {
            Pager pager = sheetTypeService.findPager(paramMap);
            return Result.generJson(pager);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/load", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result load(@RequestBody Map paramMap){
        try {
            Map result = sheetTypeService.load(MapUtils.getString(paramMap , "ID"));
            return Result.generJson(result);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result list(@RequestBody Map paramMap){
        try {
            List result = sheetTypeService.findList(paramMap);
            return Result.generJson(result);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result save(@RequestBody Map paramMap){
        try {
            sheetTypeService.save(paramMap);
            return Result.generJson(null);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result update(@RequestBody Map paramMap){
        try {
            sheetTypeService.update(paramMap);
            return Result.generJson(null);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }


    @RequestMapping(value = "/start", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result start(@RequestBody Map paramMap){
        try {
            sheetTypeService.start(paramMap);
            return Result.generJson(null);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/stop", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result stop(@RequestBody Map paramMap){
        try {
            sheetTypeService.stop(paramMap);
            return Result.generJson(null);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/deleteById", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result deleteById(@RequestBody Map paramMap){
        try {
            sheetTypeService.deleteById(MapUtils.getString(paramMap , "ID"));
            return Result.generJson(null);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result delete(@RequestBody Map paramMap){
        try {
            sheetTypeService.delete((List) paramMap.get("list"));
            return Result.generJson(null);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return null;
        }
    }
}
