package elelief.typemoon.Service;

import elelief.typemoon.pojo.BasicCom;
import elelief.typemoon.pojo.CompositionMessage;

import java.util.List;

public interface ComService {
    public CompositionMessage getAftercomposition(int id);

    public Integer deleteById(int id);

    public Integer insertComposition(CompositionMessage composition);

    public List<BasicCom> selectAll();

}
