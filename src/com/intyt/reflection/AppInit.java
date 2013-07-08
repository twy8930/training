package com.intyt.reflection;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 反射应用场景演示
 * @author twy
 *
 */
public class AppInit {

    public static void doAppInit() {
    	SAXReader saxReader = new SAXReader(); 
        Document doc = null;
        try {
            // 读取并解析XML文档
            doc = saxReader.read(new File("src/com/intyt/reflection/config.xml"));
            Element rootElt = doc.getRootElement(); // 获取根节点
            Iterator iter = rootElt.elementIterator("util"); 
            while (iter.hasNext()) {
                Element utilElement = (Element) iter.next();
                String path = utilElement.elementTextTrim("path");
                String init = utilElement.elementTextTrim("init");
                Class util=Class.forName(path);
                Method initMethod = util.getMethod(init);
                initMethod.invoke(null);
            }
        } catch (DocumentException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
    	doAppInit();
	}

}