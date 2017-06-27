package controller;

import domain.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import service.EmpService;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/hello")
    @ResponseBody
    public Emp hello() {
        Emp e = new Emp();
        e.setEmpid(UUID.randomUUID().toString());
        e.setEname("aa");
        e.setPhoto("bb");
        return e;
    }

    @RequestMapping("/add")
    public String add(Emp emp, HttpServletRequest request, @RequestParam("file")MultipartFile file) {
        try {
            saveFile(emp, request, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int result = empService.add(emp);
        return "index";
    }

    @RequestMapping("delete")
    public String delete(String empid) {
        int result = empService.delete(empid);
        return "redirect:/selectByAny?value= ";
    }

    @RequestMapping("save")
    public String save(Emp emp, HttpServletRequest request, @RequestParam("file")MultipartFile file) {
        try {
            saveFile(emp, request, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int result = empService.save(emp);
        return "index";
    }

    @RequestMapping("findByEmpid")
    public String findByEmpid(String empid, Model model) {
        Emp emp = empService.findByEmpid(empid);
        model.addAttribute("emp", emp);
        return "empdetail";
    }

    @RequestMapping("fidByAny")
    public String findByAny(String value, Model model) {
        List<Emp> emps = empService.findByAny(value);
        model.addAttribute("emps", emps);
        return "index";
    }

    private void saveFile(Emp emp, HttpServletRequest request, MultipartFile file) throws Exception {
        if (file != null) {
            byte [] bytes = new byte[file.getInputStream().available()];
            file.getInputStream().read(bytes);
            emp.setPhoto2(bytes);
            emp.setPhoto(file.getOriginalFilename());
            File file1 = new File(request.getServletContext().getRealPath("/images") + "/" + file.getOriginalFilename());
            file.transferTo(file1);
        }
    }

}
