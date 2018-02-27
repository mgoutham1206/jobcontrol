package com.comcast.meld.jobcontrol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comcast.meld.jobcontrol.domain.MeldProgramNm;

@Repository
public interface MeldProgramNmRepository extends JpaRepository<MeldProgramNm, Integer> {

}
