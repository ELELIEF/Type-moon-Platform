package elelief.typemoon.utils;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import com.aliyun.oss.*;
import com.aliyun.oss.common.auth.CredentialsProviderFactory;
import com.aliyun.oss.common.auth.EnvironmentVariableCredentialsProvider;
import com.aliyun.oss.common.comm.SignVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AliyunOSSOperator {

    @Autowired
    private AliyunOSSProperties aliyunOSSProperties;


    public String upload(byte[] bytes, String originalFileName) throws Exception {

        String endpoint = aliyunOSSProperties.getEndpoint();
        String bucketName = aliyunOSSProperties.getBucketName();
        String region = aliyunOSSProperties.getRegion();
        // 从环境变量中获取访问凭证。运行本代码示例之前，请先配置环境变量
        EnvironmentVariableCredentialsProvider credentialsProvider =
                CredentialsProviderFactory.newEnvironmentVariableCredentialsProvider();

        //Object完整路径,如202502/001.jpg.
        //获取系统日期字符串
        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM"));

        //生成一个不重复的文件名字
        String newFileName = UUID.randomUUID() + originalFileName.substring(originalFileName.lastIndexOf("."));
        String objectName = date + "/" + newFileName;


        // 创建 OSSClient 实例
        ClientBuilderConfiguration clientBuilderConfiguration = new ClientBuilderConfiguration();
        // 显式声明使用 V4 签名算法
        clientBuilderConfiguration.setSignatureVersion(SignVersion.V4);
        OSS ossClient = OSSClientBuilder.create()
                .endpoint(endpoint)
                .credentialsProvider(credentialsProvider)
                .region(region)
                .build();
        try {
            // 2. 上传文件
            ossClient.putObject(bucketName, objectName, new ByteArrayInputStream(bytes));
            System.out.println("2. 文件 " + objectName + " 上传成功。");
        } finally {
            ossClient.shutdown();
        }
        return endpoint.split("//")[0] + "//" + bucketName + "." + endpoint.split("//")[1] + "/" + objectName;
    }
}