package com.aaa.controller;

import com.aaa.dao.CertificateDao;
import com.aaa.entity.Certificate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("Certificate")
public class CertificateCon {
    @Resource
    private CertificateDao certificateDao;

    @RequestMapping("query")
    @ResponseBody
    public List<Certificate>quecer(Integer res_id){
        List<Certificate>list=certificateDao.querycer(res_id);
        return list;
    }
}
