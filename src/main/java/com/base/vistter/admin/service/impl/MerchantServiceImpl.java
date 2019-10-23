package com.base.vistter.admin.service.impl;

import com.base.vistter.admin.bean.ErrorCode;
import com.base.vistter.admin.mapper.BookMapper;
import com.base.vistter.admin.mapper.MerchantMapper;
import com.base.vistter.admin.service.MerchantService;
import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.BaseMapper;
import com.base.vistter.common.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("merchantServiceImpl")
@Transactional
public class MerchantServiceImpl extends BaseServiceImpl implements MerchantService {

    @Resource(name = "merchantMapperImpl")
    private MerchantMapper merchantMapper;

    @Resource(name = "bookMapperImpl")
    private BookMapper bookMapper;

    @Override
    protected BaseMapper getBaseMapper() {
        return this.merchantMapper;
    }

    @Transactional(readOnly = true)
    public List findList() throws PlatformException{
        return this.merchantMapper.findList();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void start(Map paramMap) throws PlatformException{
        this.merchantMapper.start(paramMap);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void stop(Map paramMap) throws PlatformException{
        this.merchantMapper.stop(paramMap);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteById(String id) throws PlatformException {
        if(bookMapper.countByMerchantId(id) >0){
            throw new PlatformException(ErrorCode.MERCHANT_HAVE_BOOKS);
        }
        super.deleteById(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(List list) throws PlatformException {
        if(bookMapper.countByMerchantIds(list) >0){
            throw new PlatformException(ErrorCode.MERCHANT_HAVE_BOOKS);
        }
        super.delete(list);
    }
}
