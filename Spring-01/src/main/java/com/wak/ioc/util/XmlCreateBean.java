package com.wak.ioc.util;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;


public class XmlCreateBean {
    /**
     * 模拟spring 容器创建 javabean
     *
     * @param configName
     * @param id
     * @return
     */
    public static Object getBean(String configName, String id) {
        final SAXReader saxReader = new SAXReader();
        try {
            final Document dom = saxReader.read(configName);
            final Element element = dom.getRootElement();
            final List<Element> beans = element.elements("bean");
            //获取每一个 bean
            for (Element bean : beans) {
                if (id.equals(bean.attributeValue("id"))) {
                    final String aClass = bean.attributeValue("class");
                    final Class<?> clz = Class.forName(aClass);
                    return clz.newInstance();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
