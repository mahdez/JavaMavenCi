package com.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.Calculate;

public class CalculateTest {
	
	public int score;
	public Calculate cal;
	
	@Before
	public void initScoreZero() {
		this.score = 0;
	}
	
	@Before
	public void initCalculateClass() {
		this.cal = new Calculate();
	}
	@Test
	public void getScoreFromSetScoreByScore100() {
		this.score = 100;
		
		int expected = 100;
		
		cal.setScore(this.score);
		int actual = cal.getScore();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void getScoreFromSetScoreByScore0() {
		this.score = 0;
		
		int expected = 0;
		
		cal.setScore(this.score);
		int actual = cal.getScore();
		
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void GradeAFromSetScoreAndCalculateByScore100() {
		this.score = 100;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void GradeAFromSetScoreAndCalculateByScore90() {
		this.score = 90;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void GradeAFromSetScoreAndCalculateByScore80() {
		this.score = 80;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void GradeBPlusFromSetScoreAndCalculateByScore79() {
		this.score = 79;
		
		String expected = "B+";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void GradeBFromSetScoreAndCalculateByScore70() {
		this.score = 70;		
		String expected = "B";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void GradeCPlusFromSetScoreAndCalculateByScore69() {
		this.score = 69;		
		String expected = "C+";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void GradeCPlusFromSetScoreAndCalculateByScore65() {
		this.score = 65;		
		String expected = "C+";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void GradeCFromSetScoreAndCalculateByScore60() {
		this.score = 60;		
		String expected = "C";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void GradeDPlusFromSetScoreAndCalculateByScore59() {
		this.score = 59;		
		String expected = "D+";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void GradeDPlusFromSetScoreAndCalculateByScore55() {
		this.score = 55;		
		String expected = "D+";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void GradeCFromSetScoreAndCalculateByScore50() {
		this.score = 50;		
		String expected = "D";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void GradeFSetScoreAndCalculateByScore49() {
		this.score = 49;		
		String expected = "F";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void GradeFSetScoreAndCalculateByScore20() {
		this.score = 20;		
		String expected = "F";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void GradeFSetScoreAndCalculateByScore0() {
		this.score = 0;		
		String expected = "F";
		
		cal.setScore(this.score);
		String actual = cal.CalculateGrade();
		
		Assert.assertEquals(expected, actual);
	}


}
