package com.yunqiic.dataapi.model.second;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;

@ApiModel(value="Config")
public class Config {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "config_id")
    @ApiModelProperty(value="主键ID")
    private Long configId;

    /**
     * key
     */
    @Column(name = "config_key")
    @ApiModelProperty(value="key")
    private String configKey;

    /**
     * value
     */
    @Column(name = "config_value")
    @ApiModelProperty(value="value")
    private String configValue;

    /**
     * 状态 -1-删除 1-正常
     */
    @ApiModelProperty(value="状态 -1-删除 1-正常")
    private Byte status;

    /**
     * 操作人ID
     */
    @Column(name = "operator_id")
    @ApiModelProperty(value="操作人ID")
    private Integer operatorId;

    /**
     * 操作人 记录操作人用户名，程序自动执行时记system
     */
    @ApiModelProperty(value="操作人 记录操作人用户名，程序自动执行时记system")
    private String operator;

    /**
     * 备注(如：基站描述)
     */
    @ApiModelProperty(value="备注(如：基站描述)")
    private String comment;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @ApiModelProperty(value="创建时间")
    private Integer createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    @ApiModelProperty(value="更新时间")
    private Integer updateTime;

    /**
     * 获取主键ID
     *
     * @return config_id - 主键ID
     */
    public Long getConfigId() {
        return configId;
    }

    /**
     * 设置主键ID
     *
     * @param configId 主键ID
     */
    public void setConfigId(Long configId) {
        this.configId = configId;
    }

    /**
     * 获取key
     *
     * @return config_key - key
     */
    public String getConfigKey() {
        return configKey;
    }

    /**
     * 设置key
     *
     * @param configKey key
     */
    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    /**
     * 获取value
     *
     * @return config_value - value
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * 设置value
     *
     * @param configValue value
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    /**
     * 获取状态 -1-删除 1-正常
     *
     * @return status - 状态 -1-删除 1-正常
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态 -1-删除 1-正常
     *
     * @param status 状态 -1-删除 1-正常
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取操作人ID
     *
     * @return operator_id - 操作人ID
     */
    public Integer getOperatorId() {
        return operatorId;
    }

    /**
     * 设置操作人ID
     *
     * @param operatorId 操作人ID
     */
    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * 获取操作人 记录操作人用户名，程序自动执行时记system
     *
     * @return operator - 操作人 记录操作人用户名，程序自动执行时记system
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作人 记录操作人用户名，程序自动执行时记system
     *
     * @param operator 操作人 记录操作人用户名，程序自动执行时记system
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 获取备注(如：基站描述)
     *
     * @return comment - 备注(如：基站描述)
     */
    public String getComment() {
        return comment;
    }

    /**
     * 设置备注(如：基站描述)
     *
     * @param comment 备注(如：基站描述)
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}