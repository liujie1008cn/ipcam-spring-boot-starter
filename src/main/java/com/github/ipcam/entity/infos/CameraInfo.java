package com.github.ipcam.entity.infos;

import com.github.ipcam.support.CameraSupportedDriver;
import lombok.Data;

/**
 * CameraInfo
 *
 * @author echils
 */
@Data
public class CameraInfo {

    /**
     * The ip of the camera
     */
    private String ip;

    /**
     * The name of the camera
     */
    private String name;

    /**
     * The modelNo of the camera
     */
    private String modelNo;

    /**
     * The serialNo of the camera
     */
    private String serialNo;

    /**
     * The username of the camera
     */
    private String username;

    /**
     * The password of the camera
     */
    private String password;

    /**
     * The manufacturer of the camera
     */
    private CameraSupportedDriver manufacturer;

}
