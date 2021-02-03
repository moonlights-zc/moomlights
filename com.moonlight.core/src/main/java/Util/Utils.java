package Util;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.BeanFactory;

import java.io.InputStream;

public class Utils {
    /**
     * Mybatis相关方法参数
     */
    private static SqlSessionFactoryBuilder sqlSessionFactoryBuilder ;
    static {
        //给sqlSessionFactoryBuilder赋值
        sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

    }


    /**
     * Mybatis相关方法工具
     *  获取DAO层的对象(为Mybatis动态代理对象)作为本类自有使用
     *  getMapper方法重载一个传入Boolean flag作为是否自动提交数据库事物的参数默认为Ture
     * @param classObject===>传入DAO层的class对象
     * @param <T>===>返回传入对象的代理对象
     * @return
     */
    public static<T> T getMapper (Class classObject){
        InputStream ins = Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml");

        return (T)sqlSessionFactoryBuilder.build(ins).openSession(true).getMapper(classObject);
    }
    public static<T> T getMapper (Boolean flag,Class classObject){
        InputStream ins = Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.xml");
        return (T)sqlSessionFactoryBuilder.build(ins).openSession(flag).getMapper(classObject);
    }

    /**
     *Spring相关参数
     * Bean工厂
     */
    private static BeanFactory factory;
    /**
     *Spring相关方法
     * 获取Bean对象
     */
    public static <T> T getBean(String beanName){
        return (T)factory.getBean(beanName);
    }

}
