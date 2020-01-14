package me.zhengjie.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 全局配置类
 */
@Component
@ConfigurationProperties(prefix = "rzqh")
public class Global {

    /**
     * 上传根路径
     */
    private static String fileRootPath;
    private static long fileMaxSize;
    private static long avatarMaxSize;
    /**
     * 资源映射路径 前缀
     */
    public static final String RESOURCE_PREFIX = "/profile";

    public static String getFileRootPath() {
        return fileRootPath;
    }

    public void setFileRootPath(String fileRootPath) {
        Global.fileRootPath = fileRootPath;
    }

    /**
     * 获取头像上传路径
     */
    public static String getAvatarPath() {
        return getFileRootPath() + "/avatar";
    }

    /**
     * 获取下载路径
     */
    public static String getDownloadPath() {
        return getFileRootPath() + "/download/";
    }

    /**
     * 获取上传路径
     */
    public static String getUploadPath() {
        return getFileRootPath() + "/upload";
    }

    /**
     * 附件最大上传（MB）
     */
    public static long getFileMaxSize() {
        return fileMaxSize;
    }

    public static void setFileMaxSize(long fileMaxSize) {
        Global.fileMaxSize = fileMaxSize;
    }

    public static long getAvatarMaxSize() {
        return avatarMaxSize;
    }

    public static void setAvatarMaxSize(long avatarMaxSize) {
        Global.avatarMaxSize = avatarMaxSize;
    }
}
