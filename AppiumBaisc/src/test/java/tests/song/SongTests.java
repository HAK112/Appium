package tests.song;

import org.testng.annotations.Test;

import pages.PlayingSong;
import pages.SongMenu;

public class SongTests extends BaseClassSong {
	SongMenu songMenuPage;
	PlayingSong currentSongPage;
	@Test
	public void songVerification() {
		songMenuPage = new SongMenu(driver);
		currentSongPage = new PlayingSong(driver);
		System.out.println(driver.currentActivity());
		songMenuPage.clickOnCurrentSong();
		System.out.println(driver.currentActivity());
		System.out.println(currentSongPage.getSongName());
	}
}
