package com;

import java.util.Comparator;
//	Class SizeComparator implements Comparator to Compare between two objects
public class SizeComparator implements Comparator<HDTV>{
	//	Overriding the compare method of the Comparator Interface
	//	@param obj0 = First HDTV Object in the comparison
	//	@param obj1 = Second HDTV Object in the comparison
	@Override
	public int compare(HDTV obj0, HDTV obj1) {
		
		HDTV hdtv1 = obj0;					//	User defined object 1
		HDTV hdtv2 = obj1;					//	User defined object 2
		
		if(hdtv1.getSize() < hdtv2.getSize()){		//	Comparing the values of the object for which the user desires
			return -1;
		} else if(hdtv1.getSize() > hdtv2.getSize()){
			return 1;
		} else {
			return 0;
		}
	}
}