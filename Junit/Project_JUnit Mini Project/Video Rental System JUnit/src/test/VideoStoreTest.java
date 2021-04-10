package test;

import static org.junit.Assert.*;
import org.junit.Test;
import Video_Rental.VideoStore;
import Video_Rental.Video;
import org.junit.Before;

public class VideoStoreTest {
	VideoStore videoStore;
	String name;
	Video lastAdded;
	int storeSize;
    
	@Before
	public void before() {
		videoStore=new VideoStore();
		name="Matrix";
		storeSize=0;
	}
	
	@Test
	public void testAddVideo() {
		name="Matrix";
		videoStore.addVideo(name);
		storeSize=videoStore.getStoreSize();
		lastAdded=videoStore.getLastAdded();
		assertEquals(1,storeSize);
		assertEquals(name,lastAdded.getName());
		
		name="Pixxe";
		videoStore.addVideo(name);
		storeSize=videoStore.getStoreSize();
		lastAdded=videoStore.getLastAdded();
		assertEquals(2,storeSize);
		assertEquals(name,lastAdded.getName());
		
	}
	
    @Test
    public void testDoCheckout() {
    	videoStore.addVideo(name);
    	videoStore.getLastAdded().doCheckout();
    	assertTrue(videoStore.getLastAdded().getCheckout());
    }
    
    @Test
    public void testDoReturn() {
    	videoStore.addVideo(name);
    	videoStore.getLastAdded().doReturn();
    	assertFalse(videoStore.getLastAdded().getCheckout());
    }
    
    @Test
    public void testReceiveRating() {
    	videoStore.addVideo(name);
    	videoStore.receiveRating(name, 5);
    	lastAdded=videoStore.getLastAdded();
    	assertEquals(5,lastAdded.getRating());
    }
    
    @Test
    public void testListInventory() {
    	try {
    		videoStore.listInventory();
    		assertFalse(false);
    	}
    	catch(Exception e) {
    		assertFalse(true);
    	}
    }
}
