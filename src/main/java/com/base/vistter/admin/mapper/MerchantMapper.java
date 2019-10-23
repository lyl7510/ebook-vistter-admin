package com.base.vistter.admin.mapper;


import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.BaseMapper;

import java.util.Map;

public interface MerchantMapper extends BaseMapper {

    void start(Map paramMap) throws PlatformException;

    void stop(Map paramMap) throws PlatformException;

}
