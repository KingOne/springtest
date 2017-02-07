package com.easy.test;


import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;


public abstract class CommonUtil {

	
	public static String obj2xmlStr(Object obj) throws Exception{
		JAXBContext context = JAXBContext.newInstance(obj.getClass());
		Marshaller marshaller = context.createMarshaller();
		//编码格式
		marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		//是否格式化生成的xml串
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		//是否省略xml头声明信息
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);
		StringWriter writer = new StringWriter();
		marshaller.marshal(obj, writer);
		return writer.toString();
	}
	
}
