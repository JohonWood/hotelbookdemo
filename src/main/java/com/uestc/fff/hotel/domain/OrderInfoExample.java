package com.uestc.fff.hotel.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    public OrderInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("Order_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("Order_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("Order_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("Order_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("Order_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("Order_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("Order_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("Order_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("Order_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("Order_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("Order_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("Order_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("Order_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("Order_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("User_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("User_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("User_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("User_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("User_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("User_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("User_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("User_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("User_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("User_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("User_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("User_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("User_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNull() {
            addCriterion("Hotel_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNotNull() {
            addCriterion("Hotel_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelIdEqualTo(String value) {
            addCriterion("Hotel_id =", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotEqualTo(String value) {
            addCriterion("Hotel_id <>", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThan(String value) {
            addCriterion("Hotel_id >", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThanOrEqualTo(String value) {
            addCriterion("Hotel_id >=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThan(String value) {
            addCriterion("Hotel_id <", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThanOrEqualTo(String value) {
            addCriterion("Hotel_id <=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLike(String value) {
            addCriterion("Hotel_id like", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotLike(String value) {
            addCriterion("Hotel_id not like", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIn(List<String> values) {
            addCriterion("Hotel_id in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotIn(List<String> values) {
            addCriterion("Hotel_id not in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdBetween(String value1, String value2) {
            addCriterion("Hotel_id between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotBetween(String value1, String value2) {
            addCriterion("Hotel_id not between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNull() {
            addCriterion("Room_Num is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumIsNotNull() {
            addCriterion("Room_Num is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumEqualTo(Integer value) {
            addCriterion("Room_Num =", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotEqualTo(Integer value) {
            addCriterion("Room_Num <>", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThan(Integer value) {
            addCriterion("Room_Num >", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("Room_Num >=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThan(Integer value) {
            addCriterion("Room_Num <", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumLessThanOrEqualTo(Integer value) {
            addCriterion("Room_Num <=", value, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumIn(List<Integer> values) {
            addCriterion("Room_Num in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotIn(List<Integer> values) {
            addCriterion("Room_Num not in", values, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumBetween(Integer value1, Integer value2) {
            addCriterion("Room_Num between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andRoomNumNotBetween(Integer value1, Integer value2) {
            addCriterion("Room_Num not between", value1, value2, "roomNum");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("Create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("Create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("Create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("Create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("Create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("Create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("Create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("Create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("Create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeIsNull() {
            addCriterion("Order_total_fee is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeIsNotNull() {
            addCriterion("Order_total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeEqualTo(Float value) {
            addCriterion("Order_total_fee =", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeNotEqualTo(Float value) {
            addCriterion("Order_total_fee <>", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeGreaterThan(Float value) {
            addCriterion("Order_total_fee >", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("Order_total_fee >=", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeLessThan(Float value) {
            addCriterion("Order_total_fee <", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeLessThanOrEqualTo(Float value) {
            addCriterion("Order_total_fee <=", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeIn(List<Float> values) {
            addCriterion("Order_total_fee in", values, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeNotIn(List<Float> values) {
            addCriterion("Order_total_fee not in", values, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeBetween(Float value1, Float value2) {
            addCriterion("Order_total_fee between", value1, value2, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeNotBetween(Float value1, Float value2) {
            addCriterion("Order_total_fee not between", value1, value2, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeIsNull() {
            addCriterion("Checkin_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeIsNotNull() {
            addCriterion("Checkin_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeEqualTo(Date value) {
            addCriterion("Checkin_time =", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeNotEqualTo(Date value) {
            addCriterion("Checkin_time <>", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeGreaterThan(Date value) {
            addCriterion("Checkin_time >", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Checkin_time >=", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeLessThan(Date value) {
            addCriterion("Checkin_time <", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeLessThanOrEqualTo(Date value) {
            addCriterion("Checkin_time <=", value, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeIn(List<Date> values) {
            addCriterion("Checkin_time in", values, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeNotIn(List<Date> values) {
            addCriterion("Checkin_time not in", values, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeBetween(Date value1, Date value2) {
            addCriterion("Checkin_time between", value1, value2, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCheckinTimeNotBetween(Date value1, Date value2) {
            addCriterion("Checkin_time not between", value1, value2, "checkinTime");
            return (Criteria) this;
        }

        public Criteria andCustomNumIsNull() {
            addCriterion("custom_num is null");
            return (Criteria) this;
        }

        public Criteria andCustomNumIsNotNull() {
            addCriterion("custom_num is not null");
            return (Criteria) this;
        }

        public Criteria andCustomNumEqualTo(Integer value) {
            addCriterion("custom_num =", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumNotEqualTo(Integer value) {
            addCriterion("custom_num <>", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumGreaterThan(Integer value) {
            addCriterion("custom_num >", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("custom_num >=", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumLessThan(Integer value) {
            addCriterion("custom_num <", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumLessThanOrEqualTo(Integer value) {
            addCriterion("custom_num <=", value, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumIn(List<Integer> values) {
            addCriterion("custom_num in", values, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumNotIn(List<Integer> values) {
            addCriterion("custom_num not in", values, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumBetween(Integer value1, Integer value2) {
            addCriterion("custom_num between", value1, value2, "customNum");
            return (Criteria) this;
        }

        public Criteria andCustomNumNotBetween(Integer value1, Integer value2) {
            addCriterion("custom_num not between", value1, value2, "customNum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_info
     *
     * @mbg.generated do_not_delete_during_merge Fri Aug 02 10:25:39 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_info
     *
     * @mbg.generated Fri Aug 02 10:25:39 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}