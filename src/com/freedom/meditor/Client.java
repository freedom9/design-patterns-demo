package com.freedom.meditor;

/**
 * @author baijianliang
 * @date 2019/12/12
 * @description
 */
public class Client {

    public static void main(String[] args) {

        AbstractMediator mediator = new SyncMediator();

        MysqlDatabase mysql = new MysqlDatabase(mediator);
        RedisDatabase redis = new RedisDatabase(mediator);
        ESDatabase es = new ESDatabase(mediator);

        mediator.setMysql(mysql);
        mediator.setRedis(redis);
        mediator.setEs(es);

        System.out.println("\n------向mysql添加数据“小白”------");
        mysql.add("小白");
        mysql.select();
        redis.cache();
        es.count();

        System.out.println("\n------向redis添加数据“小明”------");
        redis.add("小明");
        mysql.select();
        redis.cache();
        es.count();

        System.out.println("\n------向ES添加数据“小红”------");
        es.add("小红");
        mysql.select();
        redis.cache();
        es.count();
    }
}