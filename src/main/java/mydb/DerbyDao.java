package mydb;

@DB(DBType.DERBY)
public class DerbyDao implements DAO {
    @Override
    public void crud() {
        System.out.println("DerbyDao");
    }
}
