package com.base.vistter.admin.mapper;


import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

public interface BookMapper extends BaseMapper {

    long countByMerchantId(String merchatId) throws PlatformException;

    long countByMerchantIds(List merchatIds) throws PlatformException;

    void start(Map paramMap) throws PlatformException;

    void stop(Map paramMap) throws PlatformException;

    void xpublic(Map paramMap) throws PlatformException;

    void unpubilc(Map paramMap) throws PlatformException;
}
