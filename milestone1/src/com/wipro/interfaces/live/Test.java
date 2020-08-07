package com.wipro.interfaces.live;
import com.wipro.interfaces.music.*;
import com.wipro.interfaces.music.string.*;
import com.wipro.interfaces.music.wind.*;
public class Test {

	public static void main(String[] args) 
	{
		Playable veenaobject=new Veena();
		Playable saxophoneobject=new Saxophone();
		veenaobject.play();
		saxophoneobject.play();
	}

}
