package elelief.typemoon.Service.impl;


import elelief.typemoon.Service.ComService;
import elelief.typemoon.mapper.ComMapper;
import elelief.typemoon.pojo.BasicCom;
import elelief.typemoon.pojo.CompositionMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComServiceimpl implements ComService {
    @Autowired
    private ComMapper comMapper;

    public CompositionMessage getAftercomposition(int id) {
        return comMapper.findById(id);
    }

    public Integer deleteById(int id) {
        Integer r = comMapper.deleteById(id);
        return r;
    }

    public Integer insertComposition(CompositionMessage composition) {
        Integer r = comMapper.Insert(composition);
        return r;
    }

    public List<BasicCom> selectAll() {
        return comMapper.findAll();
    }
}
