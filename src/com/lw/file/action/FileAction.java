package com.lw.file.action;

import java.io.File;

import org.apache.struts2.ServletActionContext;

import com.lw.file.bean.Ftp;
import com.lw.file.utils.FtpUtil;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 问题：上传文件报错：ognl.MethodFailedException: Method  failed for object
 * 没有给form表单设置属性:enctype="multipart/form-data"：表示文件提交的内容是二进制的，可以很好的处理照片
 * 上传文件使用post更高效
 * @author lw
 *
 */
public class FileAction extends ActionSupport {
	
	//接收来自前台文件
	/**
	 *  这三个字段一起搭配使用
	 */
	private File uploadFile ;
	//这个必须要的，如果没有则无法获取文件名
	private String  uploadFileContentType ;
	
	private String uploadFileFileName ;
	//保存在本地的文件所在路径
	private String sourceFilePath ;
	
	public String upload() throws Exception {
		System.out.println("uploadFileName:" + uploadFileFileName );
		System.out.println("uploadFile:" + uploadFile);
		System.out.println("uploadFileContentType:" + uploadFileContentType);
		System.out.println("本地所在路径：" + sourceFilePath );
		//创建ftp信息
		Ftp uploadFtp=new Ftp();
		uploadFtp.setIpAddr("169.254.100.147");
		uploadFtp.setUserName("test1");
		uploadFtp.setPwd("test1");
		uploadFtp.setPath("/upload");
		if(FtpUtil.connectFtp(uploadFtp)){
			//连接成功
			uploadFile = new File(sourceFilePath);
			//上传文件
			FtpUtil.upload(uploadFile);
		}
		return "uploadSuccess";
	}
	
	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public String getUploadFileContentType() {
		return uploadFileContentType;
	}

	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

	public String getSourceFilePath() {
		return sourceFilePath;
	}

	public void setSourceFilePath(String sourceFilePath) {
		this.sourceFilePath = sourceFilePath;
	}
	
}
