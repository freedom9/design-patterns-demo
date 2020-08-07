package com.freedom.meditor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baijianliang
 * @date 2019/12/12
 * @description
 */
public class ESDatabase extends AbstractDatabase {

    private List<String> dataList = null;

    public ESDatabase(AbstractMediator mediator) {
        super(mediator);
        dataList = new ArrayList<>();
    }

    @Override
    public void addData(String data) {
        System.out.println("ES 添加数据：" + data);
        dataList.add(data);
    }

    @Override
    public void add(String data) {
        addData(data);
        // 同步数据交给中介者
        mediator.sync(AbstractDatabase.ELASTICSEARCH, data);
    }

    public void count() {
        System.out.println("Elasticsearch 统计，目前有 " + dataList.size() + " 条数据，数据：" + this.dataList.toString());
    }
}
