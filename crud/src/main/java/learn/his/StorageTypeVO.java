package learn.his;

import lombok.Data;

/**
 * @author 张澎_9970
 * @date 2021.5.19 下午 2:54 星期三
 * @desc: 药房药库_类型
 */
public interface StorageTypeVO {
    enum PatientType {
        // 门诊
        OUTP_PATIENT,
        // 住院
        HOSPITALIZATION,
        // 未知
        UNKNOWN
    }
}
