package cn.xiaoxu.intelligencesql.model.dto;

import java.io.Serializable;
import lombok.Data;

/**
 * 举报更新请求
 *
 * @TableName report
 */
@Data
public class ReportUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 举报实体类型（0-词库）
     */
    private Integer type;

    /**
     * 内容
     */
    private String content;

    /**
     * 被举报对象
     */
    private int reportedId;

    /**
     * 状态（0-未处理, 1-已处理）
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}