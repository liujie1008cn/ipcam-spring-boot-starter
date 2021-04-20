package com.github.ipcam.entity.hikvision;

import com.github.ipcam.entity.comm.StructureContext;
import com.sun.jna.Structure;

/**
 * NET_DVR_IPDEVINFO
 *
 * @author echils
 * @since 2020-03-19 13:42
 */
public class NET_DVR_IPDEVINFO extends Structure {

    public int dwEnable;

    public byte[] sUserName = new byte[StructureContext.NAME_LEN];

    public byte[] sPassword = new byte[StructureContext.PASSWORD_LENGTH];

    public NET_DVR_IPADDR struIP = new NET_DVR_IPADDR();

    public short wDVRPort;

    public byte[] byres = new byte[34];

}
