package com.github.ipcam.entity.hikvision;

import com.sun.jna.Structure;

import static com.github.ipcam.entity.comm.StructureContext.MAX_USERNUM_V30;

public class NET_DVR_USER_V30 extends Structure {

    /**
     * Structure size
     */
    public int dwSize;

    public NET_DVR_USER_INFO_V30[] struUser = new NET_DVR_USER_INFO_V30[MAX_USERNUM_V30];

}