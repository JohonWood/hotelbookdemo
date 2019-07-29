package com.uestc.fff.hotel.domain;

import java.util.ArrayList;
import java.util.List;

public class RoomInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
     */
    public RoomInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
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
     * This method corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
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

        public Criteria andRoomidIsNull() {
            addCriterion("RoomID is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("RoomID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(String value) {
            addCriterion("RoomID =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(String value) {
            addCriterion("RoomID <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(String value) {
            addCriterion("RoomID >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(String value) {
            addCriterion("RoomID >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(String value) {
            addCriterion("RoomID <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(String value) {
            addCriterion("RoomID <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLike(String value) {
            addCriterion("RoomID like", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotLike(String value) {
            addCriterion("RoomID not like", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<String> values) {
            addCriterion("RoomID in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<String> values) {
            addCriterion("RoomID not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(String value1, String value2) {
            addCriterion("RoomID between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(String value1, String value2) {
            addCriterion("RoomID not between", value1, value2, "roomid");
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

        public Criteria andRoomNameIsNull() {
            addCriterion("Room_Name is null");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNotNull() {
            addCriterion("Room_Name is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNameEqualTo(String value) {
            addCriterion("Room_Name =", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotEqualTo(String value) {
            addCriterion("Room_Name <>", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThan(String value) {
            addCriterion("Room_Name >", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("Room_Name >=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThan(String value) {
            addCriterion("Room_Name <", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThanOrEqualTo(String value) {
            addCriterion("Room_Name <=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLike(String value) {
            addCriterion("Room_Name like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotLike(String value) {
            addCriterion("Room_Name not like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameIn(List<String> values) {
            addCriterion("Room_Name in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotIn(List<String> values) {
            addCriterion("Room_Name not in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameBetween(String value1, String value2) {
            addCriterion("Room_Name between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotBetween(String value1, String value2) {
            addCriterion("Room_Name not between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("Room_Type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("Room_Type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(String value) {
            addCriterion("Room_Type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(String value) {
            addCriterion("Room_Type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(String value) {
            addCriterion("Room_Type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Room_Type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(String value) {
            addCriterion("Room_Type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(String value) {
            addCriterion("Room_Type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLike(String value) {
            addCriterion("Room_Type like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotLike(String value) {
            addCriterion("Room_Type not like", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<String> values) {
            addCriterion("Room_Type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<String> values) {
            addCriterion("Room_Type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(String value1, String value2) {
            addCriterion("Room_Type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(String value1, String value2) {
            addCriterion("Room_Type not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomStatusIsNull() {
            addCriterion("Room_Status is null");
            return (Criteria) this;
        }

        public Criteria andRoomStatusIsNotNull() {
            addCriterion("Room_Status is not null");
            return (Criteria) this;
        }

        public Criteria andRoomStatusEqualTo(Boolean value) {
            addCriterion("Room_Status =", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusNotEqualTo(Boolean value) {
            addCriterion("Room_Status <>", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusGreaterThan(Boolean value) {
            addCriterion("Room_Status >", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Room_Status >=", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusLessThan(Boolean value) {
            addCriterion("Room_Status <", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("Room_Status <=", value, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusIn(List<Boolean> values) {
            addCriterion("Room_Status in", values, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusNotIn(List<Boolean> values) {
            addCriterion("Room_Status not in", values, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("Room_Status between", value1, value2, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Room_Status not between", value1, value2, "roomStatus");
            return (Criteria) this;
        }

        public Criteria andRoomFeeIsNull() {
            addCriterion("Room_Fee is null");
            return (Criteria) this;
        }

        public Criteria andRoomFeeIsNotNull() {
            addCriterion("Room_Fee is not null");
            return (Criteria) this;
        }

        public Criteria andRoomFeeEqualTo(Float value) {
            addCriterion("Room_Fee =", value, "roomFee");
            return (Criteria) this;
        }

        public Criteria andRoomFeeNotEqualTo(Float value) {
            addCriterion("Room_Fee <>", value, "roomFee");
            return (Criteria) this;
        }

        public Criteria andRoomFeeGreaterThan(Float value) {
            addCriterion("Room_Fee >", value, "roomFee");
            return (Criteria) this;
        }

        public Criteria andRoomFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("Room_Fee >=", value, "roomFee");
            return (Criteria) this;
        }

        public Criteria andRoomFeeLessThan(Float value) {
            addCriterion("Room_Fee <", value, "roomFee");
            return (Criteria) this;
        }

        public Criteria andRoomFeeLessThanOrEqualTo(Float value) {
            addCriterion("Room_Fee <=", value, "roomFee");
            return (Criteria) this;
        }

        public Criteria andRoomFeeIn(List<Float> values) {
            addCriterion("Room_Fee in", values, "roomFee");
            return (Criteria) this;
        }

        public Criteria andRoomFeeNotIn(List<Float> values) {
            addCriterion("Room_Fee not in", values, "roomFee");
            return (Criteria) this;
        }

        public Criteria andRoomFeeBetween(Float value1, Float value2) {
            addCriterion("Room_Fee between", value1, value2, "roomFee");
            return (Criteria) this;
        }

        public Criteria andRoomFeeNotBetween(Float value1, Float value2) {
            addCriterion("Room_Fee not between", value1, value2, "roomFee");
            return (Criteria) this;
        }

        public Criteria andRoomBreakfirstIsNull() {
            addCriterion("Room_Breakfirst is null");
            return (Criteria) this;
        }

        public Criteria andRoomBreakfirstIsNotNull() {
            addCriterion("Room_Breakfirst is not null");
            return (Criteria) this;
        }

        public Criteria andRoomBreakfirstEqualTo(String value) {
            addCriterion("Room_Breakfirst =", value, "roomBreakfirst");
            return (Criteria) this;
        }

        public Criteria andRoomBreakfirstNotEqualTo(String value) {
            addCriterion("Room_Breakfirst <>", value, "roomBreakfirst");
            return (Criteria) this;
        }

        public Criteria andRoomBreakfirstGreaterThan(String value) {
            addCriterion("Room_Breakfirst >", value, "roomBreakfirst");
            return (Criteria) this;
        }

        public Criteria andRoomBreakfirstGreaterThanOrEqualTo(String value) {
            addCriterion("Room_Breakfirst >=", value, "roomBreakfirst");
            return (Criteria) this;
        }

        public Criteria andRoomBreakfirstLessThan(String value) {
            addCriterion("Room_Breakfirst <", value, "roomBreakfirst");
            return (Criteria) this;
        }

        public Criteria andRoomBreakfirstLessThanOrEqualTo(String value) {
            addCriterion("Room_Breakfirst <=", value, "roomBreakfirst");
            return (Criteria) this;
        }

        public Criteria andRoomBreakfirstLike(String value) {
            addCriterion("Room_Breakfirst like", value, "roomBreakfirst");
            return (Criteria) this;
        }

        public Criteria andRoomBreakfirstNotLike(String value) {
            addCriterion("Room_Breakfirst not like", value, "roomBreakfirst");
            return (Criteria) this;
        }

        public Criteria andRoomBreakfirstIn(List<String> values) {
            addCriterion("Room_Breakfirst in", values, "roomBreakfirst");
            return (Criteria) this;
        }

        public Criteria andRoomBreakfirstNotIn(List<String> values) {
            addCriterion("Room_Breakfirst not in", values, "roomBreakfirst");
            return (Criteria) this;
        }

        public Criteria andRoomBreakfirstBetween(String value1, String value2) {
            addCriterion("Room_Breakfirst between", value1, value2, "roomBreakfirst");
            return (Criteria) this;
        }

        public Criteria andRoomBreakfirstNotBetween(String value1, String value2) {
            addCriterion("Room_Breakfirst not between", value1, value2, "roomBreakfirst");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table room_info
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 29 10:01:50 GMT+08:00 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table room_info
     *
     * @mbg.generated Mon Jul 29 10:01:50 GMT+08:00 2019
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