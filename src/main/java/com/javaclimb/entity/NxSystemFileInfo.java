package com.javaclimb.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *   文件信息表
 */
@Table(name = "nx_system_file_info")
public class NxSystemFileInfo {
    /**
     *   主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     *   原始文件名
     */
    private String originname;

    /**
     *   存储文件名
     */
    private String filename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nx_system_file_info.id
     *
     * @return the value of nx_system_file_info.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nx_system_file_info.id
     *
     * @param id the value for nx_system_file_info.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nx_system_file_info.originName
     *
     * @return the value of nx_system_file_info.originName
     *
     * @mbg.generated
     */
    public String getOriginname() {
        return originname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nx_system_file_info.originName
     *
     * @param originname the value for nx_system_file_info.originName
     *
     * @mbg.generated
     */
    public void setOriginname(String originname) {
        this.originname = originname == null ? null : originname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column nx_system_file_info.filename
     *
     * @return the value of nx_system_file_info.filename
     *
     * @mbg.generated
     */
    public String getFilename() {
        return filename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column nx_system_file_info.filename
     *
     * @param filename the value for nx_system_file_info.filename
     *
     * @mbg.generated
     */
    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }
}