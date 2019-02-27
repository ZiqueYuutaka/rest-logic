package my.example.rest_logic.dao;

import java.util.List;

import my.example.rest_logic.entity.Profile;

public interface ProfileDao {

	/**
	 * Query database for all profiles
	 * @return
	 */
	public List<Profile> getAllProfiles();
	
	/**
	 * Query database for profile by id
	 * @param id
	 * @return
	 */
	public Profile getProfileById(int id);
	
	/**
	 * Query database for profile by username
	 * TODO: needs implementation at the controller and service level
	 * @param userName
	 * @return
	 */
	public Profile getProfileByUserName(String userName);
	
	/**
	 * Saves profile to database
	 * @param profile
	 * @return
	 */
	public Profile saveProfile(Profile profile);
	
	/**
	 * Updates profile to database
	 * @param profile
	 * @return
	 */
	public Profile updateProfile(Profile profile);
	
	/**
	 * Deletes profile by id
	 * @param profileId
	 * @return
	 */
	public Profile deleteProfile(int profileId);
}
