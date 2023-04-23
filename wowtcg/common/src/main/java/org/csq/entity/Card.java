package org.csq.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName card
 */
@Data
public class Card implements Serializable {
    /**
     * 卡牌所属版本id外键
     */
    private Integer fkVersionId;

    /**
     * 卡牌在版本中的编号
     */
    private Integer cardId;

    /**
     * 卡牌名称
     */
    private String cardName;

    /**
     * 卡牌英文名
     */
    private String cardEngName;

    /**
     * 卡牌类型：1：英雄；2.任务；3：技能；4：盟军；5：装备；6：地域；7：坐骑；8：主宰英雄
     */
    private Integer cardType;

    /**
     * 卡牌稀有度：1：白；2：绿；3：蓝；4：紫
     */
    private String cardRarity;

    /**
     * 卡牌存储路径
     */
    private String path;

    private static final long serialVersionUID = 1L;
}