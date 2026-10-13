package elelief.typemoon.Controller;

import elelief.typemoon.pojo.Result;
import elelief.typemoon.utils.AliyunOSSOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/upload")
public class UploadController {

    @Autowired
    private AliyunOSSOperator aliyunOSSOperator;

    @PostMapping
    public Result upload(MultipartFile file) throws Exception {
        String url = aliyunOSSOperator.upload(file.getBytes(), file.getOriginalFilename());
        return !url.isEmpty() ? Result.success(url) : Result.error();
    }

}
