package com.day;

import java.util.ArrayList;

public class C extends Cs{

	String[] title = { "레옹", "쉰들러리스트", "타이타닉", "기생충", "클래식" };
	String[] director = { "뤽베송", "스필버그", "카메론", "봉준호", "곽재용" };
	String[] genre = { "액션", "드라마", "드라마", "스릴러", "멜로드라마" };
	String[] count = { "100만", "300만", "900만", "1000만", "150만" };
	String[] actor = { "장르노", "리암니슨", "디카프리오", "송강호", "조승우" };
	String[] actress = { "나탈리포트만", "엠베스", "케이트윈슬렛", "조여정", "손예진" };
	String[] time = { "100", "200분", "160분", "120분", "120분" };

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return title.length;
	}
	
	@Override
	public ArrayList<String[]> getArr() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public C(int i) {
		
		setTitle(title[i]);
		setDirector(director[i]);
		setGenre(genre[i]);
		setCount(count[i]);
		setActor(actor[i]);
		setActress(actress[i]);
		setTime(time[i]);
	}
	
	public C() {
		// TODO Auto-generated constructor stub
	}
}
