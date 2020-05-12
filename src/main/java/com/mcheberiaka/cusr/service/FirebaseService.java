package com.mcheberiaka.cusr.service;

import com.mcheberiaka.cusr.config.auth.firebase.FirebaseTokenHolder;

public interface FirebaseService {
	FirebaseTokenHolder parseToken(String idToken);
}
