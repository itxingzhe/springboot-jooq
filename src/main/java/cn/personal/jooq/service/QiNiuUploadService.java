package cn.personal.jooq.service;

import cn.personal.jooq.config.QiniuConfig;
import com.google.gson.Gson;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;


@Service
public class QiNiuUploadService {

  private static final Logger log = LoggerFactory.getLogger(QiNiuUploadService.class);

  public static String WX_MIN_APP_PATH = "wxminapp/"; //上传到七牛后保存的目录
  public static final String WX_SHARE_QR_PATH = "wx_share_qr";

  public String uploadStaticFile(String filePath, String path, String fileName) {
    try {
      path = !StringUtils.isEmpty(path) ? path : WX_MIN_APP_PATH;
      fileName = !StringUtils.isEmpty(fileName) ? fileName : System.currentTimeMillis() + "";
      String key = path + fileName + filePath.substring(filePath.lastIndexOf("."));
      //处理上传七牛云
      String upToken = QiniuConfig.getUpToken(QiniuConfig.BUCKET_STATIC);
      com.qiniu.storage.Configuration cfg = new com.qiniu.storage.Configuration(Zone.zone0());
      UploadManager uploadManager = new UploadManager(cfg);
      Response response = uploadManager.put(filePath, key, upToken);
      //解析上传成功的结果
      DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
      String imgUrl = QiniuConfig.STATIC_URL_PREFIX + putRet.key;
      return imgUrl;
    } catch (Exception e) {
      log.error("图片上传七牛报错：" + e.getMessage());
    }
    return null;
  }

  public String uploadTempFile(String filePath, String path, String fileName) {
    try {
      path = !StringUtils.isEmpty(path) ? path : WX_MIN_APP_PATH;
      fileName = !StringUtils.isEmpty(fileName) ? fileName : System.currentTimeMillis() + "";
      String key = path + fileName + filePath.substring(filePath.lastIndexOf("."));
      //处理上传七牛云
      String upToken = QiniuConfig.getUpToken(QiniuConfig.BUCKET_TEMP);
      com.qiniu.storage.Configuration cfg = new com.qiniu.storage.Configuration(Zone.zone2());
      UploadManager uploadManager = new UploadManager(cfg);
      Response response = uploadManager.put(filePath, key, upToken);
      //解析上传成功的结果
      DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
      String imgUrl = QiniuConfig.TEMP_URL_PREFIX + putRet.key;
      return imgUrl;
    } catch (Exception e) {
      log.error("图片上传七牛报错：" + e.getMessage());
    }
    return null;
  }
}
