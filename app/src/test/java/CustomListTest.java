import static org.testng.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        //System.out.println(listSize);
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }
    
    @org.junit.Test
    public void testHasCity() {
        createList();
        Assertions.assertEquals(0, list.getCount());

        City city = new City("Regina", "Saskatchewan");
        assertFalse(list.hasCity(city));
        assertTrue(list.hasCity(city);
    }

    @org.junit.Test
    public void testDelete() {
        createList();
        City city = new City("Regina", "Saskatchewan");
        list.add(city);
        Assertions.assertEquals(1, list.getCount());
        list.delete(city);
        Assertions.assertEquals(0, list.getCount());
        assertFalse(list.hasCity(city));

    }

    @org.junit.Test
    public void testCountCities() {
        createList();
        City city = new City("Regina", "Saskatchewan");
        list.add(city);
        Assertions.assertEquals(1, list.countCities());
        list.delete(city);
        Assertions.assertEquals(0, list.countCities());
    }
}
