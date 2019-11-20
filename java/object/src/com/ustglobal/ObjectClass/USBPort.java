package com.ustglobal.ObjectClass;

public class USBPort {

	public static void connect(Object obj) {
		if(obj instanceof Mouse){
			Mouse m=new Mouse();
			m.click();
			m.scroll();
		}else if(obj instanceof Pendrive){
			Pendrive p=new Pendrive();
			p.read();
			p.write();
		}else{
			System.out.println("invalid object");
		}

	}
}

