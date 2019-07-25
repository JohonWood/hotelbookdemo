package com.uestc.fff.hotel.domain;

public class UserInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.User_ID
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.User_name
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.User_phone
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    private String userPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.login_Name
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    private String loginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.login_Password
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    private String loginPassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.User_ID
     *
     * @return the value of user_info.User_ID
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.User_ID
     *
     * @param userId the value for user_info.User_ID
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.User_name
     *
     * @return the value of user_info.User_name
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.User_name
     *
     * @param userName the value for user_info.User_name
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.User_phone
     *
     * @return the value of user_info.User_phone
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.User_phone
     *
     * @param userPhone the value for user_info.User_phone
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.login_Name
     *
     * @return the value of user_info.login_Name
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.login_Name
     *
     * @param loginName the value for user_info.login_Name
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.login_Password
     *
     * @return the value of user_info.login_Password
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.login_Password
     *
     * @param loginPassword the value for user_info.login_Password
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserInfo other = (UserInfo) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPhone() == null ? other.getUserPhone() == null : this.getUserPhone().equals(other.getUserPhone()))
            && (this.getLoginName() == null ? other.getLoginName() == null : this.getLoginName().equals(other.getLoginName()))
            && (this.getLoginPassword() == null ? other.getLoginPassword() == null : this.getLoginPassword().equals(other.getLoginPassword()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Thu Jul 25 14:23:43 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPhone() == null) ? 0 : getUserPhone().hashCode());
        result = prime * result + ((getLoginName() == null) ? 0 : getLoginName().hashCode());
        result = prime * result + ((getLoginPassword() == null) ? 0 : getLoginPassword().hashCode());
        return result;
    }
}