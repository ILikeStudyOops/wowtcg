package org.csq.service;

import org.csq.entity.Version;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author sugang
* @description 针对表【version】的数据库操作Service
* @createDate 2023-04-23 15:31:52
*/
public interface VersionService extends IService<Version> {

    List<Version> test();
}
