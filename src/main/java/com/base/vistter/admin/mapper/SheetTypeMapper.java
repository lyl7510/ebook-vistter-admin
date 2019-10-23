package com.base.vistter.admin.mapper;


import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

public interface SheetTypeMapper extends BaseMapper {

    void deleteByBookId(String bookId) throws PlatformException;

    void deleteByBookIds(List bookIds) throws PlatformException;

    void start(Map paramMap) throws PlatformException;

    void stop(Map paramMap) throws PlatformException;
}
