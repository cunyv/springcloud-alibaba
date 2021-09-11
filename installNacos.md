# NACOS

+ 下载安装：

``` 
git clone https://gitee.com/mirrors/Nacos.git
cd nacos/
mvn -Prelease-nacos -Dmaven.test.skip=true clean install -U  
```

+ 启动nacos

``` 
d:
cd Program Files\nacos\Nacos\distribution\target\nacos-server-2.0.3\nacos\bin
startup.cmd -m standalone
```

