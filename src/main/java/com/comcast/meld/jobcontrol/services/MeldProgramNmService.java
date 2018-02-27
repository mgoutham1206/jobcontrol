/**
 * 
 */
package com.comcast.meld.jobcontrol.services;

import java.util.Collection;


import com.comcast.meld.jobcontrol.domain.MeldProgramNm;

/**
 * @author gmanch001c
 *
 */
public interface MeldProgramNmService {
	
	Collection<MeldProgramNm> findAll();
	
	MeldProgramNm findOne(Integer programId);

}
