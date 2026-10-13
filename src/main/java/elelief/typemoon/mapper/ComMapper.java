package elelief.typemoon.mapper;

import elelief.typemoon.pojo.Admin;
import elelief.typemoon.pojo.BasicCom;
import elelief.typemoon.pojo.CompositionMessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComMapper {
    List<BasicCom> findAll();

    Integer deleteById(int id);

    Integer Insert(CompositionMessage compositionMessage);

    CompositionMessage findById(int id);

}
