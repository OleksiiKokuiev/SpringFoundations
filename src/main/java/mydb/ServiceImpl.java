package mydb;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
public class ServiceImpl implements DbService {
    @DB(DBType.ORACLE)
    private DAO dao;

    @Override
    @PostConstruct
    public void doWork() {
        System.out.println("I'm use: ");
        dao.crud();
    }
}
