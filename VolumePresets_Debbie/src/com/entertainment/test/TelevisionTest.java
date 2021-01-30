package com.entertainment.test;/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
/*
 * Lab - Composition
 *
 * This class is the main class, i.e., where the application starts.
 *
 * It instantiates a com.entertainment.Television and uses the new channel functionality.
 */

import com.entertainment.DisplayType;
import com.entertainment.Television;
import com.entertainment.VolumeLevel;

class TelevisionTest {
  
  public static void main(String[] args) {

	  Television tv1 = new Television("Sony", 45);
	  tv1.setVolume(24);  // this should still work (as before)
	  System.out.println(tv1);

	  Television tv2 = new Television("LG", 15);
	  tv2.setVolume(VolumeLevel.OFF);  // new functionality
	  System.out.println(tv2);

	  Television tv3 = new Television("Samsung", 15);
	  tv3.setVolume(VolumeLevel.SOFT);  // new functionality
	  System.out.println(tv3);

	  Television tv4 = new Television("Toshiba", 15);
	  tv4.setVolume(VolumeLevel.MEDIUM);  // new functionality
	  System.out.println(tv4);

	  Television tv5 = new Television("Sony", 15);
	  tv5.setVolume(VolumeLevel.LOUD);  // new functionality
	  System.out.println(tv5);

	  Television tv6 = new Television("LG", 15);
	  tv6.setVolume(VolumeLevel.MAX);  // new functionality
	  System.out.println(tv6);
  }
}