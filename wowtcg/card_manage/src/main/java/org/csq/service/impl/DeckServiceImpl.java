package org.csq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.csq.entity.Deck;
import org.csq.service.DeckService;
import org.csq.mapper.DeckMapper;
import org.springframework.stereotype.Service;

/**
* @author sugang
* @description 针对表【deck】的数据库操作Service实现
* @createDate 2023-04-23 15:31:52
*/
@Service
public class DeckServiceImpl extends ServiceImpl<DeckMapper, Deck>
    implements DeckService{

}




