package com.example.Annotations.embeddable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/embeddable")
public class PsaInfoController {

    @Autowired
    private PsaInfoRepository prepo;

    @PostMapping("/save")
    public ResponseEntity<?> addData(@RequestBody PsaInfo psaInfo, @RequestParam String cName, @RequestParam int cId){

        Certificate certificate=new Certificate();
        certificate.setCerti_id(cId);
        certificate.setCerti_name(cName);

        psaInfo.setCertificate(certificate);
        PsaInfo savedEntity = prepo.save(psaInfo);

        return new ResponseEntity<>(savedEntity, HttpStatus.OK);
    }
}
