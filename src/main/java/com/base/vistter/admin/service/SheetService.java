package com.base.vistter.admin.service;


import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.service.BaseService;

import java.util.List;
import java.util.Map;

public interface SheetService extends BaseService {

    List findList(Map paramMap) throws PlatformException;

    void sortPage(Map paramMap) throws PlatformException;
}
