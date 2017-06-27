package service;

import domain.Emp;
import mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Transactional
    public int add(Emp emp) {
        return empMapper.insert(emp);
    }

    @Transactional
    public int delete(String empid) {
        return empMapper.delete(empid);
    }

    @Transactional
    public int save(Emp emp) {
        return empMapper.update(emp);
    }

    public Emp findByEmpid(String empid) {
        return empMapper.selectByEmpid(empid);
    }

    public List<Emp> findByAny(String value) {
        return empMapper.selectByAny(value);
    }

}