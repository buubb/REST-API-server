package com.example.controller;

/*7/7 03:24 이유빈
 참고 url : https://suyeoniii.tistory.com/79?category=858035
 참고 url : https://velog.io/@shwncho/Spring-Boot-%EC%B9%B4%EC%B9%B4%EC%98%A4-%EB%A1%9C%EA%B7%B8%EC%9D%B8-APIoAuth-2.0#5-access_token-%EB%B0%9B%EA%B8%B0
 카카오 간편 로그인 접속 주소 : https://kauth.kakao.com/oauth/authorize?client_id=7faa972eec111484c56a4b95aa275f2e&redirect_uri=http://localhost:8000/sungshinplanit/kakao/callback&response_type=code*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/sungshinplanit")
public class UserController {

	/**
	 * 카카오 callback [GET] /sungshinplanit/kakao/callback
	 */
	@ResponseBody
	@GetMapping("/kakao")
	public void kakaoCallback(@RequestParam String code) {
		System.out.println(code);
	}
}
