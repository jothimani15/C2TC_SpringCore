package com.tnsif.Spring_Annotations.App;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class AppConfig {
	
	public MusicTeacher getTeacherInfo() {
		return new MusicTeacher();
	}

}
