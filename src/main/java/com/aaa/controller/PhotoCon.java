package com.aaa.controller;

import com.aaa.dao.PhotoDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

@CrossOrigin
@RestController
@RequestMapping("Photo")
public class PhotoCon {
    /*@Resource
    private PhotoDao photoDao;

    //默认获取application文件中的属性值
    @Value("${prop.filepath}")
    String filepath;

    @RequestMapping("add")
    @ResponseBody
    public String addpho(@RequestParam("photo") MultipartFile[] photo)throws IOException {
        for (MultipartFile f:photo){
            //是否选择了文件
            String originalFilename=f.getOriginalFilename();
            if ("".equals(originalFilename)){
                //重命名
                String name="1.png";
                //保存文件
                File file=new File(filepath);
                //判断文件是否存在
                if (!file.exists()){
                    file.mkdirs();
                }
                file=new File(filepath+name);
                //另存为
                f.transferTo(file);
            }
        }
        return "ok";
    }

    @RequestMapping("download")
    public void download(String fileName, HttpServletRequest request, HttpServletResponse response) throws Exception{
        //读取源文件将文件内容响应给浏览器
        File file=new File(filepath+fileName);

        FileInputStream fileInputStream=new FileInputStream(file);

        //设置响应类型
        String mimeType=request.getSession().getServletContext().getMimeType(fileName.substring(fileName.lastIndexOf(1)));
        System.out.println(mimeType);

        response.setContentType(mimeType);

        //浏览器确定如何处理响应内存
        response.setHeader("content-disposition","attachment;fileName="+ URLEncoder.encode("下载文件"+fileName,"UTF-8"));

        ServletOutputStream outputStream=response.getOutputStream();

        //复制文件
        FileCopyUtils.copy(fileInputStream,outputStream);
    }*/
}


