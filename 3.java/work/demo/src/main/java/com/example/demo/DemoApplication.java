package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@configuration : 이 클래스가 설정팔임을 알려주는 용도의 이노테이션
//@componentscan : 자동으로 컴포넌트 클래스를 검색하여 컴포넌트의 빈(bean) 클래스를 등록한다.
//@EnavleAutoConfiguration : 스프링의 다양한 설정이 자동으로 구성되고 완료된다.
public class DemoApplication {
	//main메서드가 서버를 돌린다.
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
