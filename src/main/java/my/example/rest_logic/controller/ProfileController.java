package my.example.rest_logic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.example.rest_logic.entity.Profile;
import my.example.rest_logic.service.ProfileService;

/**
 * Demo rest controller
 * 
 * @author Izak Wood-Ferren
 *
 */
@RestController
@RequestMapping("/api")
public class ProfileController {
	@Autowired
	private ProfileService profileService;

	// Get all profiles
	@GetMapping("/profiles")
	public List<Profile> getProfiles() {
		System.out.println("===>>>Getting all profiles");

		return profileService.getAllProfiles();
	}

	// Get single profile by id
	@GetMapping("/profiles/{profileId}")
	public Profile getProfileById(@PathVariable int profileId) {
		System.out.println("===>>>Getting profile by id " + profileId);

		return profileService.getProfileById(profileId);
	}

	// Get single profile by username
	//NOT WORKING - AMBIGUOUS METHOD CALL LOL
	///@GetMapping("/profiles/{userName}")
	///public Profile getProfileByUserName(@PathVariable String userName) {
	///	System.out.println("===>>>Getting profile by username " + userName);
    ///
	///	return profileService.getProfileByUserName(userName);
	///}

	// Create new profile
	@PostMapping("/profiles")
	public Profile saveProfile(@RequestBody Profile profile){
		System.out.println("===>>>Posting new profile " +profile);
		
		return profileService.saveProfile(profile);
	}

	// Update existing profile
	@PutMapping("/profiles")
	public Profile updateProfile(@RequestBody Profile profile){
		
		System.out.println("===>>>Updating profile " + profile);
		
		return profileService.updateProfile(profile);
	}

	// Delete existing profile if it exists
	@DeleteMapping("/profiles/{profileId}")
	public Profile deleteProfile(@PathVariable int profileId){
		System.out.println("===>>>Deleting profile with id " + profileId);
		return profileService.deleteProfile(profileId);
	}

}
