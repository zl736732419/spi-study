#### api与spi

##### api
在java中，我们使用java提供的很多类、类的方法、数据结构来编写我们的应用程序，
最终完成我们需求的程序功能，这里的类、方法、数据结构即是jdk提供的api。
api的意义，其实就是这些提供给你完成某项功能的类、接口或者方法。

##### spi
SPI（Service Provider Interface）是指一些提供给你继承、扩展，
完成自定义功能的类、接口或者方法。
 SPI是一种回调的思想，回调是指我们在使用api时，我们可以向api传入一个类或者方法，
 api在合适的时间调用类或者方法。SPI是在一些通用的标准中，为标准的实现产商提供的扩展点。
 标准在上层提供API，API内部使用了SPI，当API被客户使用时，
 会动态得从当前运行的classpath中寻找该SPI的实现，然后使用该SPI的实现来完成API的功能。

在使用spi提供的接口时，在代码中无需明确指定具体的实现类，而是在META-INF/services/下面
存在一个以待使用的接口全限定名命名的文件，其中明确指定了该类的实现类
在jvm运行时会动态根据该文件中指定的类名加载指定的类进行调用
spi在调用时，通过ServiceLoader来获取目标类

#### 例子

mysql的驱动包提供了java.sql.Driver这个SPI的实现，实现类是com.mysql.jdbc.Driver，
在mysql-connector-java-5.1.6.jar中，我们可以看到有一个META-INF/services目录，
目录下有一个文件名为java.sql.Driver的文件，其中的内容是com.mysql.jdbc.Driver。 
在运行DriverManager.getDriver并传入参数“com.mysql.jdbc.Driver”时，
DriverManager会从mysql-connector-java-5.1.6.jar中找到com.mysql.jdbc.Driver
并实例化返回一个com.mysql.jdbc.Driver的实例。