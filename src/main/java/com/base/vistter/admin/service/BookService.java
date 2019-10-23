package com.base.vistter.admin.service;

import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.service.BaseService;

import java.util.List;
import java.util.Map;

public interface BookService extends BaseService {

    List findList(Map paramMap) throws PlatformException;

    void start(Map paramMap) throws PlatformException;

    void stop(Map paramMap) throws PlatformException;

    void xpublic(Map paramMap) throws PlatformException;

    void unpubilc(Map paramMap) throws PlatformException;
}
