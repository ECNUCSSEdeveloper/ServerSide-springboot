package com.tia.springbootserver.controller;


import com.tia.springbootserver.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class MatchController {

    @Autowired
    private MatchService matchService;


    @GetMapping(value = "/tia/typedMatch",produces = {"application/json;charset=UTF-8"})
    public Object getMatchByTyped(String matchType)
    {
        return matchService.findMatchByType(matchType);
    }

    @GetMapping(value = "/tia/match",produces = {"application/json;charset=UTF-8"})
    public Object getMatch(HttpServletRequest request)
    {
        //
        String pageNumString = request.getParameter("pageNum");
        String pageSizeString = request.getParameter("pageSize");
        Integer pageNum = pageNumString!=null ? Integer.parseInt(pageNumString) : 1 ;
        Integer pageSize = pageSizeString!=null ? Integer.parseInt(pageSizeString) : 10 ;
        //
        String selectAllString = request.getParameter("selectAll");
        //
        String matchIdString = request.getParameter("matchId");
        String matchNameString = request.getParameter("matchName");
        // is on Page
        String onPageString = request.getParameter("onPage");
        //
        if(selectAllString!=null) {
            if (onPageString!=null)
                return matchService.findAllMatch(pageNum, pageSize);
            else
                return matchService.findAllMatchNotOnPage();
        }
        else if(matchIdString!=null)
            return matchService.getMatchById(Integer.parseInt(matchIdString));
        else if(matchNameString!=null) {
            if (onPageString!=null)
                return matchService.findMatchByName(matchNameString, pageNum, pageSize);
            else
                return matchService.findMatchByNameNotOnPage(matchNameString);
        }
        else
            return matchService.getMatchById(-1);
    }
//
//    @GetMapping(value = "/tia/match/image", produces = MediaType.IMAGE_JPEG_VALUE)
//    public void getImage(HttpServletResponse response) throws IOException {
//
//        ClassPathResource imgFile = new ClassPathResource("image/sid.jpg");
//
//        response.setContentType(MediaType.IMAGE_JPEG_VALUE);
//        StreamUtils.copy(imgFile.getInputStream(), response.getOutputStream());
//    }

    @GetMapping(value = "/tia/match/image/{imageId}", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<byte[]> getImage(@PathVariable String imageId) throws IOException {
        ClassPathResource imgFile = new ClassPathResource("image/"+imageId+".jpg");
        byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(bytes);
    }



}
