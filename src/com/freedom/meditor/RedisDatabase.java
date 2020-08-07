package com.freedom.meditor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baijianliang
 * @date 2019/12/12
 * @description
 */
public class RedisDatabase extends AbstractDatabase {

    private List<String> dataList = null;

    public RedisDatabase(AbstractMediator mediator) {
        super(mediator);
        dataList = new ArrayList<>();
    }

    @Override
    public void addData(String data) {
        System.out.println("Redis 添加数据：" + data);
        dataList.add(data);
    }

    @Override
    public void add(String data) {
        addData(data);
        // 同步数据交给中介者
        mediator.sync(AbstractDatabase.REDIS, data);
    }

    public void cache() {
        System.out.println("Redis 缓存的数据：" + dataList.toString());
    }
}