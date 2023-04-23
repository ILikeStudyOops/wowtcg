package org.csq.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName card_hero
 */
@Data
public class CardHero implements Serializable {
    /**
     * 卡牌编号外键
     */
    private Integer fkCordId;

    /**
     * 英雄所属阵营
     */
    private Integer camp;

    /**
     * 英雄职业
     */
    private Integer occupation;

    /**
     * 生命值
     */
    private Integer hp;

    /**
     * 翻转费用
     */
    private Integer flipCost;

    /**
     * 技能描述
     */
    private String skill;

    private static final long serialVersionUID = 1L;
}