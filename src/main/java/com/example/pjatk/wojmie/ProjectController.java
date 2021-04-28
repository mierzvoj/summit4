package com.example.pjatk.wojmie;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/homework")
public class ProjectController {

    @GetMapping("/homework/{no}")
    public ResponseEntity<String> respondToPathVariable(@PathVariable String no) {
        return ResponseEntity.ok("Response no = " + no);
    }

    @GetMapping("/homework")
    @ResponseBody
    public ResponseEntity<String> respondToRequestBody(@RequestParam String name) {
        return ResponseEntity.ok("Response parameter = " + name);
    }


    @PutMapping("/homework/{id}")
    public ResponseEntity<Student> respondToPut(@PathVariable String id, @RequestBody Student student) {
        //Student student1 = new Student();
        return ResponseEntity.ok(student);
    }

    @PostMapping("/homework")
    public ResponseEntity<Student> postMyData(@RequestBody Student student) {
        //Student student2 = new Student();
        return ResponseEntity.ok(student);

    }


    @DeleteMapping("/homework/{id}")
    public ResponseEntity<String> deleteMyData(@PathVariable String id) {
        return new ResponseEntity<>("status: http 200", HttpStatus.OK);
    }


}
