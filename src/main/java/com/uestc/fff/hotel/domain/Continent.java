package com.uestc.fff.hotel.domain;

public class Continent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column continent.Contiment_ID
     *
     * @mbg.generated Fri Aug 02 15:13:00 CST 2019
     */
    private String contimentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column continent.Contiment_Name
     *
     * @mbg.generated Fri Aug 02 15:13:00 CST 2019
     */
    private String contimentName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column continent.Contiment_ID
     *
     * @return the value of continent.Contiment_ID
     *
     * @mbg.generated Fri Aug 02 15:13:00 CST 2019
     */
    public String getContimentId() {
        return contimentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column continent.Contiment_ID
     *
     * @param contimentId the value for continent.Contiment_ID
     *
     * @mbg.generated Fri Aug 02 15:13:00 CST 2019
     */
    public void setContimentId(String contimentId) {
        this.contimentId = contimentId == null ? null : contimentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column continent.Contiment_Name
     *
     * @return the value of continent.Contiment_Name
     *
     * @mbg.generated Fri Aug 02 15:13:00 CST 2019
     */
    public String getContimentName() {
        return contimentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column continent.Contiment_Name
     *
     * @param contimentName the value for continent.Contiment_Name
     *
     * @mbg.generated Fri Aug 02 15:13:00 CST 2019
     */
    public void setContimentName(String contimentName) {
        this.contimentName = contimentName == null ? null : contimentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table continent
     *
     * @mbg.generated Fri Aug 02 15:13:00 CST 2019
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
        Continent other = (Continent) that;
        return (this.getContimentId() == null ? other.getContimentId() == null : this.getContimentId().equals(other.getContimentId()))
            && (this.getContimentName() == null ? other.getContimentName() == null : this.getContimentName().equals(other.getContimentName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table continent
     *
     * @mbg.generated Fri Aug 02 15:13:00 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getContimentId() == null) ? 0 : getContimentId().hashCode());
        result = prime * result + ((getContimentName() == null) ? 0 : getContimentName().hashCode());
        return result;
    }
}