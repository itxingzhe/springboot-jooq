package cn.personal.jooq.config;

import com.qiniu.common.Zone;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import javax.servlet.MultipartConfigElement;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 七牛oss配置类
 */
@Configuration
public class QiniuConfig {

  public static String ACCESS_KEY = "6mhJMasP5ltZsrh85n3V6bfpj4ZPsNKFsZJiLwmt";
  public static String SECRET_KEY = "i_HBZDX5ZwsBCzDJWzxbu55afbE6zW67GhOFuKTN";
  public static String BUCKET = "qqsk";
  //返回前端的url的前缀  https://image.qqsk.com/
  public static String IMAGE_URL_PREFIX = "https://image.qqsk.com/";
  //静态文件存储空间
  public static String BUCKET_STATIC = "qqskstatic";
  //静态文件访问默认域名
  public static final String STATIC_URL_PREFIX = "https://static.qqsk.com/";
  //临时文件存储空间
  public static String BUCKET_TEMP = "qqsk_temp";
  //临时文件访问默认域名
  public static String TEMP_URL_PREFIX = "http://temp.qqsk.com/";


  @Bean
  public UploadManager getuploadmanager() {
    com.qiniu.storage.Configuration cfg = new com.qiniu.storage.Configuration(Zone.zone0());
    //...其他参数参考类注释
    UploadManager uploadManager = new UploadManager(cfg);
    return uploadManager;
  }

  @Bean
  public MultipartConfigElement multipartConfigElement() {
    MultipartConfigFactory factory = new MultipartConfigFactory();
    factory.setMaxFileSize("20MB");
    factory.setMaxRequestSize("20MB");
    return factory.createMultipartConfig();
  }

  /**
   * 获取上传凭证
   */
  public static String getUpToken() {
    Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
    return auth.uploadToken(BUCKET);
  }

  /**
   * 获取上传凭证
   */
  public static String getUpToken(String bucket) {
    Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
    return auth.uploadToken(bucket);
  }

  @Bean
  public BucketManager getBucketManager() {
    com.qiniu.storage.Configuration cfg = new com.qiniu.storage.Configuration(Zone.zone0());
    //...其他参数参考类注释
    Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
    auth.uploadToken(BUCKET_TEMP);
    BucketManager bucketManager = new BucketManager(auth, cfg);
    return bucketManager;
  }

}
