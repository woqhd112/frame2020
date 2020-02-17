package com.bit.plan;

import com.bit.service.*;


public class PlanJaba {

	public static void main(String[] args) {

		Remote remote=new Remote();
//		Remote remote=new Remote(new Tv());
		remote.setRemote(new Radio());
		remote.func3();
	}

}
