import static org.junit.Assert.assertThat;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;

class TestChiffresRomain {

	@Test
	void testIsIII() {
		assertThat(ChiffreRomain.ConversionChiffreRomain(3), Is.is("III"));
	}
	
	@Test
	void testIsIV() {
		assertThat(ChiffreRomain.ConversionChiffreRomain(4), Is.is("IV"));
	}
	
	@Test
	void testIsVII() {
		assertThat(ChiffreRomain.ConversionChiffreRomain(7), Is.is("VII"));
	}
	
	@Test
	void testIsIX() {
		assertThat(ChiffreRomain.ConversionChiffreRomain(9), Is.is("IX"));
	}
	
	@Test
	void testIsX() {
		assertThat(ChiffreRomain.ConversionChiffreRomain(10), Is.is("X"));
	}
	
	@Test
	void testIsXVII() {
		assertThat(ChiffreRomain.ConversionChiffreRomain(17), Is.is("XVII"));
	}
	
	@Test
	void testIsXXX() {
		assertThat(ChiffreRomain.ConversionChiffreRomain(30), Is.is("XXX"));
	}
	
	@Test
	void testIsXXXVIII() {
		assertThat(ChiffreRomain.ConversionChiffreRomain(38), Is.is("XXXVIII"));
	}
	
	@Test
	void testIsCDLXXIX() {
		assertThat(ChiffreRomain.ConversionChiffreRomain(479), Is.is("CDLXXIX"));
	}
	
	@Test
	void testIsMMMCMXCIX() {
		assertThat(ChiffreRomain.ConversionChiffreRomain(3999), Is.is("MMMCMXCIX"));
	}

}
