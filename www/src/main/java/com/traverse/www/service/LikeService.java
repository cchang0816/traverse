package com.traverse.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traverse.www.model.LikeDAO;
import com.traverse.www.vo.LikeVO;

import jakarta.servlet.http.HttpSession;


@Service
public class LikeService {
   
   @Autowired
   private LikeDAO dao;
   
   
   public List<LikeVO> getboards(String usernick) {
      return dao.selectAll(usernick);
   }

}
