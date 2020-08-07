package com.freedom.meditor;

/**
 * @author baijianliang
 * @date 2019/12/12
 * @description
 */
public class SyncMediator extends AbstractMediator {

    @Override
    public void sync(String databaseName, String data) {
        if (AbstractDatabase.MYSQL.equals(databaseName)) {
            // 同步到redis和Elasticsearch
            redis.addData(data);
            es.addData(data);
        } else if (AbstractDatabase.ELASTICSEARCH.equals(databaseName)) {
            // 同步到mysql
            mysql.addData(data);
        } else if (AbstractDatabase.REDIS.equals(databaseName)) {
            // 不需要同步
        }
    }
}