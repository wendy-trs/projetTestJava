package fr.isika.testprojet.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestprojetJavaApplicationTests {

	@Autowired
	private TestProjetService testProjetService;

	  @Test
	  public void testSaisie() throws Exception {
	      assertEquals("Votre saisie : aa", testProjetService.getMessage("aa"));
	  }
}
