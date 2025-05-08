package com.example.demo_jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController2 {

  @Autowired
  private StudentRepository studentRepository;

  @GetMapping("/showname2")
  public String showName(Model model) {
    String name = studentRepository.select(1); //DB����f�[�^�擾
    model.addAttribute("name", name); //view�ɂ킽��
    return "showname2"; // �� showname2.html �ɕ\����C����
  }
}
