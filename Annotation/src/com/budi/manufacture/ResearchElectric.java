package com.budi.manufacture;

import org.springframework.stereotype.Component;

@Component
public class ResearchElectric implements Research {

	@Override
	public String displayResearchStatusStarted() {
		// TODO Auto-generated method stub
		return "Electric research started";
	}

	@Override
	public String displayResearchStatusStopped() {
		// TODO Auto-generated method stub
		return "Electric research stopped";
	}

}
