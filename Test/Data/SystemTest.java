package Data;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SystemTest
{
	@Test
	void SystemTest(){
		Player player = new Player("Felix","Human","Red");
		Planet planet1 = new Planet(player, 2, "Something", Coordinates.CENTER);
		Planet planet2 = new Planet(null,3,"something2",Coordinates.NORTH);
		Carrier carrier1 = new Carrier(player);
		Dreadnought dreadnought1 = new Dreadnought(player);
		Set<Planet>p = new Set<Planet>()
		{
			@Override
			public int size()
			{
				return 0;
			}
			
			@Override
			public boolean isEmpty()
			{
				return false;
			}
			
			@Override
			public boolean contains(Object o)
			{
				return false;
			}
			
			@Override
			public Iterator<Planet> iterator()
			{
				return null;
			}
			
			@Override
			public Object[] toArray()
			{
				return new Object[0];
			}
			
			@Override
			public <T> T[] toArray(T[] a)
			{
				return null;
			}
			
			@Override
			public boolean add(Planet planet)
			{
				return false;
			}
			
			@Override
			public boolean remove(Object o)
			{
				return false;
			}
			
			@Override
			public boolean containsAll(Collection<?> c)
			{
				return false;
			}
			
			@Override
			public boolean addAll(Collection<? extends Planet> c)
			{
				return false;
			}
			
			@Override
			public boolean retainAll(Collection<?> c)
			{
				return false;
			}
			
			@Override
			public boolean removeAll(Collection<?> c)
			{
				return false;
			}
			
			@Override
			public void clear()
			{
			
			}
		};
		List<Units>u = new List<Units>()
		{
			@Override
			public int size()
			{
				return 0;
			}
			
			@Override
			public boolean isEmpty()
			{
				return false;
			}
			
			@Override
			public boolean contains(Object o)
			{
				return false;
			}
			
			@Override
			public Iterator<Units> iterator()
			{
				return null;
			}
			
			@Override
			public Object[] toArray()
			{
				return new Object[0];
			}
			
			@Override
			public <T> T[] toArray(T[] a)
			{
				return null;
			}
			
			@Override
			public boolean add(Units units)
			{
				return false;
			}
			
			@Override
			public boolean remove(Object o)
			{
				return false;
			}
			
			@Override
			public boolean containsAll(Collection<?> c)
			{
				return false;
			}
			
			@Override
			public boolean addAll(Collection<? extends Units> c)
			{
				return false;
			}
			
			@Override
			public boolean addAll(int index, Collection<? extends Units> c)
			{
				return false;
			}
			
			@Override
			public boolean removeAll(Collection<?> c)
			{
				return false;
			}
			
			@Override
			public boolean retainAll(Collection<?> c)
			{
				return false;
			}
			
			@Override
			public void clear()
			{
			
			}
			
			@Override
			public Units get(int index)
			{
				return null;
			}
			
			@Override
			public Units set(int index, Units element)
			{
				return null;
			}
			
			@Override
			public void add(int index, Units element)
			{
			
			}
			
			@Override
			public Units remove(int index)
			{
				return null;
			}
			
			@Override
			public int indexOf(Object o)
			{
				return 0;
			}
			
			@Override
			public int lastIndexOf(Object o)
			{
				return 0;
			}
			
			@Override
			public ListIterator<Units> listIterator()
			{
				return null;
			}
			
			@Override
			public ListIterator<Units> listIterator(int index)
			{
				return null;
			}
			
			@Override
			public List<Units> subList(int fromIndex, int toIndex)
			{
				return null;
			}
		};
		p.add(planet1);
		u.add(carrier1);
		
		GameSystem gameSystem = new GameSystem(Coordinates.CENTER,p,u);
		
		//assertEquals(1, gameSystem.planetSet.size());
		assertEquals(1, gameSystem.findShips());
		assertTrue(gameSystem.location == Coordinates.CENTER);
		
	}
}