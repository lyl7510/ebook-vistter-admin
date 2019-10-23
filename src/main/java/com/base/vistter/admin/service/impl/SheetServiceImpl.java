package com.base.vistter.admin.service.impl;

import com.base.vistter.admin.mapper.SheetMapper;
import com.base.vistter.admin.service.SheetService;
import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.BaseMapper;
import com.base.vistter.common.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("sheetServiceImpl")
@Transactional
public class SheetServiceImpl extends BaseServiceImpl implements SheetService {

    @Resource(name = "sheetMapperImpl")
    private SheetMapper sheetMapper;

    @Override
    protected BaseMapper getBaseMapper() {
        return this.sheetMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List findList(Map paramMap) throws PlatformException {
        return this.sheetMapper.findList(paramMap);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void sortPage(Map paramMap) throws PlatformException{
        this.sheetMapper.sortPage(paramMap);
    }
}
