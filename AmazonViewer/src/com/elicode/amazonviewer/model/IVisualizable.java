package com.elicode.amazonviewer.model;

import java.util.Date;

public interface IVisualizable {
	
	Date startToSee(Date dateI );
	void StopToSee(Date dateI, Date dateF);
	

}
