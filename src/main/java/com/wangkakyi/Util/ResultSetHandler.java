package com.wangkakyi.Util;

import java.sql.ResultSet;

public interface ResultSetHandler<T> {
    T handle(ResultSet rs) ;
}
