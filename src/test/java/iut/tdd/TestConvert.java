package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num2text_zero() {

		Assert.assertEquals("zéro", Convert.num2text("0"));
	}
	@Test
	public void test_num2text_un() {

		Assert.assertEquals("un", Convert.num2text("1"));
	}
	@Test
	public void test_num2text_deux() {

		Assert.assertEquals("deux", Convert.num2text("2"));
	}
	@Test
	public void test_num2text_trois() {

		Assert.assertEquals("trois", Convert.num2text("3"));
	}
	@Test
	public void test_num2text_quatre() {

		Assert.assertEquals("quatre", Convert.num2text("4"));
	}
	@Test
	public void test_num2text_cinq() {

		Assert.assertEquals("cinq", Convert.num2text("5"));
	}
	@Test
	public void test_num2text_six() {

		Assert.assertEquals("six", Convert.num2text("6"));
	}
	@Test
	public void test_num2text_sept() {

		Assert.assertEquals("sept", Convert.num2text("7"));
	}
	@Test
	public void test_num2text_huit() {

		Assert.assertEquals("huit", Convert.num2text("8"));
	}
	@Test
	public void test_num2text_neuf() {

		Assert.assertEquals("neuf", Convert.num2text("9"));
	}
	@Test
	public void test_num2text_dix() {

		Assert.assertEquals("dix", Convert.num2text("10"));
	}
	@Test
	public void test_num2text_dix_sept() {

		Assert.assertEquals("dix-sept", Convert.num2text("17"));
	}
	@Test
	public void test_num2text_dix_huit() {

		Assert.assertEquals("dix-huit", Convert.num2text("18"));
	}
	@Test
	public void test_num2text_dix_neuf() {

		Assert.assertEquals("dix-neuf", Convert.num2text("19"));
	}
	@Test
	public void test_num2text_vingt() {

		Assert.assertEquals("vingt", Convert.num2text("20"));
	}
	@Test
	public void test_num2text_vingt_et_un() {

		Assert.assertEquals("vingt-et-un", Convert.num2text("21"));
	}
	@Test
	public void test_num2text_vingt_sept() {

		Assert.assertEquals("vingt-sept", Convert.num2text("27"));
	}
	@Test
	public void test_num2text_trente_trois() {

		Assert.assertEquals("trente-trois", Convert.num2text("33"));
	}
	@Test
	public void test_num2text_quanrante_deux() {

		Assert.assertEquals("quarante-deux", Convert.num2text("42"));
	}
	@Test
	public void test_num2text_soixante_neuf() {

		Assert.assertEquals("soixante-neuf", Convert.num2text("69"));
	}
	@Test
	public void test_num2text_soixante_quatorze() {

		Assert.assertEquals("soixante-quatorze", Convert.num2text("74"));
	}
	@Test
	public void test_num2text_soixante_dix_neuf() {

		Assert.assertEquals("soixante-dix-neuf", Convert.num2text("79"));
	}
	@Test
	public void test_num2text_quatre_vingt_trois() {

		Assert.assertEquals("quatre-vingt-trois", Convert.num2text("83"));
	}
	@Test
	public void test_num2text_quatre_vingt_dix_neuf() {

		Assert.assertEquals("quatre-vingt-dix-neuf", Convert.num2text("99"));
	}
	@Test
	public void test_num2text_cent() {

		Assert.assertEquals("cent", Convert.num2text("100"));
	}
	@Test
	public void test_num2text_cent_quatre_vingt_quatorze() {

		Assert.assertEquals("cent-quatre-vingt-quatorze", Convert.num2text("194"));
	}
	@Test
	public void test_getUnite_trente_trois() {
		
		Assert.assertEquals("trois", Convert.getUnite(33));
	}
	@Test
	public void test_getDizaine_trente_trois() {
		
		Assert.assertEquals("trente", Convert.getDizaine(33));
	}
	@Test
	public void test_getCentaine_trois_cent_trente_trois() {
		
		Assert.assertEquals("trois cent", Convert.getCentaine(333));
	}

}
