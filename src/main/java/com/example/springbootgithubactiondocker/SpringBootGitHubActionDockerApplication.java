package com.example.springbootgithubactiondocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootGitHubActionDockerApplication {

    @GetMapping("/message")
    public String gitAction(){
        return "welcome to the CICD tool using git action";
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootGitHubActionDockerApplication.class, args);
    }

}
//echo "# docker-gitHubAction" >> README.md
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/indarkushwaha42/docker-gitHubAction.git
//        git push -u origin main