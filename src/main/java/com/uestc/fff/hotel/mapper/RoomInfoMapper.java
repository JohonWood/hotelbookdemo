package com.uestc.fff.hotel.mapper;

import com.uestc.fff.hotel.domain.RoomInfo;
import com.uestc.fff.hotel.domain.RoomInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
<<<<<<< HEAD
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
=======
     * @mbg.generated Tue Jul 30 16:48:10 CST 2019
>>>>>>> 608a0e28e1613718fa4ca2e091c3d7c2f6631cc0
     */
    long countByExample(RoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
<<<<<<< HEAD
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
=======
     * @mbg.generated Tue Jul 30 16:48:10 CST 2019
>>>>>>> 608a0e28e1613718fa4ca2e091c3d7c2f6631cc0
     */
    int deleteByExample(RoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
<<<<<<< HEAD
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
=======
     * @mbg.generated Tue Jul 30 16:48:10 CST 2019
>>>>>>> 608a0e28e1613718fa4ca2e091c3d7c2f6631cc0
     */
    int deleteByPrimaryKey(String roomid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
<<<<<<< HEAD
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
=======
     * @mbg.generated Tue Jul 30 16:48:10 CST 2019
>>>>>>> 608a0e28e1613718fa4ca2e091c3d7c2f6631cc0
     */
    int insert(RoomInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
<<<<<<< HEAD
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
=======
     * @mbg.generated Tue Jul 30 16:48:10 CST 2019
>>>>>>> 608a0e28e1613718fa4ca2e091c3d7c2f6631cc0
     */
    int insertSelective(RoomInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
<<<<<<< HEAD
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
=======
     * @mbg.generated Tue Jul 30 16:48:10 CST 2019
>>>>>>> 608a0e28e1613718fa4ca2e091c3d7c2f6631cc0
     */
    List<RoomInfo> selectByExample(RoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
<<<<<<< HEAD
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
=======
     * @mbg.generated Tue Jul 30 16:48:10 CST 2019
>>>>>>> 608a0e28e1613718fa4ca2e091c3d7c2f6631cc0
     */
    RoomInfo selectByPrimaryKey(String roomid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
<<<<<<< HEAD
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
=======
     * @mbg.generated Tue Jul 30 16:48:10 CST 2019
>>>>>>> 608a0e28e1613718fa4ca2e091c3d7c2f6631cc0
     */
    int updateByExampleSelective(@Param("record") RoomInfo record, @Param("example") RoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
<<<<<<< HEAD
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
=======
     * @mbg.generated Tue Jul 30 16:48:10 CST 2019
>>>>>>> 608a0e28e1613718fa4ca2e091c3d7c2f6631cc0
     */
    int updateByExample(@Param("record") RoomInfo record, @Param("example") RoomInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
<<<<<<< HEAD
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
=======
     * @mbg.generated Tue Jul 30 16:48:10 CST 2019
>>>>>>> 608a0e28e1613718fa4ca2e091c3d7c2f6631cc0
     */
    int updateByPrimaryKeySelective(RoomInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
<<<<<<< HEAD
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
=======
     * @mbg.generated Tue Jul 30 16:48:10 CST 2019
>>>>>>> 608a0e28e1613718fa4ca2e091c3d7c2f6631cc0
     */
    int updateByPrimaryKey(RoomInfo record);
}