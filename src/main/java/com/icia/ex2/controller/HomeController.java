package com.icia.ex2.controller;

import com.icia.ex2.dto.StudentDTO;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hello1")
    public String hello1() {
        return "hello1";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "hello2";
    }


//    @RequestMapping(value = "/hello-param1", method = RequestMethod.GET)
//    public String helloParam1(HttpServletRequest request,

    @GetMapping("/hello-param1")
    public String helloParam1(@RequestParam("name") String name, @RequestParam("age") int age) {
        System.out.println(" name = " + name + ", age =" + age);
        return "index";
    }


//    public String helloparam1(HttpServletRequest request) {
//
//        String name = request.getParameter("name");
//        String age = request.getParameter("age");
//            System.out.println("name = " + name);
//            System.out.println("age = " + age);
//
//            System.out.println("request.getMethod() = " + request.getMethod());
//            System.out.println("request.getRequestURL() = " + request.getRequestURL());
//
//            return "index";
//}


    @GetMapping("/form-param1")
    public String fomrParam1(@RequestParam("p1") String p1, @RequestParam("p2") String p2) {
        System.out.println(" p1 = " + p1 + ", p2 =" + p2);
        return "index";

    }
// 파라미터 랑 변수랑 같으면 생략가능
    @PostMapping("/form-param2")
    public String formParam2(@RequestParam String p3, @RequestParam String p4) {
        System.out.println("p3 = " + p3 + ", p4 =" + p4);
        return "index";

    }

    @GetMapping("/hello3")
// 화면의 데이터를 저장하고 싶을 때 model 사용
    public String hello3(Model model) {
        String s1 = "안녕하세요";
        model.addAttribute("m1", s1);
        return "hello3";
    }

    @GetMapping("/hello4")
    public String hello4(Model model) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("학생1");
        studentDTO.setStudentNumber("12341234");
        model.addAttribute("student", studentDTO);
        return "hello4";
    }

    // hello5 요청을 처리하는 메서드
    // 실행내용 : StudentDTO 객체를 담는 ArrayList 를 선언하고 학생 2명의 정보를 리스트에 저장 후
    // 리스트를 모델에 담자


    @GetMapping("/hello5")
    public String hello5(Model model) {

        List<StudentDTO> studentDTOList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            StudentDTO studentDTO = newStudent(i);
            studentDTOList.add(studentDTO);

            // studentDTOList.add(newStudent(i)); 위 두줄 대신, 한줄로 가능
        }
        model.addAttribute("studentList", studentDTOList);
        return "hello5";

//        StudentDTO studentDTO = new StudentDTO();
//        studentDTO.setId(1L);
//        studentDTO.setStudentName("학생1");
//        studentDTO.setStudentNumber("1111111");
//        studentDTOList.add(studentDTO);

//        studentDTO = new StudentDTO();
//        studentDTO.setId(2L);
//        studentDTO.setStudentName("학생2");
//        studentDTO.setStudentNumber("1111112");
//        studentDTOList.add(studentDTO);









    }
        private StudentDTO newStudent (int i){

            StudentDTO studentDTO = new StudentDTO();
            studentDTO.setId((long) i);
            studentDTO.setStudentName("학생" + i);
            studentDTO.setStudentNumber("111111" + i);
            return studentDTO;


        }





}



