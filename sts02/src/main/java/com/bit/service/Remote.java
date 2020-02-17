package com.bit.service;


//의존주입
public class Remote {
	Machine remote;

//	public Remote(Machine remote) {
//		
//		this.remote=remote;
//	}
	
	public void setRemote(Machine remote) {
		this.remote = remote;
	}
	
	
	
	public void func1() {
		
		Tv tv=new Tv();
		tv.on();
		tv.work();
		tv.off();
		
	}
	
	public void func2() {
		
		Radio radio=new Radio();
		radio.on();
		radio.work();
		radio.off();
	}
	
	public void func3() {
		
		remote.on();
		remote.work();
		remote.off();
	}
}
