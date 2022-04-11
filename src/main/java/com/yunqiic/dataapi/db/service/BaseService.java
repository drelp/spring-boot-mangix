package com.yunqiic.dataapi.db.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Service
public class BaseService {
    // status
    public final static Byte STATUS_DEL = -1;               //删除
    public final static Byte STATUS_INIT = 0;               //INIT
    public final static Byte STATUS_OK = 1;                 //正常

    public final static Byte YES = 1;              //yes
    public final static Byte NO = 0;               //no

    //读取状态
    //审计状态

    public final static int AUDIT_CODE_OK = 100; //ok
    public final static int AUDIT_CODE_TIME_POS_ERROR = 101; //时间地点异常

    private final Log logger = LogFactory.getLog(BaseService.class);

    /**
     * 获取精确到秒的时间戳
     *
     * @return int
     */
    public static long getSecondTimestamp(Date date) {
        if (null == date) {
            return 0;
        }
        String timestamp = String.valueOf(date.getTime());
        int length = timestamp.length();
        if (length > 3) {
            return Long.valueOf(timestamp.substring(0, length - 3));
        } else {
            return 0;
        }
    }

    public static String getLocalDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());

        return formatter.format(date);
    }

    public static String getLocalDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return formatter.format(date);
    }

    public static String getRandom(int num) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static String toJson(Object data) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(data);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
