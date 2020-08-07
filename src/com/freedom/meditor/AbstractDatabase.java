package com.freedom.meditor;

public abstract class AbstractDatabase {

    public static final String MYSQL = "mysql";
    public static final String REDIS = "redis";
    public static final String ELASTICSEARCH = "elasticsearch";

    public AbstractMediator mediator;

    public AbstractDatabase(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void addData(String data);

    public abstract void add(String data);
}