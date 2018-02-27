/**
 * 
 */
package com.comcast.meld.jobcontrol.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import com.comcast.meld.jobcontrol.domain.MeldProgramNm;
import java.util.Collection;
import com.comcast.meld.jobcontrol.services.MeldProgramNmService;
/**
 * @author gmanch001c
 *
 */
@RestController
public class MeldProgramNmController {

	@Autowired
	private MeldProgramNmService meldprogramnmservice;
	
	@RequestMapping(value = "/api/meldprogramnames",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<MeldProgramNm>> getMeldProgramNm(){
		Collection<MeldProgramNm> meldprogramnms = meldprogramnmservice.findAll();		
		return new ResponseEntity<Collection<MeldProgramNm>>(meldprogramnms,HttpStatus.OK);
	}
	
	 @RequestMapping(
	            value = "/api/meldprogramnames/{id}",
	            method = RequestMethod.GET,
	            produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<MeldProgramNm> getGreeting(@PathVariable("id") Integer id) {

		 MeldProgramNm meldprognm = meldprogramnmservice.findOne(id);
	        if (meldprognm == null) {
	            return new ResponseEntity<MeldProgramNm>(HttpStatus.NOT_FOUND);
	        }

	        return new ResponseEntity<MeldProgramNm>(meldprognm, HttpStatus.OK);
	    }
}
