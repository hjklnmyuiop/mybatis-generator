package com.ptx.mapper;

import com.ptx.model.CompanyCountry;
import java.util.List;

public interface CompanyCountryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CompanyCountry record);

    CompanyCountry selectByPrimaryKey(Integer id);

    List<CompanyCountry> selectAll();

    int updateByPrimaryKey(CompanyCountry record);
}