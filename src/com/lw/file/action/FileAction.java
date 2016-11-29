package com.lw.file.action;

import java.io.File;

import org.apache.struts2.ServletActionContext;

import com.lw.file.bean.Ftp;
import com.lw.file.utils.FtpUtil;
import com.opensymphony.xwork2.ActionSupport;
/**
 * ���⣺�ϴ��ļ�����ognl.MethodFailedException: Method  failed for object
 * û�и�form����������:enctype="multipart/form-data"����ʾ�ļ��ύ�������Ƕ����Ƶģ����ԺܺõĴ�����Ƭ
 * �ϴ��ļ�ʹ��post����Ч
 * @author lw
 *
 */
public class FileAction extends ActionSupport {
	
	//��������ǰ̨�ļ�
	/**
	 *  �������ֶ�һ�����ʹ��
	 */
	private File uploadFile ;
	//�������Ҫ�ģ����û�����޷���ȡ�ļ���
	private String  uploadFileContentType ;
	
	private String uploadFileFileName ;
	//�����ڱ��ص��ļ�����·��
	private String sourceFilePath ;
	
	public String upload() throws Exception {
		System.out.println("uploadFileName:" + uploadFileFileName );
		System.out.println("uploadFile:" + uploadFile);
		System.out.println("uploadFileContentType:" + uploadFileContentType);
		System.out.println("��������·����" + sourceFilePath );
		//����ftp��Ϣ
		Ftp uploadFtp=new Ftp();
		uploadFtp.setIpAddr("169.254.100.147");
		uploadFtp.setUserName("test1");
		uploadFtp.setPwd("test1");
		uploadFtp.setPath("/upload");
		if(FtpUtil.connectFtp(uploadFtp)){
			//���ӳɹ�
			uploadFile = new File(sourceFilePath);
			//�ϴ��ļ�
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
