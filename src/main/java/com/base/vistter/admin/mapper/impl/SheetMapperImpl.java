package com.base.vistter.admin.mapper.impl;

import com.base.vistter.admin.mapper.SheetMapper;
import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.impl.BaseMapperImpl;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("sheetMapperImpl")
public class SheetMapperImpl extends BaseMapperImpl implements SheetMapper {

    @Override
    protected String getNameSpace() {
        return "Sheet";
    }

    public void deleteByBookId(String bookId) throws PlatformException {
        try {
            super.delete("deleteByBookId", bookId);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
    }

    public void deleteByBookIds(List bookIds) throws PlatformException {
        try {
            super.delete("deleteByBookIds", bookIds);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
    }

    public void deleteBySheetTypeId(String sheetTypeId) throws PlatformException {
        try {
            super.delete("deleteBySheetTypeId", sheetTypeId);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
    }

    public void deleteBySheetTypeIds(List sheetTypeIds) throws PlatformException {
        try {
            super.delete("deleteBySheetTypeIds", sheetTypeIds);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
    }

    public void sortPage(Map paramMap) throws PlatformException {
        try {
            super.update("sortPage", paramMap);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
    }
}
