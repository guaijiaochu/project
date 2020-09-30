package class_library_13;

import java.util.Enumeration;
import java.util.Properties;

/*java不支持全局方法和变量，java设计者将系统相关的方法收集到了System类中。
System所有成员是静态的，引用时可以直接用System类名作为前缀

exit(int status)提前终止虚拟机运行
currentTimeMillis()返回1970年1月1日0点0分0秒至今以毫秒为单位的时间，是long类型的大数值。
getProperties获得当前虚拟机环境属性*/


public class SystemInfo13_2 {

//	打印当前虚拟机所有环境属性的变量和值
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Properties sp=System.getProperties();
		Enumeration e= sp.propertyNames();
		while(e.hasMoreElements()) {
			String key=(String)e.nextElement();
			System.out.println(key+"="+sp.getProperty(key));

		}
	}

}
