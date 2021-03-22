package dk.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class StorageController {

    Cache userCache = new Cache();

@GetMapping("/cache")
@ResponseBody
public String getUserData(@RequestParam int key) throws InterruptedException {

   if( userCache.hasCacheInfo(key)) {
       return userCache.getCacheInfo(key);
   } else {
       User newUser = new User(key);
       userCache.setCacheInfo(key, newUser.getDataSlow());
       return userCache.getCacheInfo(key);
   }
}



}





