package com.base.vistter.admin.mapper.impl;

import com.base.vistter.admin.mapper.SheetTypeMapper;
import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.impl.BaseMapperImpl;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("sheetTypeMapperImpl")
public class SheetTypeMapperImpl extends BaseMapperImpl implements SheetTypeMapper {

    @Override
    protected String getNameSpace() {
        return "SheetType";
    }

    public void deleteByBookId(String bookId) throws PlatformException {
        try {
            super.delete("deleteByBookId" , bookId);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
    }

    public void deleteByBookIds(List bookIds) throws PlatformException{
        try {
            super.delete("deleteByBookIds" , bookIds);
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
}
