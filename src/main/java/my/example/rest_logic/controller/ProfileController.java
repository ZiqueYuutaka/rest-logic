package my.example.rest_logic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.example.rest_logic.entity.Profile;
import my.example.rest_logic.service.ProfileService;

/**
 * Demo rest controller
 * @author Izak Wood-Ferren
 *
 */
@RestController
@RequestMapping("/api")
public class ProfileController {
	@Autowired
	private ProfileService profileService;
	
	//Get all profiles
	@GetMapping("/profiles")
	public List<Profile> getProfiles(){
		System.out.println("===>>>Getting all profiles");
		
		return profileService.getAllProfiles();
	}
	
	//Get single profile by id
	@GetMapping("/profiles/{profileId}")
	public Profile getProfileById(@PathVariable int profileId){
		System.out.println("===>>>Getting profile by id " + profileId);
		
		return profileService.getProfileById(profileId);
	}
	
	//Get single profile by username
		@GetMapping("/profiles/{userName}")
		public Profile getProfileByUserName(@PathVariable String userName){
			System.out.println("===>>>Getting profile by username " + userName);
			
			return profileService.getProfileByUserName(userName);
		}
	
	//Create new profile
	
	//Update existing profile
	
	//Delete existing profile if it exists

}
