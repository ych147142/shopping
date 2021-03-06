package com.example.shopping.dao;

import com.example.shopping.pojo.Shipping;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ShippingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_shipping
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_shipping
     *
     * @mbggenerated
     */
    int insert(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_shipping
     *
     * @mbggenerated
     */
    Shipping selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_shipping
     *
     * @mbggenerated
     */
    List<Shipping> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ych_shipping
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Shipping record);
}