package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Video_Rental.Video;

public class VideoTest {
    Video video;
    String videoName;
    int rating;
    
    @Before
    public void before() {
    	videoName="Matrix";
    	rating=5;
    	video=new Video(videoName);
    }
    
	@Test
	public void testGetName() {
		assertEquals(videoName,video.getName());
	}
    
	@Test
	public void testDoCheckout() {
		video.doCheckout();
		assertTrue(video.getCheckout());
	}
	
	@Test
	public void testDoReturn() {
		video.doReturn();
		assertFalse(video.getCheckout());
	}
	
	@Test
	public void testGetRating() {
		video.receiveRating(rating);
		assertEquals(rating,video.getRating());
	}
	
	@Test
	public void testGetCheckout() {
		video.doCheckout();
		assertTrue(video.getCheckout());
		video.doReturn();
		assertFalse(video.getCheckout());
	}
}
