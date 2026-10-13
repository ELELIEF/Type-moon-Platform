package elelief.typemoon.Controller;

import elelief.typemoon.Service.ComService;
import elelief.typemoon.pojo.BasicCom;
import elelief.typemoon.pojo.CompositionMessage;
import elelief.typemoon.pojo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compositionMessage")
public class CompositionController {
    @Autowired
    private ComService comService;

    @CrossOrigin(origins = "*")
    @ResponseBody
    @GetMapping("/{id}")
    public Result ResponseintroduceMessage(@PathVariable int id) {
        CompositionMessage compositionMessage = comService.getAftercomposition(id);
        return compositionMessage != null ? Result.success(compositionMessage) : Result.error();
    }

    @GetMapping
    public Result getAllCompositionMessages() {
        List<BasicCom> allmessage= comService.selectAll();
        return Result.success(allmessage);
    }

    @DeleteMapping
    public Result deleteComposition(int id) {
        Integer r = comService.deleteById(id);
        return r > 0 ? Result.success() : Result.error();
    }

    @PostMapping
    public Result Insert(@RequestBody CompositionMessage compositionMessage) {
        Integer r = comService.insertComposition(compositionMessage);
        return r > 0 ? Result.success() : Result.error();
    }



}
