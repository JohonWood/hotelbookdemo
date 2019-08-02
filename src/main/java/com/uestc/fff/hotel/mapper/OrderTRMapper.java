package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.OrderTR;
import com.uestc.fff.hotel.domain.OrderTRExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderTRMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_to_room
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    long countByExample(OrderTRExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_to_room
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    int deleteByExample(OrderTRExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_to_room
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_to_room
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    int insert(OrderTR record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_to_room
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    int insertSelective(OrderTR record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_to_room
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    List<OrderTR> selectByExample(OrderTRExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_to_room
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    OrderTR selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_to_room
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    int updateByExampleSelective(@Param("record") OrderTR record, @Param("example") OrderTRExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_to_room
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    int updateByExample(@Param("record") OrderTR record, @Param("example") OrderTRExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_to_room
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    int updateByPrimaryKeySelective(OrderTR record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_to_room
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    int updateByPrimaryKey(OrderTR record);
}