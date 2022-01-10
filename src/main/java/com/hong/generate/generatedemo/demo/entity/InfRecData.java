package com.hong.generate.generatedemo.demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * Resuful 接口数据
 * </p>
 *
 * @author liyh
 * @since 2020-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mdm_inf_rec_data")
@ApiModel(value = "InfRecData对象", description = "Resuful 接口数据")
public class InfRecData extends Model<InfRecData> {

    private static final long serialVersionUID = 1L;

    //主键
    @ApiModelProperty(value = "主键")
    @TableId(value = "ID", type = IdType.ASSIGN_UUID)
    private String id;

    //接收数据
    @ApiModelProperty(value = "接收数据")
    @TableField("REC_DATA")
    private String recData;

    //结果数据
    @ApiModelProperty(value = "结果数据")
    @TableField("RES_DATA")
    private String resData;

    //是否启用1：是，0：否
    @ApiModelProperty(value = "是否启用1：是，0：否")
    @TableField("TURNON_OR_NOT")
    private String turnonOrNot;

    //创建人
    @ApiModelProperty(value = "创建人")
    @TableField("CREATER")
    private String creater;

    //创建日期
    @ApiModelProperty(value = "创建日期")
    @TableField("CREATE_DATE")
    private Date createDate;

    //修改人
    @ApiModelProperty(value = "修改人")
    @TableField("UPDATER")
    private String updater;

    //修改日期
    @ApiModelProperty(value = "修改日期")
    @TableField("UPDATE_DATE")
    private Date updateDate;

    //排序
    @ApiModelProperty(value = "排序")
    @TableField("ORDER_NO")
    private Integer orderNo;

    //备注
    @ApiModelProperty(value = "备注")
    @TableField("REMARK")
    private String remark;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
