package com.wangkakyi.网络编程;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

/**
 * URL:统一资源定位器，互联网三大基石之一
 * 1。协议
 * 2.域名或ip
 * 3.端口：默认80
 * 4.请求资源
 * http://wwww.baidu.com:80/index.html?username=xxx&
 */
public class URLTest01 {
    public static void main(String args[]) throws MalformedURLException {
        URL url = new URL("http://wwww.baidu.com:80/index.html?username=xxx");
        System.out.println(url.getProtocol());

    }
}
