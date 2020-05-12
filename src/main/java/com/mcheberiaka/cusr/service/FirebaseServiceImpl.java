package com.mcheberiaka.cusr.service;

import org.springframework.stereotype.Service;

import com.mcheberiaka.cusr.config.auth.firebase.FirebaseTokenHolder;
import com.mcheberiaka.cusr.service.FirebaseService;
import com.mcheberiaka.cusr.service.FirebaseParser;
import com.mcheberiaka.cusr.spring.conditionals.FirebaseCondition;

@Service
@FirebaseCondition
public class FirebaseServiceImpl implements FirebaseService {
	@Override
	public FirebaseTokenHolder parseToken(String firebaseToken) {
		return new FirebaseParser().parseToken(firebaseToken);
	}
}