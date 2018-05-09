package gdzc.common.upload.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("common")
public class Upload {
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	public String fileUpload(MultipartHttpServletRequest request,HttpServletResponse response){
		MultiValueMap<String,MultipartFile> map=request.getMultiFileMap();
		for(List<MultipartFile> files: map.values()){
			for(MultipartFile file:files){
				String filepath=request.getSession().getServletContext().getRealPath("");
				try {
					file.transferTo(new File(filepath));
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return "success";
	}
}
