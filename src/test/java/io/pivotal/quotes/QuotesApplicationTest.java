package io.pivotal.quotes;


import org.junit.Test;
import org.junit.runner.RunWith;
// JLS Spring 5
// import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Tests for the Quotes Application.
 * @author David Ferreira Pinto
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = QuotesApplication.class)
public class QuotesApplicationTest {

	/**
	 * test loading of spring context.
	 */
	@Test
	public void contextLoads() {
	}
}
