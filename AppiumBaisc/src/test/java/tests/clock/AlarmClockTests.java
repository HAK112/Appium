package tests.clock;

import org.testng.annotations.Test;

import pages.AlarmClock;

public class AlarmClockTests extends BaseClassClock {
	AlarmClock alarmClockPage;
	@Test
	public void verifyTime() {
		alarmClockPage = new AlarmClock(driver);
		String solo = alarmClockPage.getAlarmTime();
		System.out.println(solo);
	}
}
