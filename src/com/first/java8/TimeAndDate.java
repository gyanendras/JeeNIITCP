package com.first.java8;

import java.time.Duration;
import java.time.Instant;

import com.first.java8.test.FileHandlerTest;

public class TimeAndDate {

	public void getDuration() {
		Instant beginExec= Instant.now();
		FileHandlerTest fht = new FileHandlerTest();
		fht.testFileDisplay();
		Instant endExec= Instant.now();
		Duration timeElapsed = Duration.between(beginExec, endExec);
		System.out.println(timeElapsed.toMillis());
		
	}

}
