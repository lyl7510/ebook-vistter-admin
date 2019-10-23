package com.base.vistter.admin.mapper;


import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

public interface SheetMapper extends BaseMapper {

    void deleteByBookId(String bookId) throws PlatformException;

    void deleteByBookIds(List bookIds) throws PlatformException;

    void deleteBySheetTypeId(String sheetTypeId) throws PlatformException;

    void deleteBySheetTypeIds(List sheetTypeIds) throws PlatformException;

    void sortPage(Map paramMap) throws PlatformException;
}
