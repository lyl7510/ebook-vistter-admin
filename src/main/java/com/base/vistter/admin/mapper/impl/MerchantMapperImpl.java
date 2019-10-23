package com.base.vistter.admin.mapper.impl;

import com.base.vistter.admin.mapper.MerchantMapper;
import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.impl.BaseMapperImpl;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository("merchantMapperImpl")
public class MerchantMapperImpl extends BaseMapperImpl implements MerchantMapper {

    @Override
    protected String getNameSpace() {
        return "Merchant";
    }

    public void start(Map paramMap) throws PlatformException{
        try {
           super.update("start" , paramMap);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
    }

    public void stop(Map paramMap) throws PlatformException{
        try {
            super.update("stop" , paramMap);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
    }

}
