package my.example.rest_logic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.example.rest_logic.dao.ProfileDao;
import my.example.rest_logic.entity.Profile;

@Service //mark the implementation of business logic
public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	private ProfileDao profileDao;

	@Override
	public List<Profile> getAllProfiles() {
		//TODO add @Transactional once DB connection established
		return profileDao.getAllProfiles();
	}

	@Override
	public Profile getProfileById(int id) {
		// TODO add @Transactional once DB connection established
		return profileDao.getProfileById(id);
	}

	@Override
	public Profile getProfileByUserName(String userName) {
		// TODO add @Transactional once DB connection established
		return profileDao.getProfileByUserName(userName);
	}

	@Override
	public Profile saveProfile(Profile profile) {
		profile.setId(0);
		return profileDao.saveProfile(profile);
	}

	@Override
	public Profile updateProfile(Profile profile) {
		return profileDao.updateProfile(profile);
	}

	@Override
	public Profile deleteProfile(int profileId) {
		
		return profileDao.deleteProfile(profileId);
	}

}
