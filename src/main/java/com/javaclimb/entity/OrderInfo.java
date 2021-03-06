package com.javaclimb.entity;

/**
 * Database Table Remarks:
 *   商品订单信息表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table order_info
 */
public class OrderInfo {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   订单ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.orderId
     *
     * @mbg.generated
     */
    private Long orderid;

    /**
     * Database Column Remarks:
     *   总价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.totalPrice
     *
     * @mbg.generated
     */
    private Float totalprice;

    /**
     * Database Column Remarks:
     *   所属用户
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.userId
     *
     * @mbg.generated
     */
    private Long userid;

    /**
     * Database Column Remarks:
     *   用户等级
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.level
     *
     * @mbg.generated
     */
    private Integer level;

    /**
     * Database Column Remarks:
     *   联系地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.linkAddress
     *
     * @mbg.generated
     */
    private String linkaddress;

    /**
     * Database Column Remarks:
     *   联系电话
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.linkPhone
     *
     * @mbg.generated
     */
    private String linkphone;

    /**
     * Database Column Remarks:
     *   联系人
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.linkMan
     *
     * @mbg.generated
     */
    private String linkman;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.creatTime
     *
     * @mbg.generated
     */
    private String creattime;

    /**
     * Database Column Remarks:
     *   订单状态
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.state
     *
     * @mbg.generated
     */
    private String state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.id
     *
     * @return the value of order_info.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.id
     *
     * @param id the value for order_info.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.orderId
     *
     * @return the value of order_info.orderId
     *
     * @mbg.generated
     */
    public Long getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.orderId
     *
     * @param orderid the value for order_info.orderId
     *
     * @mbg.generated
     */
    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.totalPrice
     *
     * @return the value of order_info.totalPrice
     *
     * @mbg.generated
     */
    public Float getTotalprice() {
        return totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.totalPrice
     *
     * @param totalprice the value for order_info.totalPrice
     *
     * @mbg.generated
     */
    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.userId
     *
     * @return the value of order_info.userId
     *
     * @mbg.generated
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.userId
     *
     * @param userid the value for order_info.userId
     *
     * @mbg.generated
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.level
     *
     * @return the value of order_info.level
     *
     * @mbg.generated
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.level
     *
     * @param level the value for order_info.level
     *
     * @mbg.generated
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.linkAddress
     *
     * @return the value of order_info.linkAddress
     *
     * @mbg.generated
     */
    public String getLinkaddress() {
        return linkaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.linkAddress
     *
     * @param linkaddress the value for order_info.linkAddress
     *
     * @mbg.generated
     */
    public void setLinkaddress(String linkaddress) {
        this.linkaddress = linkaddress == null ? null : linkaddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.linkPhone
     *
     * @return the value of order_info.linkPhone
     *
     * @mbg.generated
     */
    public String getLinkphone() {
        return linkphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.linkPhone
     *
     * @param linkphone the value for order_info.linkPhone
     *
     * @mbg.generated
     */
    public void setLinkphone(String linkphone) {
        this.linkphone = linkphone == null ? null : linkphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.linkMan
     *
     * @return the value of order_info.linkMan
     *
     * @mbg.generated
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.linkMan
     *
     * @param linkman the value for order_info.linkMan
     *
     * @mbg.generated
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.creatTime
     *
     * @return the value of order_info.creatTime
     *
     * @mbg.generated
     */
    public String getCreattime() {
        return creattime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.creatTime
     *
     * @param creattime the value for order_info.creatTime
     *
     * @mbg.generated
     */
    public void setCreattime(String creattime) {
        this.creattime = creattime == null ? null : creattime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.state
     *
     * @return the value of order_info.state
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.state
     *
     * @param state the value for order_info.state
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}