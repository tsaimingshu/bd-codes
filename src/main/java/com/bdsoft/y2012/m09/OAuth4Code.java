//package com.bdsoft.y2012.m09;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//import weibo4j.Oauth;
//import weibo4j.Users;
//import weibo4j.http.AccessToken;
//import weibo4j.model.User;
//import weibo4j.model.WeiboException;
//import weibo4j.util.BareBonesBrowserLaunch;
//
//public class OAuth4Code {
//
//	public static void main(String[] args) throws WeiboException, IOException {
//		Oauth oauth = new Oauth();
//		BareBonesBrowserLaunch.openURL(oauth.authorize("code"));
//		System.out.println(oauth.authorize("code"));
//		System.out.print("Hit enter when it's done.[Enter]:");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String code = br.readLine();
//		System.out.println("code: " + code);
//		try {
//			AccessToken at = oauth.getAccessTokenByCode(code);
//			System.out.println(at);
//		} catch (WeiboException e) {
//			if (401 == e.getStatusCode()) {
//				System.out.println("Unable to get the access token.");
//			} else {
//				e.printStackTrace();
//			}
//		}
//	}
//
//}
