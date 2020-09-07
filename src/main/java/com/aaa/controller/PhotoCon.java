package com.aaa.controller;

import com.aaa.dao.PhotoDao;
import com.aaa.entity.Photo;
import com.aaa.util.FileRule;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Photo")
public class PhotoCon {
    @Resource
    private PhotoDao photoDao;

    //默认获取application文件中的属性值
    @Value("${prop.filepath}")
    String staticurl;


    private FileRule fileRule=new FileRule();
    //添加节目数据
    @RequestMapping("insertadphoto")
    public int insertprograminfo(@RequestParam("file") MultipartFile file,Integer pho_state){

        String photourl="";
        try{
            photourl=fileRule.fileupload(staticurl,file);
        }catch (Exception error){
            error.printStackTrace();
        }
        Photo photo=new Photo();
        photo.setPho_photo(photourl);
        photo.setPho_state(pho_state);
        Integer i=photoDao.insert(photo);
        return i;
    }


    @RequestMapping("query")
    @ResponseBody
    public List<Photo>quepho(){
        return photoDao.querypho();
    }

    @RequestMapping("delete")
    @ResponseBody
    public Integer deletepho(Integer pho_id){
        Integer i=photoDao.delpho(pho_id);
        return i;
    }


    @RequestMapping("deleteBatchLogs")
    @ResponseBody
    public String deleteBatchLogs(@RequestBody  String pho_id){
        String[] stuList = pho_id.split(",");
        for(String str : stuList){
            System.out.println(str);
            photoDao.pldel(str);
        }
        return "success";
    }













    /*@RequestMapping("add")
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
    }*/

    /*@RequestMapping("download")
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


