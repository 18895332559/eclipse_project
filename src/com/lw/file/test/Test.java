package com.lw.file.test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

public class Test {

    private FTPClient ftp;
    
    /**
     * @param path     上传到ftp服务器哪个路径下
     * @param addr     地址
     * @param port     端口号
     * @param username 用户名
     * @param password 密码
     * @return
     * @throws Exception
     */
    private boolean connect(String path, String addr, int port, String username, String password) throws Exception {
        boolean result = false;
        ftp = new FTPClient();
        int reply;
        //连接Ftp服务器,默认使用21号端口,不写也行
        ftp.connect(addr, port);
        //开始登陆
        boolean isLoginSuccess = ftp.login(username, password);
        System.out.println("isLoginSuccess:" + isLoginSuccess );
        //设置为二进制数据
        ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
        reply = ftp.getReplyCode();
        if (!FTPReply.isPositiveCompletion(reply)) {
            ftp.disconnect();
            return result;
        }
        ftp.changeWorkingDirectory(path);
        return true;
    }

    /**
     * @param file 上传的文件或文件夹
     * @throws Exception
     */
    private void upload(File file) throws Exception {
        if (file.isDirectory()) {
            ftp.makeDirectory(file.getName());
            ftp.changeWorkingDirectory(file.getName());
            String[] files = file.list();
            for (int i = 0; i < files.length; i++) {
                File file1 = new File(file.getPath() + "\\" + files[i]);
                if (file1.isDirectory()) {
                    upload(file1);
                    ftp.changeToParentDirectory();
                } else {
                    File file2 = new File(file.getPath() + "\\" + files[i]);
                    FileInputStream input = new FileInputStream(file2);
                    ftp.storeFile(file2.getName(), input);
                    input.close();
                }
            }
        } else {
            File file2 = new File(file.getPath());
            FileInputStream input = new FileInputStream(file2);
            boolean storeFile = ftp.storeFile(new String(file2.getName().getBytes("utf-8"),"iso-8859-1"), input);
            System.out.println("storeFile:" + storeFile);
            input.close();
        }
    }

    public static void main(String[] args) throws Exception {
        Test t = new Test();
        t.connect("/ftp", "169.254.100.147", 21, "test1", "test1");
        File file = new File("D://1.txt");
        t.upload(file);
//        System.out.println("ok");

    }
}  