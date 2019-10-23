package com.base.vistter.admin.service.impl;

import com.base.vistter.admin.mapper.SheetMapper;
import com.base.vistter.admin.mapper.SheetTypeMapper;
import com.base.vistter.admin.service.SheetTypeService;
import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.BaseMapper;
import com.base.vistter.common.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("sheetTypeServiceImpl")
@Transactional
public class SheetTypeServiceImpl extends BaseServiceImpl implements SheetTypeService {

    @Resource(name = "sheetTypeMapperImpl")
    private SheetTypeMapper sheetTypeMapper;

    private SheetMapper sheetMapper;

    @Override
    protected BaseMapper getBaseMapper() {
        return this.sheetTypeMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List findList(Map paramMap) throws PlatformException{
        return this.sheetTypeMapper.findList(paramMap);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void start(Map paramMap) throws PlatformException{
        sheetTypeMapper.start(paramMap);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void stop(Map paramMap) throws PlatformException{
        sheetTypeMapper.stop(paramMap);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteById(String id) throws PlatformException {
        this.sheetMapper.deleteBySheetTypeId(id);
        super.deleteById(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(List list) throws PlatformException {
        this.sheetMapper.deleteBySheetTypeIds(list);
        super.delete(list);
    }
}
