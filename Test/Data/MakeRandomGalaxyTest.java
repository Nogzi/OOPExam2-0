package Data;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MakeRandomGalaxyTest
{
	@RepeatedTest(10)
	void makeRandomGalaxyTest(){
		Galaxy galaxy = new Galaxy(new LinkedList<>()).makeRandomGalaxy();
		
		assertEquals(2, galaxy.getPlayers().size());
		assertEquals(7, galaxy.getGameSystemList().size());
	}
}
