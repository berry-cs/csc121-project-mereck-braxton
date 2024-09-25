import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {
	//left 
	Posn loc1 = new Posn(198,200);
	Player p1 = new Player(loc1);

	//right
	Posn loc2 = new Posn(202,200);
	Player p2 = new Player(loc2);


	//up
	Posn loc3 = new Posn(200,198);
	Player p3 = new Player(loc3);

	//down
	Posn loc4 = new Posn(200,202);
	Player p4 = new Player(loc4);

	Posn loc5 = new Posn(200,200);
	Player p5 = new Player(loc5);




	@Test
	void testUpdateLeft() {
		p5.update(37);
		Posn expectedPos = new Posn(198, 200); 
		assertEquals(expectedPos, p5.loc);    
	}

	@Test
	void testUpdateRight() {
		p5.update(39);
		Posn expectedPos = new Posn(202, 200); 
		assertEquals(expectedPos, p5.loc);    
	}

	@Test
	void testUpdateUp() {
		p5.update(38);
		Posn expectedPos = new Posn(200, 198); 
		assertEquals(expectedPos, p5.loc);     
	}

	@Test
	void testUpdateDown() {
		p5.update(40);
		Posn expectedPos = new Posn(200, 202); 
		assertEquals(expectedPos, p5.loc);    
	}

}
