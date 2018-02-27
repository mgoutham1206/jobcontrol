package com.comcast.meld.jobcontrol.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comcast.meld.jobcontrol.domain.MeldProgramNm;
import com.comcast.meld.jobcontrol.repositories.MeldProgramNmRepository;

@Service
public class MeldProgramNmServiceBean implements MeldProgramNmService{

	@Autowired
	private MeldProgramNmRepository meldprogramnmrepo;
	
	@Override
	public Collection<MeldProgramNm> findAll() {
		// TODO Auto-generated method stub
		
		Collection<MeldProgramNm> meldprogramnames = meldprogramnmrepo.findAll();
		return meldprogramnames;
	}

	@Override
	public MeldProgramNm findOne(Integer programId) {
		
		MeldProgramNm meldProgName = meldprogramnmrepo.findOne(programId);
		
		return meldProgName;
	}

}
