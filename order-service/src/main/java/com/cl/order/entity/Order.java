package com.cl.order.entity;

import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * (Order)实体类
 *
 * @author chenlong
 * @since 2022-06-16 11:32:59
 */
@Data
@TableName("tb_order")
public class Order implements Serializable {
    private static final long serialVersionUID = -89268105914427952L;

    @TableId(value = "id")
    private Long id;


    @TableField("user_id")
    private Long userId;

    @TableField("name")
    private String name;

    @TableField("price")
    private Long price;

    @TableField("num")
    private Integer num;

    @TableField(exist = false)
    private User user;

}
