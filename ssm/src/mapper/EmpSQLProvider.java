package mapper;

public class EmpSQLProvider {

    public String getSql4SelectByAny(String value) {
        return new StringBuilder()
                .append("SELECT empid, ename, hiredate, photo, photo2 ")
                .append("FROM emps ")
                .append("WHERE empid LIKE '%").append(value).append("%' ")
                .append("   OR ename LIKE '%").append(value).append("%' ")
                .append("   OR date_format(hiredate, '%Y-%m-%d) LIKE '%").append(value).append("%'")
                .toString();

    }

}
