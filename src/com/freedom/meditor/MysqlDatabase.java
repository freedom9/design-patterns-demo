package com.freedom.meditor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baijianliang
 * @date 2019/12/12
 * @description
 */
public class MysqlDatabase extends AbstractDatabase {

    private List<String> dataList = null;

    public MysqlDatabase(AbstractMediator mediator) {
        super(mediator);
        dataList = new ArrayList<>();
    }

    @Override
    public void addData(String data) {
        System.out.println("Mysql 添加数据：" + data);
        dataList.add(data);
    }

    @Override
    public void add(String data) {
        addData(data);
        // 同步数据交给中介者
        mediator.sync(AbstractDatabase.MYSQL, data);
    }

    public void select() {
        System.out.println("Mysql查询，数据：" + dataList.toString());
    }
}