package org.csq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.csq.entity.Card;
import org.csq.service.CardService;
import org.csq.mapper.CardMapper;
import org.springframework.stereotype.Service;

/**
* @author sugang
* @description 针对表【card】的数据库操作Service实现
* @createDate 2023-04-23 15:31:52
*/
@Service
public class CardServiceImpl extends ServiceImpl<CardMapper, Card>
    implements CardService{

}




