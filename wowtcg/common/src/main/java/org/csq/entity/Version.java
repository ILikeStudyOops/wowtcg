package org.csq.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName version
 */
@Data
public class Version implements Serializable {
    /**
     * 版本号
     */
    private Integer versionId;

    /**
     * 版本名称
     */
    private String versionName;

    /**
     * 版本英文名
     */
    private String versionEngName;

    /**
     * 版本卡牌总数
     */
    private Integer cardCount;

    private static final long serialVersionUID = 1L;
}