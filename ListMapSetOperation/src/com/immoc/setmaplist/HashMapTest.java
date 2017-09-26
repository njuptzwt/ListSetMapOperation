package com.immoc.setmaplist;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,String> map=new HashMap<String,String>();
map.put("zehng", "123");
map.put("sjhdj", "178");
System.out.println(map.get("zehng"));
for(String k:map.keySet())
	System.out.println(k);
	}

}
