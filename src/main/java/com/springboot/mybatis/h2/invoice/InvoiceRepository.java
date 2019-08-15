package com.springboot.mybatis.h2.invoice;

import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface InvoiceRepository {

    @Select("select * from invoice")
    public List<Invoice> findAll();

    @Select("SELECT * FROM invoice WHERE id = #{id}")
    public Invoice findById(long id);

    @Delete("DELETE FROM invoice WHERE id = #{id}")
    public int deleteById(long id);

    @Insert("INSERT INTO invoice(id, name, invoiceNumber) VALUES (#{id}, #{name}, #{invoiceNumber})")
    public int insert(Invoice invoice);

    @Update("Update invoice set name=#{name}, invoiceNumber=#{invoiceNumber} where id=#{id}")
    public int update(Invoice invoice);
}

