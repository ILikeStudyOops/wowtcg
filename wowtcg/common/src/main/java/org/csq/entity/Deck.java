package org.csq.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName deck
 */
@Data
public class Deck implements Serializable {
    /**
     * 卡组id
     */
    private Integer deckId;

    /**
     * 卡组名称
     */
    private String deckName;

    /**
     * 卡表代码
     */
    private String cardList;

    private static final long serialVersionUID = 1L;
}