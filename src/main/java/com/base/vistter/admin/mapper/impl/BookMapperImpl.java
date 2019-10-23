package com.base.vistter.admin.mapper.impl;

import com.base.vistter.admin.mapper.BookMapper;
import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.impl.BaseMapperImpl;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("bookMapperImpl")
public class BookMapperImpl extends BaseMapperImpl implements BookMapper {

    @Override
    protected String getNameSpace() {
        return "Book";
    }

    public long countByMerchantId(String merchatId) throws PlatformException {
        try {
            return super.count("countByMerchantId" , merchatId);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
    }

    public long countByMerchantIds(List merchatIds) throws PlatformException{
        try {
            return super.count("countByMerchantIds" , merchatIds);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
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

    public void xpublic(Map paramMap) throws PlatformException{
        try {
            super.update("xpublic" , paramMap);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
    }

    public void unpubilc(Map paramMap) throws PlatformException{
        try {
            super.update("unpubilc" , paramMap);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
    }

}
