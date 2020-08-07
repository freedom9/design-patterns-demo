package com.freedom.meditor;

/**
 * @author baijianliang
 * @date 2019/12/12
 * @description
 */
public abstract class AbstractMediator {

    protected MysqlDatabase mysql;
    protected RedisDatabase redis;
    protected ESDatabase es;

    // getter和setter


    public MysqlDatabase getMysql() {
        return mysql;
    }

    public void setMysql(MysqlDatabase mysql) {
        this.mysql = mysql;
    }

    public RedisDatabase getRedis() {
        return redis;
    }

    public void setRedis(RedisDatabase redis) {
        this.redis = redis;
    }

    public ESDatabase getEs() {
        return es;
    }

    public void setEs(ESDatabase es) {
        this.es = es;
    }

    public abstract void sync(String databaseName, String data);
}