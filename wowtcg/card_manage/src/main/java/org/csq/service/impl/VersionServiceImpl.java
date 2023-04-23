package org.csq.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.csq.entity.Version;
import org.csq.service.VersionService;
import org.csq.mapper.VersionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author sugang
* @description 针对表【version】的数据库操作Service实现
* @createDate 2023-04-23 15:31:52
*/
@Service
public class VersionServiceImpl extends ServiceImpl<VersionMapper, Version> implements VersionService{

    @Autowired
    private VersionMapper versionMapper;

    @Override
    public List<Version> test() {
        LambdaQueryWrapper<Version> wrapper = new LambdaQueryWrapper<>();
        return versionMapper.selectList(wrapper);
    }
}




