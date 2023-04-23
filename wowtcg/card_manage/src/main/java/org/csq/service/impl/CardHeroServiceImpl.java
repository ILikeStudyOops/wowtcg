package org.csq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.csq.entity.CardHero;
import org.csq.service.CardHeroService;
import org.csq.mapper.CardHeroMapper;
import org.springframework.stereotype.Service;

/**
* @author sugang
* @description 针对表【card_hero】的数据库操作Service实现
* @createDate 2023-04-23 15:31:52
*/
@Service
public class CardHeroServiceImpl extends ServiceImpl<CardHeroMapper, CardHero>
    implements CardHeroService{

}




