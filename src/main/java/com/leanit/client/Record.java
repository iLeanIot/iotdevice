package com.leanit.client;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Record {
	private String sessionid;
	private Date startTime;
	private Date endTime;
	
}
