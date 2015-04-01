package iut.tdd;

import junit.framework.Assert;
import org.junit.Test;

public class TestConvert{
	Convert myConvert= new Convert();
	@Test
	public void test_num2text_zero(){
		String input="0"; String expected="zéro";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}
	@Test
	public void test_num2text_un(){
		String input="1"; String expected="un";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}
	@Test
	public void test_num2text_deux(){
		String input="2"; String expected="deux";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}
	@Test
	public void test_num2text_trois(){
		String input="3"; String expected="trois";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}
	@Test
	public void test_num2text_quatre(){
		String input="4"; String expected="quatre";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}
	@Test
	public void test_num2text_cinq(){
		String input="5"; String expected="cinq";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}
	@Test
	public void test_num2text_six(){
		String input="6"; String expected="six";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}	
	@Test
	public void test_num2text_sept(){
		String input="7"; String expected="sept";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}
	@Test
	public void test_num2text_huit(){
		String input="8"; String expected="huit";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}
	@Test
	public void test_num2text_neuf(){
		String input="9"; String expected="neuf";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}
	@Test
	public void test_num2text_dix(){
		String input="10"; String expected="dix";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}
	@Test
	public void test_num2text_onze(){
		String input="11"; String expected="onze";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}
	@Test
	public void test_num2text_douze(){
		String input="12"; String expected="douze";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}
	@Test
	public void test_num2text_treize(){
		String input="13"; String expected="treize";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}
	@Test
	public void test_num2text_quatorze(){
		String input="14"; String expected="quatorze";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}
	@Test
	public void test_num2text_quinze(){
		String input="15"; String expected="quinze";
		Assert.assertEquals(expected,myConvert.num2text(input));
	}
	
	@Test
	public void test_text2num_0(){
		String input="zéro"; String expected="0";
		Assert.assertEquals(expected,myConvert.text2num(input));
	}
	@Test
	public void test_text2num_1(){
		String input="un"; String expected="1";
		Assert.assertEquals(expected,myConvert.text2num(input));
	}
	@Test
	public void test_text2num_2(){
		String input="deux"; String expected="2";
		Assert.assertEquals(expected,myConvert.text2num(input));
	}
	@Test
	public void test_text2num_3(){
		String input="trois"; String expected="3";
		Assert.assertEquals(expected,myConvert.text2num(input));
	}
	@Test
	public void test_text2num_4(){
		String input="quatre"; String expected="4";
		Assert.assertEquals(expected,myConvert.text2num(input));
	}
	@Test
	public void test_text2num_5(){
		String input="cinq"; String expected="5";
		Assert.assertEquals(expected,myConvert.text2num(input));
	}
	@Test
	public void test_text2num_6(){
		String input="six"; String expected="6";
		Assert.assertEquals(expected,myConvert.text2num(input));
	}
	@Test
	public void test_text2num_7(){
		String input="sept"; String expected="7";
		Assert.assertEquals(expected,myConvert.text2num(input));
	}
	@Test
	public void test_text2num_8(){
		String input="huit"; String expected="8";
		Assert.assertEquals(expected,myConvert.text2num(input));
	}
	@Test
	public void test_text2num_9(){
		String input="neuf"; String expected="9";
		Assert.assertEquals(expected,myConvert.text2num(input));
	}
}
