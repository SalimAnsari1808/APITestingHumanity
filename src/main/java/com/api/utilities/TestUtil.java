package com.api.utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Random;

import com.api.modelEngine.IRestResponse;
import com.api.modelRequest.UserDesign.UserDesignUpdateRequest;
import com.api.modelResponse.UserDesign.UserDesignGetResponse;
import com.google.gson.Gson;

public class TestUtil {

	
	public static String randomPassword() {
        // A strong password has Cap_chars, Lower_chars,
        // numeric value and symbols. So we are using all of
        // them to generate our password
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        int rand_int1 = 0;
        String values = Capital_chars + Small_chars + numbers + symbols;

        //Using random method
        Random rndm_method = new Random();

        //get random password length
        while(true){
            rand_int1 = rndm_method.nextInt(25);

            if(rand_int1 > 8){
                break;
            }
        }

        //create length of password
        char[] password = new char[rand_int1];

        for (int i = 0; i < rand_int1; i++){
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] = values.charAt(rndm_method.nextInt(values.length()));
        }

        //return String
        return String.valueOf(password);
	}
	
	
	public static String randomValidEmail() {
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
		   LocalDateTime now = LocalDateTime.now();
		   
		   return dtf.format(now)+"@shreepartners.com";
	}
	
	public static String alphabaticCharacterEmail() {
        // A strong password has Cap_chars, Lower_chars,
        // So we are using all of them to generate our password
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";

        int rand_int1 = 0;
        String values = Capital_chars + Small_chars;

        //Using random method
        Random rndm_method = new Random();

        //get random password length
        while(true){
            rand_int1 = rndm_method.nextInt(25);

            if(rand_int1 > 8){
                break;
            }
        }

        //create length of password
        char[] password = new char[rand_int1];

        for (int i = 0; i < rand_int1; i++){
            // Use of charAt() method : to get character value
            // Use of nextInt() as it is scanning the value as int
            password[i] = values.charAt(rndm_method.nextInt(values.length()));
        }

        //return String
        return String.valueOf(password)+"@shreepartners.com";
	}
	
	
	public static UserDesignUpdateRequest getUserDesignUpdateRequest(IRestResponse<UserDesignGetResponse> userDesignGetResponse) {
		Gson gson = new Gson(); 
		
		String json = gson.toJson(userDesignGetResponse.getResponse().getBody().jsonPath().get("data"), LinkedHashMap.class);

		return gson.fromJson(json, UserDesignUpdateRequest.class);
	}
	
}
