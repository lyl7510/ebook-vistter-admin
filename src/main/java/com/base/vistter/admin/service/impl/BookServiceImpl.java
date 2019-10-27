package com.base.vistter.admin.service.impl;

import com.base.vistter.admin.mapper.BookMapper;
import com.base.vistter.admin.mapper.SheetMapper;
import com.base.vistter.admin.mapper.SheetTypeMapper;
import com.base.vistter.admin.service.BookService;
import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.BaseMapper;
import com.base.vistter.common.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("bookServiceImpl")
@Transactional
public class BookServiceImpl extends BaseServiceImpl implements BookService {

    @Resource(name = "bookMapperImpl")
    private BookMapper bookMapper;

    @Resource(name = "sheetTypeMapperImpl")
    private SheetTypeMapper sheetTypeMapper;

    @Resource(name = "sheetMapperImpl")
    private SheetMapper sheetMapper;

    @Override
    protected BaseMapper getBaseMapper() {
        return this.bookMapper;
    }

    @Transactional(readOnly = true)
    public List findList(Map paramMap) throws PlatformException {
        return this.bookMapper.findList(paramMap);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void start(Map paramMap) throws PlatformException{
        this.bookMapper.start(paramMap);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void stop(Map paramMap) throws PlatformException{
        this.bookMapper.stop(paramMap);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void xpublic(Map paramMap) throws PlatformException{
        this.bookMapper.xpublic(paramMap);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void unpubilc(Map paramMap) throws PlatformException{
        this.bookMapper.unpubilc(paramMap);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteById(String id) throws PlatformException {
        sheetMapper.deleteByBookId(id);
        sheetTypeMapper.deleteByBookId(id);
        super.deleteById(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(List list) throws PlatformException {
        sheetMapper.deleteByBookIds(list);
        sheetTypeMapper.deleteByBookIds(list);
        super.delete(list);
    }
}
