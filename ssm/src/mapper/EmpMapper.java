package mapper;

import domain.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface EmpMapper {

    @Insert("INSERT INTO emps (empid, ename, hiredate, photo, photo2) " +
            "VALUES (#{empid}, #{ename}, #{hiredate}, #{photo}, #{photo2})")
    int insert(Emp emp);

    @Delete("DELETE FROM emps " +
            "WHERE empid = #{empid}")
    int delete(String empid);

    @Update("UPDATE emps " +
            "SET ename = #{ename}, hiredate = #{hiredate}, photo = #{photo}, photo2 = #{photo2} " +
            "WHERE empid = #{empid}")
    int update(Emp emp);

    @Select("SELECT empid, ename, hiredate, photo, photo2 " +
            "FROM emps " +
            "WHERE empid = #{empid}")
    Emp selectByEmpid(String empid);

    @SelectProvider(type = EmpSQLProvider.class, method = "getSql4SelectByAny")
    List<Emp> selectByAny(String value);

}
