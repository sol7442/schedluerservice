package test.wowsanta.service;

import java.lang.management.CompilationMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.OperatingSystemMXBean;
import java.util.Set;

import javax.management.MBeanAttributeInfo;
import javax.management.MBeanInfo;
import javax.management.MBeanServer;
import javax.management.ObjectName;

import org.junit.Test;

public class SchedulerServiceTest {

	@Test
	public void run(){
	   
		try{
			MBeanServer  msrv    = ManagementFactory.getPlatformMBeanServer();
			Set<ObjectName> mbeans = msrv.queryNames(null, null);
			for (ObjectName oname : mbeans)
			{
				System.out.println("["+oname+"]");
//				MBeanInfo mb_info = msrv.getMBeanInfo(oname);
//				MBeanAttributeInfo[] attrInfo = mb_info.getAttributes();
//				for (MBeanAttributeInfo mBeanAttributeInfo : attrInfo) {
//					System.out.println(mBeanAttributeInfo.getName() + ":" + mBeanAttributeInfo.getType() + ":" + mBeanAttributeInfo.getDescription());
//				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
//
//		private void WriteAttributes(final MBeanServer mBeanServer, final ObjectName http)
//		        throws InstanceNotFoundException, IntrospectionException, ReflectionException
//		{
//		    MBeanInfo info = mBeanServer.getMBeanInfo(http);
//		    MBeanAttributeInfo[] attrInfo = info.getAttributes();
//
//		    System.out.println("Attributes for object: " + http +":\n");
//		    for (MBeanAttributeInfo attr : attrInfo)
//		    {
//		        System.out.println("  " + attr.getName() + "\n");
//		    }
//		}
		
		
//	    String[] domains = mbs.getDomains();
//	    for (String string : domains) {
//			System.out.println("Domain :" + string);
//		}
//	    
////	   OperatingSystemMXBean os_bean   = 
//	   
//	   OperatingSystemMXBean os_bean = ManagementFactory.getOperatingSystemMXBean();
//	   System.out.println(os_bean.getAvailableProcessors());
//	   
////	   
//	   MBeanServer  msrv    = ManagementFactory.getPlatformMBeanServer();
//	   String[] domains = msrv.getDomains();
//	   for (String string : domains) {
//		   System.out.println("Domain :" + string);
//	   }
//	   System.out.println("count :" + msrv.getMBeanCount());
//	   
//	   MemoryMXBean mbean = ManagementFactory.getMemoryMXBean();
//	   CompilationMXBean cbean = ManagementFactory.getCompilationMXBean();
//	   
//	   int count = 0;
//	   while(count < 10){
//		   System.out.println("["+count+"]:heap  :" + mbean.getHeapMemoryUsage().getUsed());
//		   System.out.println("["+count+"]:nheap :" +mbean.getNonHeapMemoryUsage().getUsed());
//		   System.out.println("["+count+"]:nheap :" +cbean.getTotalCompilationTime());
//		   
//		   count++;
//		   try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	   }
	   
//	   count = 0;
//	   
//	   while(count < 10){
//		   System.out.println("["+count+"]:heap  :" + cbean.getTotalCompilationTime());
//		   count++;
//		   try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	   }

	}
}
