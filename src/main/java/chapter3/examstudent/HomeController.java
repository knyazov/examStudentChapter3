package chapter3.examstudent;

import chapter3.examstudent.db.DBManager;
import chapter3.examstudent.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final DBManager db;

    @GetMapping(value = "/")
    public String indexPage(Model model) {
        model.addAttribute("students", db.getStudents());
        return "index";
    }

    @GetMapping(value = "/addStudent")
    public String addStudent() {
        return "addStudent";
    }

    @PostMapping(value = "/addStudent")
    public String addStudent(@RequestParam(name = "sName", defaultValue = "") String name,
                             @RequestParam(name = "sSurname", defaultValue = "") String surname,
                             @RequestParam(name = "sExam", defaultValue = "") int exam) {
        Student student = new Student(null, name, surname, exam);
        db.addStudent(student);
        return "redirect:/";
    }
}