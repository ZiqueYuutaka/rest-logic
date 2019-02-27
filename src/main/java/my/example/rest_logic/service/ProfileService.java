package my.example.rest_logic.service;

import java.util.List;

import my.example.rest_logic.entity.Profile;

/**
 * Data manipulation layer for profile objects
 * @author Izak Wood-Ferren
 *
 */
public interface ProfileService {
	
	/**
	 * Returns all profiles in the DB
	 * @return
	 */
	public List<Profile> getAllProfiles();
	
	/**
	 * Returns a specific profile by id
	 * @param id
	 * @return
	 */
	public Profile getProfileById(int id);
	
	/**
	 * Returns a specific profile by userName
	 * @param userName
	 * @return
	 */
	public Profile getProfileByUserName(String userName);
	
	/**
	 * Save profile to DB
	 * @param profile
	 * @return
	 */
	public Profile saveProfile(Profile profile);
	
	/**
	 * Update profile in DB if it exists
	 * @param profile
	 * @return
	 */
	public Profile updateProfile(Profile profile);
	
	/**
	 * Delete profile in DB if id matches
	 * @param profileId
	 * @return
	 */
	public Profile deleteProfile(int profileId);

}
