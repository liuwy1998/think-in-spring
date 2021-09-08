package org.liuwy.dependency.injection;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * "construct" Autowiring 依赖 Constructor 方法注入示例
 * @author ImOkkkk
 * @date 2021/9/5 22:03
 * @since 1.0
 */
public class AutoWiringConstructorDependencyInjectionDemo {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        String xmlResourcePath = "classpath:/META-INF/autowiring-dependency-constructor-injection.xml";
        xmlBeanDefinitionReader.loadBeanDefinitions(xmlResourcePath);
        UserHolder userHolder = beanFactory.getBean(UserHolder.class);
        System.out.println(userHolder);
    }
}
