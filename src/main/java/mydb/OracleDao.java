package mydb;

@DB(DBType.ORACLE)
public class OracleDao implements DAO {
    @Override
    public void crud() {
        System.out.println("OracleDao");
    }
}
