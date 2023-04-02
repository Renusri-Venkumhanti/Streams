package Intrerview;

import java.util.ArrayList;
import java.util.List;

public class SplitString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String desc = "My name Renusree My name Renusree";
		char delimiter =' ';
		String temp ="";
		List<String> list = new ArrayList<>();
		for(int i=0;i<desc.length();i++) {
			if(desc.charAt(i)!=delimiter) {
				temp= temp+desc.charAt(i);
			}else {
				list.add(temp);
				temp="";
			}
		}
		list.add(temp);
		
		System.out.println(list);
	}

}
