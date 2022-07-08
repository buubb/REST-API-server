package com.example.controller;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class kakaoAPI {
	
	public HashMap<String, Object> getUserInfo(String accessToken) {
		HashMap<String, Object> userInfo = new HashMap<String, Object>();
		String reqUrl = "https://kapi.kakao.com/v2/user/me";
		try {
			URL url = new URL(reqUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Authorization, "Bearer " + accessToken);
			int responseCode = conn.getResponseCode();
			System.out.println("responseCode" + responseCode);
		} catch (Exception e) {
			
		}
		return null;
	}
	public String getAccessToken(String code) {
		return null;
	}

}
