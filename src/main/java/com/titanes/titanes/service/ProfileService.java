package com.titanes.titanes.service;


import com.titanes.titanes.model.Profile;
import com.titanes.titanes.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService {

    @Autowired
    ProfileRepository profileRepository;

    public void createProfile(Profile profile){
        profileRepository.save(profile);
    }
    public List<Profile> readProfile(){
        List<Profile> profileList = new ArrayList<Profile>();
        profileList.addAll(profileRepository.findAll());
        return profileList;
    }
    public void updateProfile(Profile profile){
        profileRepository.save(profile);
    }
    public void deleteProfile(Long id){
        profileRepository.deleteById(id);
    }


}
